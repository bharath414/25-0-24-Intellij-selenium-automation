import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {


     int n, fact = 1;

//int n=5;
        System.out.println("please enter the number");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
for (int i=1;i<= n;i++){
    fact =fact*i;
    }


        System.out.println("factorial of given number is" + fact);

}}
