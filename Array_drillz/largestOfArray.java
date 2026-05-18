/* 
Sum of array
*/
import java.util.Scanner;

public class largestOfArray{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] array = new int[5];

        System.out.print("Enter a number => ");
        array[0] = input.nextInt();
        int largest = array[0];

        for(int count = 1; count < array.length; count++){
            System.out.print("Enter a number => ");
            array[count] = input.nextInt();

            if(array[count] > largest){
                largest = array[count];
            }
            
            
        }
        System.out.println(largest);
    }

}
