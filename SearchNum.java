package package1;

import java.util.*;
import java.util.Scanner;
public class SearchNum {
    public static void main(String[] args) {
        System.out.println("Enter sequence of numbers");
        System.out.println("total number of sequence");
        Scanner keyboard = new Scanner(System.in);
        int total = keyboard.nextInt();
        int[] array = new int[total];
        for(int j=0;j < total;j++){
         array[j] = keyboard.nextInt();
        }
        //int number = keyboard.nextInt();
        System.out.println("enter the number to be searched for");
        int FindNum = keyboard.nextInt();

        Arrays.sort(array);
        linearsearch(array, FindNum);
    }

    public static int linearsearch(int[] array, int FindNum) {
        for (int element : array) {
            int Ntimes = 0;
            if (FindNum == element) {
                  return Ntimes += 1;
            }
        }
        return -1;   /* -1 means to the number doesn't exist */


    }
}

