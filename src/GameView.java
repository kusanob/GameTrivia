import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;


public class GameView extends JLabel implements Observer{
	private TriviaStrategy ts;
	
	public GameView(){}
	
	public GameView(TriviaStrategy ots){
		ts=ots;
		this.setText(ts.getQuestion());
	}
	
	
	public JPanel createGamePanel(JFrame jf, TriviaStrategy ots){
		ts=ots;
		
		GameView gv = new GameView(ts);
		ts.addObserver(gv);
		
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(0,1));
		
		JButton jb = new JButton("Enter");
		
		JTextField jt = new JTextField(10);
		
		GameListener gl = new GameListener(ts, jt, jf);
		jb.addActionListener(gl);
		jf.getRootPane().setDefaultButton(jb);
		jp.add(gv); 
		jp.add(jt);
		jp.add(jb);
		return jp;
	}
	
	public static JPanel createWinPanel(){
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(2,1));
		JLabel jl = new JLabel("You won!");
		jl.setHorizontalAlignment(CENTER);
		jp.add(jl);
		return jp;
	}
	
	
	public static void createandshowgui(){
		JFrame jf = new JFrame("Game one!");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.getContentPane().setLayout(new GridLayout(0,1));
		jf.setSize(300, 125);

		JPanel startMenu = new JPanel();
		startMenu.setLayout(new GridLayout(2, 1));
		
		GameView gv = new GameView();
		JButton america = new JButton("America");
		JButton canada = new JButton("Canada");
		
		GameStartListener gsl = new GameStartListener(jf, gv);
		
		startMenu.add(america);
		america.addActionListener(gsl);
		startMenu.add(canada);
		canada.addActionListener(gsl);
		
		jf.add(startMenu);
		jf.setVisible(true);
	}
	
	
	public static void main(String [] args){
				javax.swing.SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						createandshowgui();
					}
				});
	}

	
	@Override
	public void update(Observable arg0, Object arg1) {
		TriviaStrategy gm = (TriviaStrategy)arg0;
		this.setText(gm.getQuestion());		
	}

	
}