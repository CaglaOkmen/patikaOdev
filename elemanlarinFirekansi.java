public class elemanlarinFirekansi {
    
    static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {4, 2, 3, 2, 10, 21, 4, 26, 2, 21};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for(int i = 0; i< list.length; i++){
            for(int j = 0;j < list.length; j++){
                if((i != j) && (list[i] == list[j])){
                    if(!isFind(duplicate, list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for(int value : duplicate){
            if(value != 0){
                int count = 0;
                for(int i = 0; i<list.length; i++){
                    if(list[i] == value){
                        count++;
                    }
                }
                System.out.println(value + " sayisi " + count + " tekrar edildi.");
            }
        }
    }
}
