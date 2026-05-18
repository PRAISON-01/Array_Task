//collect 10 input from user using an array
//print the reverse without using another array

import java.util.Scanner;

public class ReverseArray{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
     
        int[] array = new int[10];
        
        int index = 0; 
        for(;index < array.length; index++){
            System.out.print("Enter number => ");
            array[index] = input.nextInt();
        }
    

//        for(int count = 0; count < array.length; count++ ){
//
//            System.out.print(array[count] + " ");
//
//        }
//        

        for(int count = array.length - 1; count >= 0; count--) {
            System.out.print(array[count] + " ");
        
        }
    }

}


