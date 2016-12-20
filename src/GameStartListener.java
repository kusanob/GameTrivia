import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameStartListener implements ActionListener{
	private JFrame jf;
	
	public GameStartListener(JFrame ojf){
		jf=ojf;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand()=="Start"){
			JPanel a = GameView.createGamePanel(jf);
			jf.setContentPane(a);
			jf.revalidate();
		}
		
		
	}

}
