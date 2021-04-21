package graphics;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Windows {

	// Main frame the program runs in
	private JFrame index;

	// All the different "screens"
	private JPanel main;
	private JPanel chapter1;
	private JPanel chapter2;
	private JPanel chapter3;
	private JPanel chapter4;
	private JPanel paper;
	private JPanel general;

	// Create the application
	public Windows() {
		initialize();
	}

	// Returns the JFrame for the bootstrap
	public JFrame getIndex() {
		return index;
	}

	/*
	 * Initialize the contents of the frame
	 *
	 *
	 */
	private void initialize() {
		// Setup the program windows functionality
		// ====================================================================================================
		// JFrame instantiation w/ window title = STATS!
		index = new JFrame("STATS!");
		// Default size of the window when not fullscreen
		index.setSize(new Dimension(1200, 800));
		// Makes JFrame fullscreen (can only maximize width or height if wanted)
		index.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// exits program when JFrame gets closed
		index.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Sets the layout manager for the JFrame
		index.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		// ====================================================================================================

		// Screens is an array of JPanels correlating to our different screens for the
		// menu and chapters
		JPanel[] screens = MenuBuilder.buildMenu();
		for (int i = 0; i < screens.length; i++) {
			switch (i) {
			case 0:
				main = screens[i];
			case 1:
				chapter1 = screens[i];
			case 2:
				chapter2 = screens[i];
			case 3:
				chapter3 = screens[i];
			case 4:
				chapter4 = screens[i];
			case 5:
				paper = screens[i];
			case 6:
				general = screens[i];
			}
		}

		// Add the panels to the main JFrame, will not be seen otherwise
		index.getContentPane().add(main);
		index.getContentPane().add(chapter1);
		index.getContentPane().add(chapter2);
		index.getContentPane().add(chapter3);
		index.getContentPane().add(chapter4);
		index.getContentPane().add(paper);
		index.getContentPane().add(general);
	}

}
