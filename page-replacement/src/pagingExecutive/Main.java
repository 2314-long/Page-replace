package pagingExecutive;

import java.awt.EventQueue;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import org.jvnet.substance.skin.SubstanceCremeLookAndFeel;


public class Main{
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(new SubstanceCremeLookAndFeel());
					JFrame.setDefaultLookAndFeelDecorated(true);
					JDialog.setDefaultLookAndFeelDecorated(true);
				} catch (Exception e) {

					e.printStackTrace();
				}
				try {
					IniFrame iniframe = new IniFrame();
				} catch (Exception e) {

					e.printStackTrace();
				}
			}
		});
	}	
}
