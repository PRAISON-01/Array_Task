import java.util.ArrayList;
public class FireDrillFour{
       public static void main(String[] args){
        
        System.out.print(collectArray(10));
    }

    public static int[] collectArray(int number){

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        int[] newArray = new int[number];
        int index = 0;
        for(index = 0; index < array.length ; index++){
            newArray[index] = array[index];
        }

        return array;
    }

    public static int[] reverseArray(int[] array){

        int[] reversedArray = new int[array.length];
        int count = 0;
        for(int index = array.length - 1; index >= 0; index--){
            reversedArray[count] = array[index];
            count++;
        }

     return reversedArray;
    }

    public static int[] removeOdd(int[] array){
        
       int count = 0;
       for(int number : array){
            if(number % 2 == 0) count += 1;
        }

        int[] newArray = new int[count];

        int index = 0;
        for(int number : array){
            if(number % 2 == 0) newArray[index++] = number;
        }

        return newArray;
    }

    public static int[] removeEven(int[] array){
        
       int count = 0;
       for(int number : array){
            if(number % 2 != 0) count += 1;
        }

        int[] newArray = new int[count];

        int index = 0;
        for(int number : array){
            if(number % 2 != 0) newArray[index++] = number;
        }

        return newArray;
    }
        
    public static int[] removeDuplicate(int[] array){

        int count = 0;
        for(number )
    }
        

}
