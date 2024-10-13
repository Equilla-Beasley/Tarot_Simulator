package EquillaBeasley.Tarot_Simulator;

import java.awt.*;
import javax.swing.*;

/**
 * This class handles the creation of the window
 * that the simulation will be played on.
 * 
 * @author Equilla Beasley Jr.
 *
 */

public class SimulatorWindow {
	
	/**
	 * This function creates the window that will
	 * contain the Tarot Simulation.
	 */
	public static void createWindow() {
		/*
		 * Creates a frame for this window and saves the
		 * content pane as its own object for clearer
		 * code later.
		 */
		JFrame frame = new JFrame("Tarot Simulator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets the program to end once the window is exited.
		Container contentPane = frame.getContentPane();
		
		//Creates a Label and adds it to the content pane #TEST#
		JLabel textLabel = new JLabel("Testing...",SwingConstants.CENTER);
		textLabel.setPreferredSize(new Dimension(200,200));
		contentPane.add(textLabel, BorderLayout.CENTER);
		
		//Displays the window
		frame.setLocationRelativeTo(null);
		frame.pack();
		frame.setVisible(true);
	}
	
}
