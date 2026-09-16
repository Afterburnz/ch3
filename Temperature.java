import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a temperature in Celsius: ");
		double C = in.nextDouble();
		System.out.printf("%.1f C = %.1f F", C, (1.8 * C + 32));
	
	
	
	}

}
