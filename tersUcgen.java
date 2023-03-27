import java.util.Scanner;
public class tersUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("sayi giriniz: ");
        int sayi = inp.nextInt();

        for (int i = sayi - 1; i >= 0; i--) {
            for (int j = 0; j < sayi - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
