// Boy kutle endexsi
import java.util.Scanner;

public class VucutKitleIndex {
    public static void main(String[] args) {
        double boy, kilo;

        Scanner inp = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz: ");
        boy = inp.nextDouble();

        Scanner inp2 = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz: ");
        kilo = inp2.nextDouble();

        double index = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz :" + index);
    }
}
