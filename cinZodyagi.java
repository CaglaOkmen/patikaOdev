// cin burcu hesaplama
import java.util.Scanner;
public class cinZodyagi {
    public static void main(String[] args) {
        int yil, a;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dogum yilinizi giriniz: ");
        yil = inp.nextInt();
        a = yil % 12;
        switch (a) {
            case 0:
                System.out.print("cin burcunuz Maymun.");
                break;
            case 1:
                System.out.print("cin burcunuz Horoz.");
                break;
            case 2:
                System.out.print("cin burcunuz Kopek.");
                break;
            case 3:
                System.out.print("cin burcunuz Domuz.");
                break;
            case 4:
                System.out.print("cin burcunuz Fare.");
                break;
            case 5:
                System.out.print("cin burcunuz Okuz.");
                break;
            case 6:
                System.out.print("cin burcunuz Kaplan.");
                break;
            case 7:
                System.out.print("cin burcunuz Tavsan.");
                break;
            case 8:
                System.out.print("cin burcunuz Ejderha.");
                break;
            case 9:
                System.out.print("cin burcunuz Yilan.");
                break;
            case 10:
                System.out.print("cin burcunuz At.");
                break;
            case 11:
                System.out.print("cin burcunuz Koyun.");
                break;
        }
    }
}
