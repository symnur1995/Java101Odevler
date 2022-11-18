import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {

        int r;
        double pi= 3.14;

        Scanner sc= new Scanner(System.in);
        System.out.println("Lutfen dairenin yari capini giriniz");
        r= sc.nextInt();

        double alan= pi * r * r;
        double cevre= pi * r * 2;

        System.out.println("Dairenin Alani : " + alan);
        System.out.println("Dairenin Cevresi : " + cevre);

    }
}
