import java.util.Scanner;
public class sequenceofinteger {
    public static void main(String[] args) {
        //the smallest and largest of the inputs.
        Scanner sc = new Scanner(System.in);
        System.out.println("input array size: ");
        int n= sc.nextInt();
        int num[]=new int[n];
        System.out.println("input numbers:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int min = num[0];
        int max= num[0];
        for (int i = 1; i < n; i++) {
            if(min> num[i])  {
                min=num[i];
            }
            if(max< num[i]) {
                max =num[i];
            }
        }
        System.out.println("largest :"+max);
        System.out.println("smallest :"+min);
        // b. The number of even and odd inputs.
        int even=0;
        int odd=0;
        for (int i = 0; i < n; i++) {
            if(num[i]%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Number of even inputs: " + even);
        System.out.println("Number of odd inputs: " + odd);

        //c. Cumulative totals. For example, if the input is 1 7 2 9, the program should print
        //1 8 10 19

        int cumulativeTotal=0;
        System.out.print("cumulative total: ");
        for (int i = 0; i < n; i++) {
            cumulativeTotal +=num[i];
            System.out.print(cumulativeTotal+" ");
        }
// All adjacent duplicates. For example, if the input is 1 3 3 4 5 5 6 6 6 2, the
//program should print 3 5 6.

        System.out.println("\nAll adjacent duplicates:");
        for (int i = 0; i < n - 1; i++) {
            if (num[i] == num[i + 1]) {
                if (num[i] != num[i - 1]) {
                    System.out.print(num[i] + " ");
                }
            }
        }
    }
}