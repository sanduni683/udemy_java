package test;

import java.util.Scanner;

public class Review_30DayChallenge {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of test cases : ");
        int testCases = input.nextInt();
        String[] array = new String[testCases];

        for (int i = 0; i < testCases-1; i++){
            String values = input.next();

            array[i] = values ;
            System.out.println(array[i]);

            for (int a = 0; a <array.length; a++){
                char[] arItems = array[i].toCharArray();
                System.out.println(arItems[a]);
            }

        }



    }
}