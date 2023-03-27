public class palindrom {
    
    static boolean isPalindrom(int number){
        int temp= number, reverseNumber = 0, lastNumber;
        while(temp!=0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if(number == reverseNumber){
            System.out.println(number + " palindrom sayi.");
            return true;
        }
        else{
            System.out.println(number + " palindrom sayi degildir.");
            return false;
        }
    }
    public static void main(String[] args) {
        isPalindrom(23);
        isPalindrom(232);
        isPalindrom(243);
    }
}