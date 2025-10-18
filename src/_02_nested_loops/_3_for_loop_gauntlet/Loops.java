package _02_nested_loops._3_for_loop_gauntlet;

public class Loops {

	public static void main(String[] args) {
		/*for(int i = 2013; i <= 2025; i++) {
			System.out.println("in " + i + " i was " + (i - 2013) + " years old");
		}
		*/
		/*for(int i = 0; i <= 2; i++) {
			for(int j = 0; j <= 2; j++) {
				System.out.println(i + " " + j);
			}
		}
		*/
		/*for(int i = 0; i < 10; i++) {
			for(int j = 1; j <= 10; j++) {	
				System.out.print(j+i*10 + " ");
			}
			System.out.println();
		}
		*/
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		/*for(int i = 0; i <= 100; i++) {
			System.out.println(100 - i);
		}
		*/
		
	}

}
