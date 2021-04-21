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

public class ChapterOneJListListener {
//Below, wrapping the info strings with html tags causes the JPanel to wrap text, otherwise it will not wrap and will display 
//'...' when the text pixel length is larger than the width of the JPanel
	public static void addListener(JList<String> list, JLabel image, JLabel text) {
		ListSelectionListener listSelectionListener = new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent listSelectionEvent) {
				if (!listSelectionEvent.getValueIsAdjusting()) {
					// Casting JList<String> to event.getsource is something eclipse hated so yeah
					@SuppressWarnings("unchecked")
					JList<String> list = (JList<String>) listSelectionEvent.getSource();
					Object selectionValue = list.getSelectedValue();
					if (selectionValue.getClass().getName().equals("java.lang.String")) {
						try {
							switch ((String) selectionValue) {
							case "Introduction":
								image.setIcon(null);
								text.setText(Info.getChapterOneIntro());
								break;
							case "1.2":
								image.setIcon(new ImageIcon(ImageIO.read(new File(StatsGraphs.getChapterOneTwo()))));
								text.setText(Info.getChapterOneTwo());
								break;
							case "1.3":
								image.setIcon(new ImageIcon(ImageIO.read(new File(StatsGraphs.getChapterOneThree()))));
								text.setText(Info.getChapterOneThree());
								break;
							case "Summary":
								image.setIcon(null);
								text.setText(Info.getChapterOneSummary());
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