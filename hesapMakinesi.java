//hesap makinesini switch-case kullanarak
import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner inp = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        n1 = inp.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        n2 = inp.nextInt();

        System.out.println("İşleminizin türünü seçiniz; \n 1-Toplama \n 2-Çıkartma \n 3-Çarpma \n 4-Bölme");
        select = inp.nextInt();
        switch (select) {
            case 1:
                System.out.println("Toplama İşleminizi Seçtiniz \n İşlemin Sonucu: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkartma İşleminizi Seçtiniz \n İşlemin Sonucu: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma İşleminizi Seçtiniz \n İşlemin Sonucu: " + (n1 * n2));
                break;
            case 4:
                System.out.println(n2 != 0 ? "Bölme İşleminizi Seçtiniz \n İşlemin Sonucu: " + (n1 / n2) : "Hatalı İşlem bölüm 0 olamaz");
                break;
            default:
                System.out.println("Hatalı işlem yaptınız!, Lütfen tekrar deneyiniz");
        }
    }
}