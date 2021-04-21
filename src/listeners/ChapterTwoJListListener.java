package listeners;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import graphics.images.StatsGraphs;
import info.Info;

public class ChapterTwoJListListener {

	public static void addListener(JList<String> list, JLabel image, JLabel text) {
		ListSelectionListener listSelectionListener = new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent listSelectionEvent) {
				if (!listSelectionEvent.getValueIsAdjusting()) {
					@SuppressWarnings("unchecked")
					JList<String> list = (JList<String>) listSelectionEvent.getSource();
					Object selectionValue = list.getSelectedValue();
					if (selectionValue.getClass().getName().equals("java.lang.String")) {
						switch ((String) selectionValue) {
						case "Introduction":
							image.setIcon(null);
							text.setText("<html>" + Info.getChapterTwoIntro() + "</html>");
							break;
						case "2.3":
							try {
								image.setIcon(new ImageIcon(ImageIO.read(new File(StatsGraphs.getChapterTwoThree()))));
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							text.setText("<html>" + Info.getChapterTwoThree() + "</html>");
							break;
						case "2.4":
							image.setIcon(null);
							text.setText("<html>" + Info.getChapterTwoFour() + "</html>");
							break;
						case "2.5":
							image.setIcon(null);
							text.setText("<html>" + Info.getChapterTwoFive() + "</html>");
							break;
						case "2.6":
							image.setIcon(null);
							text.setText("<html>" + Info.getChapterTwoSix() + "</html>");
							break;
						case "Summary":
							image.setIcon(null);
							text.setText("<html>" + Info.getChapterTwoSummary() + "</html>");
							break;
						}
					}
				}
			}
		};
		list.addListSelectionListener(listSelectionListener);
	}

}
