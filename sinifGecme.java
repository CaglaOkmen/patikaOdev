// sinif geçme durumu kontrolu

import java.util.Scanner;
public class sinifGecme {
    public static void main(String[] args) {
        int mat, fiz, tr, kim, muz, toplam=5;
        Scanner inp = new Scanner(System.in);

        System.out.print("matematik notunuz: ");
        mat = inp.nextInt();
        if(100 <= mat || 0 >= mat){
            mat = 0;
            toplam--;}
        System.out.print("fizik notunuz: ");
        fiz = inp.nextInt();
        if(100 <= fiz || 0 >= fiz){
            fiz = 0;
            toplam--;}
        System.out.print("turkce notunuz: ");
        tr = inp.nextInt();
        if(100 <= tr || 0 >= tr)
            toplam--;
        System.out.print("kimya notunuz: ");
        kim = inp.nextInt();
        if(100 <= kim || 0 >= kim){
            kim = 0;
            toplam--;}
        System.out.print("muzik notunuz: ");
        muz = inp.nextInt();
        if(100 <= muz || 0 >= muz){
            muz = 0;
            toplam--;
        }

        double ort =(mat + fiz + kim + tr + muz)/toplam;   
        System.out.println("Ortalama:" + ort);
        if (ort < 55){
            System.out.print("Sınıfta kaldınız");
        }else{
            System.out.print("Sınıfı geçtiniz");
        }
    }  
}
