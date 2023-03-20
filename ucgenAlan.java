// Ucgenin alanini hesaplama

import java.util.Scanner;

public class ucgenAlan {
    public static void main(String[] args) {
        int a, b;
        double c, u, alan;
        Scanner girdi = new Scanner(System.in);
        System.out.println("ucgenin 1. kenarini giriniz: ");
        a = girdi.nextInt();

        System.out.println("ucgenin 2. kenarini giriniz: ");
        b = girdi.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.println("hipotenüs: "+c);
            
        u = (b + a + c) / 2;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("alan: "+alan);
    }
    
}
