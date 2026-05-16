import java.util.ArrayList;
import java.util.Arrays;
public class FireDrillFour{
       


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

        ArrayList<Integer> integerArray = new ArrayList<Integer>();
        
        int count = 0;

        for(int number : array){
            if(!integerArray.contains(number))
            integerArray.add(number);
        }

        int[] newArray = new int[integerArray.size()];

        for(int number : integerArray){
            newArray[count++] = number;
        }
        return newArray;
    }

    public static int[] ascendArray(int[] array){

           for(int count = 0; count < array.length ; count++ ){

                for(int index = 0; index < array.length - count - 1; index++){
                    if(array[index]  > array[index +1]){

                        int temp = array[index];
                        array[index] = array[index + 1];
                        array[index + 1] = temp;
                    }
                }
            }
            return array;
    }

     public static int[] descendArray(int[] array){

        for(int count = 0; count < array.length; count++){

            for(int index = 0; index < array.length - count - 1; index++){
                if(array[index] < array[index + 1]){
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
        return array;
     }


    public static int linearSearch(int[] array, int key){

         
        for(int index = 0; index < array.length; index++){
            if(array[index] == key) return index;
        }
        return -1;
    
    }
    
    public static void main(String[] args){
        
        int[] array = {5, 2, 1, 6, 7, 9, 9};
        int key = 1;
        System.out.println(linearSearch(array, key));
    }

    

}
