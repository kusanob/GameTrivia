import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameStartListener implements ActionListener{
	private JFrame jf;
	private GameView gv;
	
	public GameStartListener(JFrame ojf, GameView ogv){
		jf=ojf;
		gv=ogv;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getActionCommand()=="Canada"){
			CanadaStrategy gm = new CanadaStrategy();
			JPanel gamePlayThrough = gv.createGamePanel(jf, gm);
			jf.setContentPane(gamePlayThrough);
			jf.revalidate();
		}
		if(arg0.getActionCommand()=="America"){
			AmericaStrategy as = new AmericaStrategy();
			JPanel gamePlayThrough = gv.createGamePanel(jf, as);
			jf.setContentPane(gamePlayThrough);
			jf.revalidate();
		}
		
		
		
	}

}
