import java.util.Scanner;

public class Largest_three_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int a = sc.nextInt();

        System.out.println("Enter Second Number:");
        int b = sc.nextInt();

        System.out.println("Enter Third Number:");
        int  c = sc.nextInt();

        int largest = 0;

        if(a >= b){
            if(b >= c){
                largest = a;
            }
            else {
                largest = b;
            }
        }
        else {
            if(b >= c){
                largest = b;
            }
            else {
                largest = c;
            }
        }
        System.out.println("Largest Number:"+largest);
    }
}
