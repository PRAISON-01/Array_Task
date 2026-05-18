/* 
Sum of array
*/
import java.util.Scanner;

public class SumOfArrays{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] array = new int[5];
        int sum = 0;    
        
        for(int count = 0; count < array.length ; count++){

            System.out.print("Enter a number => ");
            sum += input.nextInt();
        }

        System.out.println(sum);
    }

}
