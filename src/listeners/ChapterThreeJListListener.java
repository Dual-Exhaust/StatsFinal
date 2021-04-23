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

public class ChapterThreeJListListener {

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
								text.setText(Info.getChapterThreeIntro());
								break;
							case "3.2":
								image.setIcon(new ImageIcon(ImageIO.read(new File(StatsGraphs.getChapterThreeTwo()))));
								text.setText(Info.getChapterThreeThree());
								break;
							case "3.3":
								image.setIcon(
										new ImageIcon(ImageIO.read(new File(StatsGraphs.getChapterThreeThree()))));
								text.setText(Info.getChapterThreeThree());
								break;
							case "3.4":
								image.setIcon(new ImageIcon(ImageIO.read(new File(StatsGraphs.getChapterThreeFour()))));
								text.setText(Info.getChapterThreeFour());
								break;
							case "3.5":
								image.setIcon(new ImageIcon(ImageIO.read(new File(StatsGraphs.getChapterThreeFive()))));
								text.setText(Info.getChapterThreeFive());
								break;
							case "3.7":
								image.setIcon(
										new ImageIcon(ImageIO.read(new File(StatsGraphs.getChapterThreeSeven()))));
								text.setText(Info.getChapterThreeSeven());
								break;
							case "3.8":
								image.setIcon(
										new ImageIcon(ImageIO.read(new File(StatsGraphs.getChapterThreeEight()))));
								text.setText(Info.getChapterThreeEight());
								break;
							case "3.11":
								image.setIcon(
										new ImageIcon(ImageIO.read(new File(StatsGraphs.getChapterThreeEleven()))));
								text.setText(Info.getChapterThreeEleven());
								break;
							case "Summary":
								image.setIcon(null);
								text.setText(Info.getChapterThreeSummary());
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
