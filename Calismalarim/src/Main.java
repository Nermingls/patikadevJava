import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;
        Scanner klavye = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz: ");
        Matematik=klavye.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        Fizik=klavye.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        Kimya=klavye.nextInt();
        System.out.println("Turkce notunuzu giriniz: ");
        Turkce=klavye.nextInt();
        System.out.println("Tarih notunuzu giriniz: ");
        Tarih=klavye.nextInt();
        System.out.println("Muzik notunuzu giriniz: ");
        Muzik=klavye.nextInt();

        int ortalama=(Matematik+Fizik+Kimya+Turkce+Tarih+Muzik)/6;

        System.out.println("Ortalamaniz : "+ortalama);
         if(ortalama>=60){
             System.out.println("Sinifi Gecti ");
         }
         else{
             System.out.println("Sinifta Kaldi ");
         }
    }
}