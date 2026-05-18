
import java.util.Arrays;
class ReverseArray{

    public static void main(String[] args){
       
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        System.out.println("Original: " + Arrays.toString(numbers));

        reverseArray(numbers);

        System.out.println("Reversed : "+ Arrays.toString(numbers));

    }

        public static int[]  reverseArray(int[] array){

            int left = 0;
            int right = array.length - 1;

            while( left < right){

                int temp = array[left];

                array[left] = array[right];

                array[right] = temp;

                left++;
                right--;
            }

        return array;


    }

}
