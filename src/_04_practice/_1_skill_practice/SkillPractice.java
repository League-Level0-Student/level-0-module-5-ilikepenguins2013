package _04_practice._1_skill_practice;

import javax.swing.JOptionPane;
import java.util.Random;

public class SkillPractice {
public static void main(String[] args) {

SkillPractice skills = new SkillPractice();
           skills.skill1();
           skills.skill2();
           skills.skill3();
           skills.skill4();
           skills.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
String dime = JOptionPane.showInputDialog("how many dimes do you have");
int dimes = Integer.parseInt(dime);

// Tell them how many cents they have (hint multiply by 10)
JOptionPane.showMessageDialog(null, "you have " + dimes * 10 + "\u00A2");



// Ask the user how tall they are (inches)
String height = JOptionPane.showInputDialog("how tall are u in inches");
int heights = Integer.parseInt(height);

JOptionPane.showMessageDialog(null,  "you are " + heights + " inches tall");



// If they are shorter than 36 inches, tell them to eat their Wheaties
if(heights < 36) {
	JOptionPane.showMessageDialog(null, "you should eat ur wheaties");
}



}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console
for(int i = 1; i <= 30; i+=3) {
	System.out.println(i);
}






}

void skill3() { // Get a random number that is less than 20 and print it to the console
Random rando = new Random();
int i = rando.nextInt(20);
System.out.println(i);

// Get another random number that is less than 10 and print it to the console
int j= rando.nextInt(10);
System.out.println(j);
// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction
JOptionPane.showMessageDialog(null, i-j);


}

void skill4() { // In a pop-up, ask the user for the city they live in
String city = JOptionPane.showInputDialog("what city do t you live in?");


// If they answered "San Diego", tell them they live in America's Finest City
if(city.equalsIgnoreCase("san diego")) {
	JOptionPane.showMessageDialog(null,  "you live in america's finest city, now go have a happy life");
}


// Otherwise, tell them to move to San Diego
else {
	JOptionPane.showMessageDialog(null, "go move to san diego right now or imma kill you");
}


// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation."
int cars = 3;


// If there is 1 car, use a pop-up to display the make/model of the car



// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them.



}

void skill5() { // In a pop-up, ask the user for the name of their school



// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.



}
}
