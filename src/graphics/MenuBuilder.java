package graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import graphics.styles.JButtonBlackRed;
import info.Info;
import listeners.ChapterFourJListListener;
import listeners.ChapterOneJListListener;
import listeners.ChapterThreeJListListener;
import listeners.ChapterTwoJListListener;

public class MenuBuilder {

	// All the different "screens"
	private static JPanel main;
	private static JPanel chapter1;
	private static JPanel chapter2;
	private static JPanel chapter3;
	private static JPanel chapter4;
	private static JPanel paper;
	private static JPanel general;

	// Helper Methods to aid in switching screens easier
	// ====================================================================================================
	// Sets the passed panel to invisible
	public static void setPanelInvis(JPanel panel) {
		panel.setVisible(false);
	}

	// Sets the passed panel to visible
	public static void setPanelVis(JPanel panel) {
		panel.setVisible(true);
	}

	// Makes the main menu panel invisible and sets the passed along panel to
	// visible
	public static void goToChapter(JButtonBlackRed button, JPanel panel) {
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelInvis(main);
				setPanelVis(panel);
			}
		});
	}

	// If called on a button then that button will just bring you back the main menu
	// Add any more created panels to the list of panels that "setPanelInvis" is
	// called on
	public static void backToMenu(JButtonBlackRed button) {
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPanelInvis(chapter1);
				setPanelInvis(chapter2);
				setPanelInvis(chapter3);
				setPanelInvis(chapter4);
				setPanelInvis(general);
				setPanelInvis(paper);
				setPanelVis(main);
			}
		});
	}

	// ====================================================================================================

	// Helper method to create the panels for each chapter
	public static void createChapterPanel(JPanel panel, int chapterNumber, String[] list) {
		panel.setLayout(new BorderLayout(5, 5));
		setPanelInvis(panel);

		// Holds the data for our JList to display
		DefaultListModel<String> modelPanelList = new DefaultListModel<>();
		// JList is initialized with the DefaultListModel
		JList<String> listPanelMenu = new JList<String>(modelPanelList);

		// Add the selections from the chapter to the list
		for (String item : list) {
			modelPanelList.addElement(item);
		}

		// Scrollpane is initialized with the JList and is added to the panel to be
		// displayed
		JScrollPane panePanelMenu = new JScrollPane(listPanelMenu);
		panePanelMenu.setPreferredSize(new Dimension(200, 800));
		panel.add(panePanelMenu, BorderLayout.LINE_START);

		// JLabel to display our output for each selected index in the JList
		JLabel textPanelMenu = new JLabel();
		textPanelMenu.setPreferredSize(new Dimension(1100, 800));
		textPanelMenu.setBorder(BorderFactory.createLineBorder(Color.RED));
		panel.add(textPanelMenu, BorderLayout.CENTER);

		// Button to go back to the main menu
		JButtonBlackRed btnPanelMenu = new JButtonBlackRed("Main Menu");
		backToMenu(btnPanelMenu);
		panel.add(btnPanelMenu, BorderLayout.PAGE_END);

		// JLabel to display our output for each selected index in the JList
		JLabel textPanelMenu2 = new JLabel();
		textPanelMenu2.setPreferredSize(new Dimension(584, 300));
		textPanelMenu2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		panel.add(textPanelMenu2, BorderLayout.LINE_END);

		// Adds a listener to the Jlist to change the Jlabel data every time a new
		// option is selected
		switch (chapterNumber) {
		case 1:
			ChapterOneJListListener.addListener(listPanelMenu, textPanelMenu, textPanelMenu2);
			break;
		case 2:
			ChapterTwoJListListener.addListener(listPanelMenu, textPanelMenu, textPanelMenu2);
			break;
		case 3:
			ChapterThreeJListListener.addListener(listPanelMenu, textPanelMenu, textPanelMenu2);
			break;
		case 4:
			ChapterFourJListListener.addListener(listPanelMenu, textPanelMenu, textPanelMenu2);
			break;
		}

	}

	// Builds the panels that the main menu buttons will navigate to
	public static void buildPanels() {
		// ====================================================================================================
		main = new JPanel();
		main.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setPanelVis(main);
		// ====================================================================================================

		// Chapter 1 Panel
		// ====================================================================================================
		// Initialization
		chapter1 = new JPanel();
		createChapterPanel(chapter1, 1, new String[] { "Introduction", "1.2", "1.3", "Summary" });

		// ====================================================================================================
		// Chapter 2 Panel
		// ====================================================================================================
		// Initialization
		chapter2 = new JPanel();
		createChapterPanel(chapter2, 2,
				new String[] { "Introduction", "2.3", "2.4", "2.5", "2.6", "2.7", "2.8", "2.9", "2.10", "Summary" });
		// ====================================================================================================

		// Chapter 3 Panel
		// ====================================================================================================
		// Initialization
		chapter3 = new JPanel();
		createChapterPanel(chapter3, 3,
				new String[] { "Introduction", "3.2", "3.3", "3.4", "3.5", "3.7", "3.8", "3.11", "Summary" });
		// ====================================================================================================

		// Chapter 4 Panel
		// ====================================================================================================
		// Initialization
		chapter4 = new JPanel();
		createChapterPanel(chapter4, 4, new String[] { "Introduction", "4.2", "Summary" });
		// ====================================================================================================
		// ====================================================================================================

		// Button to include paper
		// ====================================================================================================
		paper = new JPanel();
		paper.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setPanelInvis(paper);

		JLabel findings = new JLabel();
		findings.setPreferredSize(new Dimension(1000, 1000));
		findings.setText(Info.getPaper());
		paper.add(findings);

		// Button to go back to the main menu
		JButtonBlackRed btnPanelMenu = new JButtonBlackRed("Main Menu");
		backToMenu(btnPanelMenu);
		paper.add(btnPanelMenu);
		// ====================================================================================================

		// Creates elements inside our general information tab
		// ====================================================================================================
		general = new JPanel();
		general.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setPanelInvis(general);

		JLabel generalInformation = new JLabel();
		generalInformation.setPreferredSize(new Dimension(500, 500));
		generalInformation.setText("<html>" + Info.getGeneralInfo() + "</html>");
		general.add(generalInformation);

		// Button to go back to the main menu
		JButtonBlackRed btnPanelGeneral = new JButtonBlackRed("Main Menu");
		backToMenu(btnPanelGeneral);
		general.add(btnPanelGeneral);
		// ====================================================================================================

	}

	// Creates the buttons that will navigate to each chapter
	public static JPanel[] buildMenu() {
		// Initializes each panel with their layouts and sets all but the main menu to
		// invisible
		buildPanels();
		// Adds buttons to the main menu panels
		// Main Menu Buttons
		// ====================================================================================================
		// General Information
		JButtonBlackRed btnGeneral = new JButtonBlackRed("General Information");
		goToChapter(btnGeneral, general);
		main.add(btnGeneral);

		// Chapter 1 Button
		JButtonBlackRed btnChapter1 = new JButtonBlackRed("Chapter 1");
		goToChapter(btnChapter1, chapter1);
		main.add(btnChapter1);

		// Chapter 2 Button
		JButtonBlackRed btnChapter2 = new JButtonBlackRed("Chapter 2");
		goToChapter(btnChapter2, chapter2);
		main.add(btnChapter2);

		// Chapter 3 Button
		JButtonBlackRed btnChapter3 = new JButtonBlackRed("Chapter 3");
		goToChapter(btnChapter3, chapter3);
		main.add(btnChapter3);

		// Chapter 4 Button
		JButtonBlackRed btnChapter4 = new JButtonBlackRed("Chapter 4");
		goToChapter(btnChapter4, chapter4);
		main.add(btnChapter4);

		// Paper Button
		JButtonBlackRed btnPaper = new JButtonBlackRed("Findings");
		goToChapter(btnPaper, paper);
		main.add(btnPaper);

		// Exit Button
		JButtonBlackRed btnExit = new JButtonBlackRed("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Close the program
				System.exit(0);
			}
		});
		main.add(btnExit);

		// ====================================================================================================

		return new JPanel[] { main, chapter1, chapter2, chapter3, chapter4, paper, general };
	}
}
