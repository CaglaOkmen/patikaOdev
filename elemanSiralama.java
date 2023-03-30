import java.util.Scanner;
public class elemanSiralama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("dizinin boyutunu giriniz: ");
        int boyut = inp.nextInt();

        int[] list = new int[boyut];

        for(int i = 1; i <= boyut; i ++){
            System.out.print(i + ". elemani: ");
            list[i-1] = inp.nextInt();
        }
        for(int i = 1; i < boyut; i++){
            int key = list[i];
            int j = i - 1;
            while(j > 0 && list[j] > key){
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = key;
        }

        System.out.print("siralama : ");
        for(int i = 0; i < boyut; i ++){
            System.out.print(list[i] + " ");
        }
    }
}
