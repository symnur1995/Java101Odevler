import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {

        double ucret, kdv = 0.18;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen ucret tutarinizi giriniz");
        ucret= sc.nextDouble();

        double kdvTutari= ucret*kdv;
        double kdvliUcret= ucret + kdvTutari;


        System.out.println("KDV'siz ucret : " + ucret);
        System.out.println("KDV : " + kdv);
        System.out.println("KDV tutari : " + kdvTutari);
        System.out.println("KDV'li ucret : " + kdvliUcret);
    }
}
