import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GameListener implements ActionListener{

	private TriviaStrategy gm;
	private JTextField ot;
	private JFrame jf;
	
	public GameListener(TriviaStrategy ourGame, JTextField ourText, JFrame oj){
		gm = ourGame;
		ot = ourText;
		jf = oj;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(gm.answerQuestion(ot.getText())){
			if(gm.isFinished()){
				JPanel a = GameView.createWinPanel();
				jf.setContentPane(a);
				jf.revalidate();
				return;
			}
			gm.setNextQuestion();
			ot.setText("");
		}
	}


}