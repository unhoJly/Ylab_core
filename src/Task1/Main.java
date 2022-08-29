package Task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[][] resultArray = new int[5][5];
        long randomNumber, min = 0, max = 0, avg = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                randomNumber = System.currentTimeMillis() % 10;
                resultArray[i][j] = (int) randomNumber;
                avg += randomNumber;
                System.out.print(resultArray[i][j]);

                if (randomNumber > max)
                    max = randomNumber;
                else if (randomNumber < min)
                    min = randomNumber;

                Thread.sleep(200);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Minimum value is " + min);
        System.out.println("Average value is " + avg / 25);
        System.out.println("Maximum value is " + max);
    }
}