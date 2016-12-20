import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameListener implements ActionListener{

	private GameModel gm;
	private JTextField ot;
	private JFrame jf;
	private GameView gv;
	
	public GameListener(GameModel ourGame, JTextField ourText, JFrame oj, GameView ogv){
		gm = ourGame;
		ot = ourText;
		jf = oj;
		gv = ogv;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(gm.answerQuestion(ot.getText())){
			if(gm.isFinished(ot.getText())){
				JPanel a = gv.createWinPanel();
				jf.setContentPane(a);
				jf.revalidate();
				return;
			}
			gm.setNextQuestion();
			ot.setText("");
		}
	}


}