public class Armstrongnumber {
    public static void main(String[] args){
        int num = 153;
        int original = num;
        int sum = 0;

        while(num != 0){
            int reminder = num % 10;
            sum = sum + (reminder * reminder * reminder);
            num = num / 10;
        }
        if(original == sum) {
            System.out.println(original + "is an Armstrong number");
        }
        else {
            System.out.println(original + "is an not Armstrong number");
        }
    }
}
