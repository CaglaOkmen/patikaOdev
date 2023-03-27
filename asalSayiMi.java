import java.util.Scanner;
public class asalSayiMi {
    static int kontrol(int a, int b){
        if(b == 1){
            return 1;
        }
        else if(a % b == 0){
            return 0;
        }
        else{
            return kontrol(a, b-1);
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = inp.nextInt();
        if(kontrol(sayi, sayi / 2) == 1)
            System.out.print(sayi + " Asal sayidir.");
        else
            System.out.print(sayi + " asal sayi degildir.");
    }
}