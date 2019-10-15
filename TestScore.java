import java.util.Scanner;
public class TestScore
{   
    int[] arr1 = {1, 2, 3, 4, 5};
    public TestScore() throws ScoreException {
        Scanner testInput = new Scanner(System.in);
        int testInt = testInput.nextInt();
        System.out.println("Enter a Test Score");
        if (testInt > 100) {
            throw new ScoreException();
        }
    }
}
