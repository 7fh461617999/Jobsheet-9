package experiment;

import java.util.Scanner;

public class ArrayValues11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] finalscore = new int[10];
         for (int i = 0; i < 10; i++) {
            System.out.print("enter the final score "+ i + ": ");
            finalscore[i] = sc.nextInt();
         }
         for (int i = 0; i < 10; i++) {
            System.out.println("final score "+i+" :" + finalscore[i]);
         }
         sc.close();
    }
}
