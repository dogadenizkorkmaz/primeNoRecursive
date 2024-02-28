import java.util.Scanner;

public class Main {
    private static int isPrime(int number, int i) { //method here
        if (i==1){//All number is divisible by 1
            return 1;
        }else {
            if (number%i==0){
                return 0;
            }
            else return isPrime(number,i-1);//recursive portal starts here
        }
    }
    public static void main(String[] args) {
        int number, prime ;
        Scanner scanner=new Scanner(System.in); //define scanner
        System.out.print("Please enter a number : "); //get value from user
        number= scanner.nextInt();

        prime=isPrime(number,number/2); //call method

        if (prime==1){
            System.out.println(number+" is prime!!!");
        }else {
            System.out.println(number+" is not prime...");
        }
    }
}