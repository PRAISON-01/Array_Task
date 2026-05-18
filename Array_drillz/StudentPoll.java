public class StudentPoll{

    public static void main(String[] args){

       int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 14, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2};

        int[] frequency = new int[6];

        for(int answer = 0; answer < responses.length; answer++){
            try{

                ++frequency[response[answer]]
            }

            catch(ArrayIndexOutOfBoundException e){

                System.out.print(e);
                System.out.printf("reponses @ [%d]  ", responses[9])
            }

        }

        System.out.printf("%s%10s%n", "Rating", "Frequency");

        for(int rating = 1; rating < frequency.length; rating++){


            System.out.print("%6d%10d%n", rating, frequency[rating]);
        }
    }
}
