package tempPack;

import javax.swing.JOptionPane;

public class Temperature {

	public static void main(String[] args) {
		String temp = JOptionPane.showInputDialog("What is the Temperature?");
		float c = (float) ((Float.parseFloat(temp) - 32) / 1.8);
		JOptionPane.showMessageDialog(null, "The temperature in celsius is " +c);
	} // main closing brace

} // Temperature class closing brace
