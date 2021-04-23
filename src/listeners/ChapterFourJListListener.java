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
								image.setIcon(new ImageIcon(ImageIO.read(new File(StatsGraphs.getChapterFourTwo()))));
								text.setText(Info.getChapterFourTwo());
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
