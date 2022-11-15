import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, tarih, muzik;

        Scanner not= new Scanner(System.in);
        System.out.println("Matemetik notunuzu giriniz");
        mat= not.nextInt();

        System.out.println("Fizik notunuzu giriniz");
        fizik = not.nextInt();

        System.out.println("Turkce notunuzu giriniz");
        turkce = not.nextInt();

        System.out.println("Kimya notunuzu giriniz");
        kimya = not.nextInt();

        System.out.println("Tarih notunuzu giriniz");
        tarih = not.nextInt();

        System.out.println("Muzik notunuzu giriniz");
        muzik= not.nextInt();

         int toplam = (mat + fizik + turkce + kimya + muzik + tarih);

        double notOrt = toplam/6.0;

        System.out.println("Not Otrtalamaniz : " + notOrt);

        String sonuc = notOrt < 60 ? "Sinifta Kaldi" : "Sinifi gecti";
        System.out.println(sonuc);
    }

}
