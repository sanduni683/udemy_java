package test;

import java.util.Scanner;

public class Array_Sum{

    static long aVeryBigSum(long[] array){

        long sum = 0;

        for (int i =0; i < array.length; i++){
            long value = array[i];
            sum += value;
        }

        return sum;

    }

    private static final Scanner input = new Scanner(System.in);

    public static void main(String []args){
        int arLength = input.nextInt();
        input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (arLength >= 1 && arLength <= 10){
            long[] array = new long[arLength];


            //if (arLength >= 1 && arLength <= 10){
           // long[] array = new long[arLength];

            String[] arItems = input.nextLine().split(" ");
            input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i= 0; i < arLength; i++){
                long arItem = Long.parseLong(arItems[i]);
                array[i] = arItem ;
            }

            long result = aVeryBigSum(array);
            System.out.println(result);
        }
        else{
            System.out.println("Array size is out of the limit");
        }



            input.close();

    }
}