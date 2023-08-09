package tempPack;

import javax.swing.JOptionPane;

public class Temperature {

	public static void main(String[] args) {
		
		while (true) {
			// prompting user for the temperature in fahrenheit
			String fahrenheit = JOptionPane.showInputDialog("What is the fahrenheit temperature?");
			
			if (!fahrenheit.matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, fahrenheit+" is not a valid temperature. Please enter a temperature.");			
			} // if closing look
			else {
				float c = (float) ((Float.parseFloat(fahrenheit) - 32) / 1.8);
				JOptionPane.showMessageDialog(null, "The temperature in celsius is " +c);
				break;
		    } // else closing brace

		} // while closing brace
		
		while (true) {
			// prompting user for the temperature in celsius
			String celsius = JOptionPane.showInputDialog("What is the celsius temperature?");
			
			if ((!celsius.matches("[0-9]+"))) {
				JOptionPane.showMessageDialog(null, celsius+" is not a valid temprature. Please enter a temperature.");
			} // is closing brace
			else {
				float f = (float) ((Float.parseFloat(celsius) * 1.8) + 32);
				JOptionPane.showMessageDialog(null, "The temperature in fahrenheit is " +f);
				break;
			} // else closing brace
		} // while closing brace
		
	} // main closing brace

} // Temperature class closing brace


