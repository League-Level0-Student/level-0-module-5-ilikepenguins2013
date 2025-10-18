package _03_method_writing._1_obedient_robot;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class Rob_the_robot {

	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.setSpeed(50);
		rob.penDown();
		String shape = JOptionPane.showInputDialog("what shape do you want me to draw");
		if(shape.equalsIgnoreCase("square")) {
			drawSquare(rob);
		}
		else if(shape.equalsIgnoreCase("triangle")) {
			drawTriangle(rob);
		}
		else if(shape.equalsIgnoreCase("circle")) {
			drawCircle(rob);
		}
		
	}
	public static void drawSquare(Robot r) {
		for(int i = 1; i <= 4; i++) {
			r.move(200);
			r.turn(90);
		}
		r.hide();
	}
	public static void drawTriangle(Robot r) {
		r.turn(30);
		for(int i = 1; i <= 3; i++) {
			r.move(200);
			r.turn(120);
		}
		r.hide();
	}
	public static void drawCircle(Robot r) {
		for(int i = 1; i <= 72; i++) {
			r.move(10);
			r.turn(5);
		}
		r.hide();
	}
}
