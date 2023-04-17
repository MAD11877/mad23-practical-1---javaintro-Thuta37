import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();

        
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int value = in.nextInt();
            numbers.add(value);
        }
    
        int mode = 0;
        int max = 0;
        for (int i = 0; i < num; i++) {
            int count = 0;
            for (int j = 0; j < num; j++) {
                if (numbers.get(j) == numbers.get(i)) {
                    count++;
                }
            }
          
            if (count > max) {
                max = count;
                mode = numbers.get(i);
            }
        }

    System.out.print(mode);
    
  }
}
