
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);
        System.out.print("isim : ");
        String isim = inp.nextLine();

        System.out.print("maasi : ");
        double maas = inp.nextDouble();

        System.out.print("calisma saati : ");
        double saat = inp.nextDouble();

        System.out.print("giris yili : ");
        int yil = inp.nextInt();

        Employee employee = new Employee(isim, maas, saat, yil);
        System.out.print(employee.toString());
    }
}