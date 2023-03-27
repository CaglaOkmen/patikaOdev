// ebob ekok hesabi
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        int a, b;

        Scanner inp = new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz: ");
        a = inp.nextInt();
        System.out.print("ikinci sayiyi giriniz: ");
        b = inp.nextInt();
        int ebob=1, ekok=1, i=1, j =1;
        while(i <= a && i <= b){
            if(a%i==0 && b%i==0){
                ebob = i;
            }
            i++;
        }
        while(j <= a * b){
            if(j % a == 0 && j % b == 0){
                ekok = j;
                break;
            }
            j++;
        }
        System.out.print("ebob:" + ebob + "\nekok: " + ekok);
    }
}
