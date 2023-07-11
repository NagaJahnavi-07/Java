import java.util.Scanner;
public class PlanetExplorerApp {
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the radius");
	double r=scan.nextDouble();
	PlanetExplorer pt=new PlanetExplorer();
	double res=pt.calculateSurfaceArea(r);
	System.out.printf("%.2f",res);
}
}