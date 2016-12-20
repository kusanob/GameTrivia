import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JTextField;

public class GameListener implements ActionListener{

	private GameModel gm;
	private JTextField ot;
	
	public GameListener(GameModel ourGame, JTextField ourText){
		gm = ourGame;
		ot = ourText;

	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(gm.answerQuestion(ot.getText())){
			gm.setNextQuestion();
			ot.setText("");
		}
	}


}