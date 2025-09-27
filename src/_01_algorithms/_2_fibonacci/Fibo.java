package _01_algorithms._2_fibonacci;

public class Fibo {

	public static void main(String[] args) {
		int numby1 = 0;
		int numby2 = 1;
		System.out.println(numby1);
		System.out.println(numby2);
		for(int i = 1; i <= 10; i++) {
			int sum = numby1 + numby2;
			System.out.println(sum);
			numby1 = numby2;
			numby2 = sum;
		}
	}

}
