import java.util.Scanner;

public class HeightConverterApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the height");
		double inches=scan.nextDouble();
		HeightConverter hc=new HeightConverter();
		double res=(hc.convertInchesToFeet( inches));
		System.out.printf("%.2f",res);
}
}