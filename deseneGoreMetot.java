import java.util.Scanner;
public class deseneGoreMetot {
    static void method(int a, int b){
        if(a>0){
            System.out.print(a + " ");
            method(a-5, b);
        }
        else{
            System.out.print(a + " ");
            method2(a+5, b);
        }
    }
    static void method2(int a, int b){
        if(a<b){
            System.out.print(a + " ");
            method2(a + 5, b); 
        }
        else{
            System.out.print(a);
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        int sayi = inp.nextInt();
        method(sayi,sayi);
    }
}
