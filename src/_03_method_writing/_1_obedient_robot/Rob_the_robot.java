package _03_method_writing._1_obedient_robot;
import org.jointheleague.graphical.robot.Robot;
public class Rob_the_robot {

	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.penDown();
		drawSquare(rob);
		drawTriangle(rob);
		
	}
	public static void drawSquare(Robot r) {
		for(int i = 1; i <= 4; i++) {
			r.setSpeed(50);
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
	}
}
