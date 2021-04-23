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
						try {
							switch ((String) selectionValue) {
							case "Introduction":
								image.setIcon(null);
								text.setText(Info.getChapterTwoIntro());
								break;
							case "2.3":
								image.setIcon(new ImageIcon(ImageIO.read(new File(StatsGraphs.getChapterTwoThree()))));
								text.setText(Info.getChapterTwoThree());
								break;
							case "2.4":
								image.setIcon(new ImageIcon(ImageIO.read(new File(StatsGraphs.getChapterTwoFour()))));
								text.setText(Info.getChapterTwoFour());
								break;
							case "2.5":
								image.setIcon(new ImageIcon(ImageIO.read(new File(StatsGraphs.getChapterTwoFive()))));
								text.setText(Info.getChapterTwoFive());
								break;
							case "2.6":
								image.setIcon(new ImageIcon(ImageIO.read(new File(StatsGraphs.getChapterTwoSix()))));
								text.setText(Info.getChapterTwoSix());
								break;
							case "2.7":
								image.setIcon(new ImageIcon(ImageIO.read(new File(StatsGraphs.getChapterTwoSeven()))));
								text.setText(Info.getChapterTwoSeven());
								break;
							case "2.8":
								image.setIcon(new ImageIcon(ImageIO.read(new File(StatsGraphs.getChapterTwoEight()))));
								text.setText(Info.getChapterTwoEight());
								break;
							case "2.9":
								image.setIcon(new ImageIcon(ImageIO.read(new File(StatsGraphs.getChapterTwoNine()))));
								text.setText(Info.getChapterTwoNine());
								break;
							case "2.10":
								image.setIcon(new ImageIcon(ImageIO.read(new File(StatsGraphs.getChapterTwoTen()))));
								text.setText(Info.getChapterTwoTen());
								break;
							case "Summary":
								image.setIcon(null);
								text.setText(Info.getChapterTwoSummary());
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
