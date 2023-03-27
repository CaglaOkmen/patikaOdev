import java.util.Scanner;
public class usluSayiRecursive {
    static int hesap(int a, int b){
        if(b!=0)
            return a * hesap(a, b - 1);
        else
            return 1;
    }
    public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);
       int taban, us;
       System.out.print("Taban değeri giriniz : "); 
       taban = inp.nextInt();
       System.out.print("Us değeri giriniz : "); 
       us = inp.nextInt();
       System.out.print("Sonuc: " + hesap(taban,us));
    }
}