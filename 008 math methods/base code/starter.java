import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int Maximum = Math.max(13 - 6*11,30%7*(-2));
		System.out.println(Maximum);
		
		Double squareRoot = Math.sqrt(3*8 + 31%7);
		System.out.println(squareRoot);
		
		Double pow1 = Math.pow(37/3, 35%21);
		System.out.println(pow1);
		
		Double d = Math.max(Math.pow(2,14%3), Math.sqrt(2*6));
		System.out.println(d);
	}
}
