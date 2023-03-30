public class MatrisTranspozunu {
    public static void main(String[] args) {
        int[][] matris = {{3, 4, 5},{1, 7, 8}};
        System.out.println("Matris: ");
        for(int i = 0; i<matris.length; i++){
            for(int j = 0; j<matris[i].length; j++){
                System.out.print(matris[i][j] + "  ");
                if(j == matris.length){
                    System.out.println();
                }
            }
        }
        System.out.println("Transpozu: ");
        for(int j = 0; j<matris[0].length; j++){
            for(int i = 0; i<matris.length; i++){
                System.out.print(matris[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
