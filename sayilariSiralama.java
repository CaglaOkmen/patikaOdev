// girilen sayilari siralama

import java.util.Scanner;
public class sayilariSiralama {
    public static void main(String[] args) {
        int a, b, c;

        Scanner inp = new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz: ");
        a = inp.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        b = inp.nextInt();
        System.out.print("ucuncu sayiyi giriniz: ");
        c = inp.nextInt();

        if(a<b && c<b){
            if(c<a){
                System.out.print(c + "<" + a + "<" + b);
            }
            else{
                System.out.print(a + "<" + c + "<" + b);
            }
        }
        else if(b<a && c<a){
            if(c<b){
                System.out.print(c + "<" + b + "<" +a);
            }
            else{
                System.out.print(b + "<" + c + "<" + a);
            }
        }
        else if(a<c && b<c){
            if(b<a){
                System.out.print(b + "<" + a + "<" + c);
            }
            else{
                System.out.print(a + "<" + b + "<" + c);
            }
        }
    }
}
