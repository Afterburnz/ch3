import java.util.Scanner;

public class ConvertTime {
    public static void main(String[] args) {
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_MIN = 60;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an amount of seconds: ");
        int seconds = in.nextInt();
        int hours = seconds / SEC_PER_HOUR;
        int minutes = (seconds % SEC_PER_HOUR) / SEC_PER_MIN;
        int rem = seconds % SEC_PER_MIN;
        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds",
                seconds, hours, minutes, rem);
    }
}
