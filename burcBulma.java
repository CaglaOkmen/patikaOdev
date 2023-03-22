// burc bulma

import java.util.Scanner;
public class burcBulma {
    public static void main(String[] args) {
        int ay, gun;
        Scanner inp = new Scanner(System.in);
        
        System.out.print("dogdugunuz ayi giriniz: ");
        ay = inp.nextInt();
        System.out.print("dogdugunuz gunu giriniz: ");
        gun = inp.nextInt();

        if(ay == 1){
            if(gun <= 21)
                System.out.print("burcunuz oglak");
            else
            System.out.print("burcunuz kova");
        }

        if(ay == 2){
            if(gun <= 19)
                System.out.print("burcunuz kova");
            else
            System.out.print("burcunuz balik");
        }

        if(ay == 3){
            if(gun <= 20)
                System.out.print("burcunuz balik");
            else
            System.out.print("burcunuz koc");
        }

        if(ay == 4){
            if(gun <= 20)
                System.out.print("burcunuz koc");
            else
            System.out.print("burcunuz boga");
        }

        if(ay == 5){
            if(gun <= 21)
                System.out.print("burcunuz boga");
            else
            System.out.print("burcunuz ikizler");
        }

        if(ay == 6){
            if(gun <= 22)
                System.out.print("burcunuz ikizler");
            else
            System.out.print("burcunuz yengec");
        }

        if(ay == 7){
            if(gun <= 22)
                System.out.print("burcunuz yengec");
            else
            System.out.print("burcunuz aslan");
        }

        if(ay == 8){
            if(gun <= 22)
                System.out.print("burcunuz aslan");
            else
            System.out.print("burcunuz basak");
        }

        if(ay == 9){
            if(gun <= 22)
                System.out.print("burcunuz basak");
            else
            System.out.print("burcunuz terazi");
        }

        if(ay == 10){
            if(gun <= 22)
                System.out.print("burcunuz terazi");
            else
            System.out.print("burcunuz akrep");
        }

        if(ay == 11){
            if(gun <= 21)
                System.out.print("burcunuz akrep");
            else
            System.out.print("burcunuz yay");
        }

        if(ay == 12){
            if(gun <= 21)
                System.out.print("burcunuz yay");
            else
            System.out.print("burcunuz oglak");
        }
    }
}
