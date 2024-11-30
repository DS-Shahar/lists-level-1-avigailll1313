
  import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {

    public static ArrayList<Integer> generateRandomNumbers(int x, int y) {
        if (y < x) {
            throw new IllegalArgumentException("הגבול העליון חייב להיות גדול מהגבול התחתון");
        }

        ArrayList<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
  
            int randomNumber = random.nextInt(y - x + 1) + x;
            randomNumbers.add(randomNumber);
        }

        return randomNumbers;
    }
  public static int countOccurrences(ArrayList<Integer> list, int number) {
        int count = 0;
        for (int num : list) {
            if (num == number) {
                count++;
            }
        }
        return count;}

    public static void main(String[] args) {
        ArrayList<Integer> numbers = generateRandomNumbers(1, 100);
        System.out.println(numbers);
    }
}
