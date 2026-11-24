

public class palindrome{
    public static void main(String[] args) {
        int num = 121;
        int Original = num;
        int reversed = 0;

        while(num != 0){
            int reminder = num % 10;
            reversed = reversed * 10 + reminder;
            num = num / 10;
        }

        if(Original == reversed){
            System.out.println(Original + "is a palindrome");
        }
        else {
            System.out.println(Original + "is a not palindrome");
        }
    }
}