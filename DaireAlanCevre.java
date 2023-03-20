// daire alan cevre hasabi
import java.util.Scanner;
    
public class DaireAlanCevre {
    public static void main(String[] args) {

        double pi=3.14;
        int aci;
        int yariCap;

        Scanner deger = new Scanner(System.in);
        System.out.println("Açı Gir: ");
        aci = deger.nextInt();

        Scanner deger2 = new Scanner(System.in);
        System.out.println("Yarıçap Gir: ");
        yariCap = deger2.nextInt();

        double formul= (pi*(yariCap*yariCap)*aci)/360;
        System.out.println("Daire Diliminin Alani: "+formul);
    }
}