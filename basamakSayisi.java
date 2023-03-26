// basamak sayilarinin toplami
import java.util.Scanner;
public class basamakSayisi {
    public static void main(String[] args) {
        int a;
        Scanner inp = new Scanner(System.in);

        System.out.print("sayi giriniz: ");
        a = inp.nextInt();

        int toplam = 0;
        while(a != 0){
            toplam += a%10;
            a/=10;
        }
        System.out.print("basamak toplamları: " + toplam);
    }
}
