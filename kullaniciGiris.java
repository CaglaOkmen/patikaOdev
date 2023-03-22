// kullanıcı girişi

import java.util.Scanner;

public class kullaniciGiris {
    public static void main(String[] args){
        String username, parola, parola2;

        Scanner inp = new Scanner(System.in);
        // kullanıcı adı cagla sifre 1234
        System.out.print("Kullanıcı Adiniz: ");
        username = inp.next();
        System.out.print("Sifreniz: ");
        parola = inp.next();
        
        if(username.equals("cagla")){
            if(parola.equals("1234"))
                System.out.print("Hosgeldiniz");
            else{
                System.out.print("Sifreniz yanlış!");
                System.out.println("Sifrenizi sifirlamak istiyor musunuz?\n İstiyorsaniz: 1 İstemiyorsaniz: 2 yaziniz");
                int secim = inp.nextInt();

                switch (secim) {
                    case 1:
                        System.out.print("Yeni sifrenizi giriniz: ");
                        parola2 = inp.next();
                        if (parola2.equals("1234")) {
                            System.out.println("Ayni sifre girdiniz. Sifreniz oluşturulamadi.");
                        }   
                        else {
                            System.out.println("Şifreniz oluşturuldu.");
                        }
                        break;
                    case 2:
                        System.out.print("yeni sifre olusturulmadı.");
                        break;
                }
            }
        }
        else{
            System.out.print("kullanici adi yanliş");
        }
    
    }
}
