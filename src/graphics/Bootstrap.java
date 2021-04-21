package graphics;

import java.awt.EventQueue;
public class Bootstrap {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//Create a new instance of STATS!
					Windows window = new Windows();
					//Make it visible to the user
					window.getIndex().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
