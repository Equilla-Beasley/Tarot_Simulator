package EquillaBeasley.Tarot_Simulator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;


/**
 * This file is used as a test location for GUI related purposes.
 * This file can be run on its own.
 * @author Equilla Beasley Jr.
 *
 */
public class testFrame extends JFrame {

	private JPanel contentPane;
	private final Action action = new SpawnFool();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testFrame frame = new testFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public testFrame() {
		setTitle("testing GUI Functionality");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(208, 100, 244));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JButton testButton = new JButton("Press for Tarot");
		testButton.setAction(action);
		contentPane.add(testButton);
		
	}

	//Actions
	private class SpawnFool extends AbstractAction {
		public SpawnFool() {
			putValue(NAME, "SpawnFool");
			putValue(SHORT_DESCRIPTION, "Spawns The Fool tarot card");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
