// Damain Patterson

package wheelOfFortune;

import javax.swing.UIManager;

public class Driver {

	public static void main(String[] args) {
		
		try {
            // select Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
            
            // start application
            MainInterface windows = new MainInterface();
    		windows.setVisible(true);
		}
        catch (Exception ex) {
            ex.printStackTrace();
        }
	}
}
