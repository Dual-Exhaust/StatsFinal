package listeners;

import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import info.Info;

public class ChapterFourJListListener {

	public static void addListener(JList<String> list, JLabel image, JLabel text) {
		ListSelectionListener listSelectionListener = new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent listSelectionEvent) {
				if (!listSelectionEvent.getValueIsAdjusting()) {
					@SuppressWarnings("unchecked")
					JList<String> list = (JList<String>) listSelectionEvent.getSource();
					Object selectionValue = list.getSelectedValue();
					if (selectionValue.getClass().getName().equals("java.lang.String")) {
						try {
							switch ((String) selectionValue) {
							case "Introduction":
								image.setIcon(null);
								text.setText(Info.getChapterFourIntro());
								break;
							case "4.2":
								image.setIcon(null /*
													 * new ImageIcon(ImageIO.read(new
													 * File(StatsGraphs.getChapterFourTwo())))
													 */);
								text.setText(Info.getChapterFourFour());
								break;
							case "4.3":
								image.setIcon(
										null/*
											 * new ImageIcon(ImageIO.read(new File(StatsGraphs.getChapterFourThree())))
											 */);
								text.setText(Info.getChapterFourFour());
								break;
							case "4.4":
								image.setIcon(null /*
													 * new ImageIcon(ImageIO.read(new
													 * File(StatsGraphs.getChapterFourFour())))
													 */);
								text.setText(Info.getChapterFourFour());
								break;
							case "Summary":
								image.setIcon(null);
								text.setText(Info.getChapterFourSummary());
								break;
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
		};
		list.addListSelectionListener(listSelectionListener);
	}

}
