package Task1;

public class Main {
    static int[][] randomArray = new int[5][5];

    public static void main(String[] args) throws InterruptedException {
        arrayRandomFilling(randomArray);
        System.out.println();
        System.out.println("Minimum value is " + minArraySeach(randomArray));
        System.out.println("Average value is " + averageArraySeach(randomArray));
        System.out.println("Maximum value is " + maxArraySeach(randomArray));
    }

    private static void arrayRandomFilling(int[][] array) throws InterruptedException {
        long randomNumber;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                randomNumber = System.currentTimeMillis() % 10;
                array[i][j] = (int) randomNumber;
                System.out.print(array[i][j]);
                Thread.sleep(200);
            }
            System.out.println();
        }
    }

    private static long minArraySeach(int[][] array) {
        long min = 0;

        for (int[] ints : array) {
            for (int anInt : ints) {
                if (min > anInt) {
                    min = anInt;
                }
            }
        }

        return min;
    }

    private static long maxArraySeach(int[][] array) {
        long max = 0;

        for (int[] ints : array) {
            for (int anInt : ints) {
                if (max < anInt) {
                    max = anInt;
                }
            }
        }

        return max;
    }

    private static long averageArraySeach(int[][] array) {
        long avg = 0;

        for (int[] ints : array) {
            for (int anInt : ints) {
                avg += anInt;
            }
        }

        return avg / array.length;
    }
}