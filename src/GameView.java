import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;


public class GameView extends JLabel implements Observer{
	private GameModel gm;
		
	public GameView(GameModel ourGame){
		gm = ourGame;
		this.setText(gm.getQuestion());
	}
	
	public static JPanel createGamePanel(JFrame jf){
		GameModel gm = new GameModel();
		
		GameView gv = new GameView(gm);
		gm.addObserver(gv);
		
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(0,1));
		
		JButton jb = new JButton("Enter");
		
		JTextField jt = new JTextField(10);
		
		GameListener gl = new GameListener(gm, jt, jf);
		jb.addActionListener(gl);
		jf.getRootPane().setDefaultButton(jb);
		jp.add(gv); 
		jp.add(jt);
		jp.add(jb);
		return jp;
	}
	
	public static JPanel createWinPanel(){
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(0,1));
		JLabel jl = new JLabel("You won!");
		jp.add(jl);
		return jp;
	}
	
	
	public static void createandshowgui(){
		JFrame jf = new JFrame("Game one!");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.getContentPane().setLayout(new GridLayout(0,1));
		jf.setSize(300, 125);

		JPanel startMenu = new JPanel();
		startMenu.setLayout(new GridLayout(0, 2));
		
		JButton startButton = new JButton("Start");
		
		GameStartListener gsl = new GameStartListener(jf);
		
		startMenu.add(startButton);
		startButton.addActionListener(gsl);
//		GameModel gm = new GameModel();
//		
//		GameView gv = new GameView(gm);
//		gm.addObserver(gv);
//		
//		JPanel jp = new JPanel();
//		jp.setLayout(new GridLayout(0,1));
//		
//		JButton jb = new JButton("Enter");
//		
//		JTextField jt = new JTextField(10);
//		
//		GameListener gl = new GameListener(gm, jt, jf, gv);
//		jb.addActionListener(gl);
//		jf.getRootPane().setDefaultButton(jb);
//		jp.add(gv); 
//		jp.add(jt);
//		jp.add(jb);
		jf.add(startMenu);
		jf.setVisible(true);
	}
	
	
	public static void main(String [] args){
		// Schedule a job for the event-dispatching thread:
				// creating and showing this application's GUI.
				javax.swing.SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						createandshowgui();
						
					}
				});
	}

	
	@Override
	public void update(Observable arg0, Object arg1) {
		GameModel gm = (GameModel)arg0;
		this.setText(gm.getQuestion());		
	}

	
}