
import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args) {
        int a, b;

        Scanner inp = new Scanner(System.in);

        System.out.print("ussu alinacak sayiyi giriniz: ");
        a = inp.nextInt();
        
        System.out.print("ust olacak sayiyi giriniz: ");
        b = inp.nextInt();
        int sonuc = 1;
        for(int i = 0; i < b; i++){
            sonuc *= a; 
        }
        System.out.print("sonuc: " + sonuc);
    }
}
