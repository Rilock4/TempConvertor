package tempPack;

import javax.swing.JOptionPane;

public class Temperature {

	public static void main(String[] args) {
		
		while (true) {
			// prompting user for the temperature
			String temp = JOptionPane.showInputDialog("What is the temperature?");
			// checking to see if user input is a number
			if (!temp.matches("[0-9]+")) {
				// if not a number than prompt user for a number
				JOptionPane.showMessageDialog(null, temp+" is not a valid temperature. Please enter a temperature.");			
			} // if closing look
			else {
				float c = (float) ((Float.parseFloat(temp) - 32) / 1.8);
				JOptionPane.showMessageDialog(null, "The temperature in celsius is " +c);
				break;
		    } // else closing brace

		} // while closing brace
		
	} // main closing brace

} // Temperature class closing brace

