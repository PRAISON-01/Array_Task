/* Write a methood that collects ten integer, stores them in an array and returns the array*/
/*Write a method that takes an array and returns a new array with elements in reverse order*/

/*Write a method that takes an array and returns a new array with all even numbers removed (only odds number remain) */

/*vice versa*/

/*Write a method that takes array with duplicate  numbers  dup;icate value  removed (keep first occurence )*/

/**/

import java.util.Scanner;
public class TaskOne{


//    public static void main(String[] args){
//        
//        System.out.print(getArray(10));
//    }

    public static String getArray(int number){
      Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int index = 0;
        for(index = 0; index < array.length; index++){
            System.out.print("Enter a number =>");
            array[index] = input.nextInt();
        }

    return java.util.Arrays.toString(array);
    }

}

