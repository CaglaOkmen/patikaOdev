// Ortalama hesaplama
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = inp.nextInt();
        System.out.println(mat);

        System.out.println("Fizik Notunuz: ");
        fizik = inp.nextInt();
        System.out.println(fizik);

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();
        System.out.println(kimya);

        System.out.print("Turkce Notunuz: ");
        turkce = inp.nextInt();
        System.out.println(turkce);

        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();
        System.out.println(tarih);

        System.out.print("Muzik Notunuz: ");
        muzik = inp.nextInt();
        System.out.println(muzik);

        double sonuc = (mat + fizik + kimya + tarih + turkce + muzik)/6.0;
        System.out.print(sonuc);

        boolean not =sonuc>=60;

        String bilgi = not ? "Geçti" : "Kaldı";
        System.out.println(bilgi);
    }
}
