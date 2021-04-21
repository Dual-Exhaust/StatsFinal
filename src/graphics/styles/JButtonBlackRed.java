package graphics.styles;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class JButtonBlackRed extends JButton {

	public JButtonBlackRed() {
		super();
		this.setBaseSettings();
	}

	public JButtonBlackRed(Action a) {
		super(a);
		this.setBaseSettings();
	}

	public JButtonBlackRed(Icon icon) {
		super(icon);
		this.setBaseSettings();
	}

	public JButtonBlackRed(String text, Icon icon) {
		super(text, icon);
		this.setBaseSettings();
	}

	public JButtonBlackRed(String text) {
		super(text);
		this.setBaseSettings();
	}

	private void setBaseSettings() {
		this.setBorderPainted(false);
		this.setFocusPainted(false);
		this.setBackground(Color.BLACK);
		this.setForeground(Color.RED);
		this.setPreferredSize(new Dimension(170, 56));

		this.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				setBackground(Color.RED);
				setForeground(Color.BLACK);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				setBackground(Color.BLACK);
				setForeground(Color.RED);
			}
		});

	}

	private static final long serialVersionUID = 1L;

}
