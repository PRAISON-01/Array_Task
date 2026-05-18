import java.util.ArrayList;
import java.util.Arrays;
public class FireDrillFour{

     public static void main(String[] args){
        
        int[] arrayOne = {1,2,3,4};
        
        System.out.println(Arrays.toString(getPrefixSum(arrayOne)));
        
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

    public static int binarySearch(int[] array, int key){
        
        int left = 0;
        int right = array.length - 1;

        while(left <= right){
            int middle = (left + right)/ 2;
            
            if(key == array[middle]){
                return middle;
            }
            else if(key < array[middle]){
                right = middle - 1;
//                return right;
            }
            else{
                left = middle + 1;
//                return left;
            }
        }
        return -1;
    }
    

    public static int[] getDuplicate(int[] array){
        ArrayList<Integer> duplicateArray = new ArrayList<>();
        ArrayList<Integer> seenNumber = new ArrayList<Integer>();

        for(int number : array){
            if(seenNumber.contains(number)){
                if(!duplicateArray.contains(number)) duplicateArray.add(number);
            }
            else{
                seenNumber.add(number);
            }
        }

        int[] newArray = new int[duplicateArray.size()];
        
        
        int count = 0; 
        for(int number : duplicateArray){
            newArray[count++] = number;
        }
        return newArray;
    }

    
    public static int[] mergeArray(int[] arrayOne, int[] arrayTwo){
        ArrayList<Integer> array = new ArrayList<Integer>();

        for(int number : arrayOne){
            array.add(number);
        }
        
        for(int number : arrayTwo){
            array.add(number);
        }

        int[] newArray = new int[array.size()];
        
        int count = 0;
        for(int number : array){
            newArray[count++] = number;
        }
    
        for(int i = 0; i < newArray.length; i++){
            for(int index = 0; index < newArray.length - 1 - i; index++){
                if(newArray[index] > newArray[index + 1]){
                    int temp = newArray[index];
                    newArray[index] = newArray[index + 1];
                    newArray[index + 1] = temp;
                }
            }
        }
        return newArray;
        
    }

    public static int[] getPrefixSum(int[] array){
        int total = 0;
        int[] newArray = new int[array.length];
        int count = 0;
        for(int number : array){
            total += number;
            newArray[count++] = total;
        }
        return newArray;
    }
    

}
