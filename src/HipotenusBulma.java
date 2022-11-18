import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {

        int a, b;
        double c;


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1.kenari giriniz");
        a= scan.nextInt();

        System.out.println("Lutfen 2.kenari giriniz");
        b= scan.nextInt();

        c= Math.sqrt((a*a) + (b*b));
        System.out.println("Bu ucgenin Hipotenusu : " + c);
    }
}
