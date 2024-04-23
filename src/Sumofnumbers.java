import java.util.Scanner;
public class Sumofnumbers {
    public static void main(String[] args) {
        //a. The sum of all even numbers between 2 and 100 (inclusive).
        int sum = 0;
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.printf("sum of all even number (2-100) : %d\n", sum);

        // The sum of all squares between 1 and 100 (inclusive).
        int SquareSum = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if ((i * j) <= 100) {
                    SquareSum = SquareSum + i * j;
                }
            }
        }
        System.out.printf("The sum of all squares between 1 and 100 : %d\n", SquareSum);

        // All powers of 2 from 2^0 up to 2^20.
        System.out.println("All powers of 2 from 2^0 up to 2^20: ");
        for (int k=0;k<=20;k++) {
            System.out.print(" "+Math.pow(2,k)+" ");

        }
        System.out.println();

        //d. The sum of all odd numbers between a and b (inclusive), where a and b are
        //inputs.
        int OddSum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("input two number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                OddSum = OddSum + i;
            }
        }
        System.out.printf("The sum of all odd numbers between range : %d\n", OddSum);

        //e. The sum of all odd digits of an input.
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a number:");
        int num = scanner.nextInt();
        int digitSum=0;
        while(num!=0){
            int rem =num%10;
            num=num/10;
            if(rem%2!=0){
                digitSum=digitSum+rem;
            }
        }
        System.out.println("The sum of all odd digits "+digitSum);

    }
}

