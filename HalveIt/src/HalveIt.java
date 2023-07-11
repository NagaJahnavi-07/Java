import java.util.Scanner;

public class HalveIt {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		double num=scan.nextDouble();
		System.out.printf("%.2f",HalveTheNumber.halveTheNumber(num));
}
}