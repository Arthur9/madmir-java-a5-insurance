// -------INSTRUCTIONS-------
// 1. Complete the exercise as indicated on the handout for assignment #5
// 2. Then delete these comments
// 3. Finally, commit and push the project containing this file to GitHub

// -------RUBRIC-------
// Functionality								/6
// Methods adhere to program requirements	/5
// Value returned from calculatePremium()	/3
// Coding conventions & comments				/6
import javax.swing.JOptionPane;

public class InsurancePremium {

	public static void main(String[] args) {
		// Declare Variables
		int curYear, birthYear, prem;
		
		//User Inputs
		curYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the current year: "));
		birthYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your birthyear: "));
		
		prem = calculatePremium(curYear, birthYear);
		JOptionPane.showMessageDialog(null, "Your insurance premium is $" + prem);
		
	}
	
	public static int calculatePremium(int cy, int, int by) {
		//Insert body of calculatePremium() method here
		int age = cy-by;
		int decades = age/10;
		int premium = (decades + 15) * 20;
		return premium
	}

}
