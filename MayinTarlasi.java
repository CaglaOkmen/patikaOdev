import java.util.Scanner;

public class MayinTarlasi {
    static int[][] dizi = {{1, 0, 1}, {2, 2, 1}, {0, 1, 1}};
    static String[][] dizi2 = new String[3][3];

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        for (int i = 0; i < dizi2.length; i++) {
            for (int j = 0; j < dizi2[i].length; j++) {
                dizi2[i][j] = "-";
                System.out.print(" - ");
            }
            System.out.println();
        }

        int sutun, satir;
        boolean gameover = false;
        System.out.println("  Mayin Tarlasi");
        do {
            System.out.println("=================");
            System.out.print("sutun giriniz: ");
            sutun = inp.nextInt();
            System.out.print("satir giriniz: ");
            satir = inp.nextInt();

            for (int i = 0; i < dizi.length; i++) {
                for (int j = 0; j < dizi[i].length; j++) {
                    if (i == satir - 1 && j == sutun - 1) {
                        if (dizi[i][j] == 0) {
                            dizi2[i][j] = "*";
                            gameover = true;
                        } 
                        else {
                            dizi2[i][j]= String.valueOf(dizi[i][j]);
                        }
                    } 
                    else if (i == satir && j == sutun - 1) {
                        if (dizi[i][j] == 0) {
                            dizi2[i][j] = "-";
                        } 
                        else {
                            dizi2[i][j]= String.valueOf(dizi[i][j]);
                        }
                    } 
                    else if (i == satir - 1 && j == sutun) {
                        if (dizi[i][j] == 0) {
                            dizi2[i][j] = "-";
                        } 
                        else {
                            dizi2[i][j]= String.valueOf(dizi[i][j]);
                        }
                    } 
                    else if (i == satir - 2 && j == sutun - 1) {
                        if (dizi[i][j] == 0) {
                            dizi2[i][j] = "-";
                        } 
                        else {
                            dizi2[i][j]= String.valueOf(dizi[i][j]);
                        }
                    } 
                    else if (i == satir - 1 && j == sutun - 2 ) {
                        if (dizi[i][j] == 0) {
                            dizi2[i][j] = "-";
                        } else {
                            dizi2[i][j] = String.valueOf(dizi[i][j]);
                        }
                    } 
                }
            }
            for (int i = 0; i < dizi2.length; i++) {
                for (int j = 0; j < dizi2[i].length; j++) {
                    
                    System.out.print(" " + dizi2[i][j] + " ");
                }
                System.out.println();
            }
        } 
        while (isWin(sutun, satir));

        if(gameover)
            System.out.print("game over");
        else
            System.out.print("Tebrikler");      
    }

    public static boolean isWin(int a, int b) {
        int count = 0, count2 = 0;

        if (dizi[b - 1][a - 1] == 0) {
            return false;
        }
        else {
            for (int i = 0; i < dizi2.length; i++) {
                for (int j = 0; j < dizi2[i].length; j++) {
                    
                    if(dizi2[i][j] == "-"){
                        count++;
                    }
                    if(dizi[i][j] == 0){
                        count2++;
                    }

                }
            }
            if(count!=count2)
                return true;
            else
                return false;
        }
    }
}