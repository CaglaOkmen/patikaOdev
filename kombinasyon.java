// kombinasyon hesaplayan program

import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {
        int n, r;
        int nSum = 1, rSum = 1, n_rSum = 1;
        Scanner inp =new Scanner(System.in);
        System.out.print("C(n,r) icin n degerini giriniz: ");
        n = inp.nextInt();

        System.out.print("C(n,r) icin r degerini giriniz: ");
        r = inp.nextInt();

        for(int i =1; i<=n; i++){
            nSum *=i;
        }
        for(int i =1; i<=r; i++){
            rSum *=i;
        }
        for(int i =1; i<=(n-r); i++){
            n_rSum *=i;
        }
        int sonuc = nSum / (rSum * n_rSum);
        System.out.print("C(n,r) degerini: " + sonuc);
    }
}
