import java.util.Scanner;

public class ders {


    public static void main(String[] args) {
        int mat, turkce, fizik, kimya, tarih, muzik;
        Scanner not = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz:");
        mat = not.nextInt();
        if (0<mat || mat<100 ){
            mat=0;
        }

        System.out.println("Türkçe notunuzu giriniz:");
        turkce = not.nextInt();
        if (0<turkce || turkce<100 ) {
            turkce = 0;
        }

        System.out.println("Fizik notunuzu giriniz:");
        fizik = not.nextInt();
        if  (0<fizik || fizik<100){
            fizik=0;
        }

        System.out.println("Kimya notunuzu giriniz:");
        kimya = not.nextInt();
        if  (0<kimya || kimya<100){
            kimya=0;
        }

        System.out.println("Tarih notunuzu giriniz:");
        tarih = not.nextInt();
        if  (0<tarih || tarih<100){
            tarih=0;
        }

        System.out.println("Müzik notunuzu giriniz:");
        muzik = not.nextInt();
        if  (0<muzik || muzik<100){
            muzik=0;
        }

        double ortalama = ((mat + turkce + fizik + kimya + tarih + muzik) / 6);
        if (ortalama >= 55) {
            System.out.println("TEBRİKLERRRR, SINIFI GEÇTİNİZZZ!!!!");
            System.out.println("Ortalamanız:" + ortalama);
        } else {
            System.out.println("sınıfta kaldınız seneye tekrardan görüşmek üzere :)");
            System.out.println("Ortalamız:" + ortalama);



        }

    }
}
