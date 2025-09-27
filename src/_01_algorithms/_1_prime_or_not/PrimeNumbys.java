package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeNumbys {

	public static void main(String[] args) {
		String numby1 = JOptionPane.showInputDialog("pls numby, i begging u");
		int numby = Integer.parseInt(numby1);
		for(int i = 2; i < numby; i++) {
			if(numby % i == 0) {
				JOptionPane.showMessageDialog(null, "numby isn't pwime :(");
				System.exit(0);
			}
			
				
		}
		JOptionPane.showMessageDialog(null, "wow, numby is pwime, yippee!");
	}

}
