package Tela;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class CheckSumScreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txt;
	private JButton btn;

	public CheckSumScreen() {

		criaTela();

	}

	public void criaTela() {

		setTitle(" EasyCalc Checksum! [HEX]");

		setResizable(false);

		setSize(600, 80);

		Container cp = getContentPane();

		cp.setLayout(null);

		cp.setVisible(true);

		btn = new JButton("Calc!");
		btn.setBounds(515, 10, 70, 30);
		cp.add(btn);

		txt = new JTextField();
		txt.setBounds(5, 10, 500, 30);
		cp.add(txt);

		CenterScreen.CentralizaWindow(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				if (btn.getText().equalsIgnoreCase("Calc!")) {

					if (!txt.getText().equalsIgnoreCase("")) {

						String msg = txt.getText();

						int i = 0;

						String hexa = "";

						for (byte b : msg.getBytes()) {

							i += b;

							hexa = Integer.toHexString(i);

						}

						UIManager.put("OptionPane.messageForeground",
								Color.BLUE);

						JOptionPane.showMessageDialog(null, "Result: " + hexa,
								"Result Calc", JOptionPane.INFORMATION_MESSAGE);

						txt.setEnabled(false);
						btn.setText("Clear!");

					} else {

						UIManager
								.put("OptionPane.messageForeground", Color.RED);

						JOptionPane.showMessageDialog(null,
								"Insert some data!", "ERROR!",
								JOptionPane.WARNING_MESSAGE);

					}

				} else {

					txt.setText("");
					btn.setText("Calc!");
					txt.setEnabled(true);

				}
			}
		});

	}

	public static void main(String[] args) {

		new CheckSumScreen().setVisible(true);
	}

}
