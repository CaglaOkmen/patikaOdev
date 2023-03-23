/*tek sayi girilene kadar girilen degerlerden
  çift ve 4 un katlarinin tolami*/
import java.util.Scanner;
public class tekSayiGirileneKadar {
    public static void main(String[] args) {
        int a, total = 0;
        Scanner inp = new Scanner(System.in);

        do{
            System.out.print("sayi giriniz: ");
            a = inp.nextInt();
            if(a % 4 == 0){
                total += a;
            }
        }while(a % 2 == 0);

        System.out.print("toplam: " + total);
    }
}
