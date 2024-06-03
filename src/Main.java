import java.util.Scanner;
import java.text.*;

//My firstp roject


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Enter your buying price per share: ");
        double buyingPrice = scan.nextDouble();
        int day = 1;
        double closingPrice = 0.1;

        while (true) {
            System.out.println("Enter the closing price for the day "
                    + day + " (any negative value will leave the loop: )");
            closingPrice = scan.nextDouble();
            if(closingPrice<0.0) break;
            double earnings = closingPrice -buyingPrice;
            if(earnings > 0) {
                System.out.println("After day " + day + ", you earned "+ df.format(earnings) + "per share");
            }
            else if(earnings < 0) {
                System.out.println("After day " + day + ", you lost "+ df.format(-earnings) + "per share");
            }
            else {
                System.out.println("After day " + day + ", you have no earnings ");
            }
            day++;
        }
        scan.close();
    }
}