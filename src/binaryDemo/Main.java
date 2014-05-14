package binaryDemo;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int number;
		StringBuffer binary = new StringBuffer();
		number = Integer.valueOf(JOptionPane.showInputDialog("Please enter a number"));
		
		while(number > 0){
			binary.append(number % 2);
			number /= 2;
			//System.out.printf("number is %d\n", number);
		}
		binary.reverse();
		JOptionPane.showMessageDialog(null, "Your number in binary is " + binary);
	}

}
