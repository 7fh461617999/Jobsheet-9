package experiment;
import java.util.Scanner;
public class ArrayAverageScore11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[10];
        double total = 0;
        double average ;
        for (int i = 0; i < score.length; i++) {
            System.out.print("enter student score "+ i +": ");
            score[i]=sc.nextInt();
        }
        for (int i = 0; i < score.length; i++) {
            if (score[i] > 70) {
                System.out.println("student "+i+" passed with score : "+score[i] );
            }
            total += score[i]; 
        }
        average = total/score.length;
        System.out.println("the class average score is : "+average);
        System.out.println();
        sc.close();
    }
}
