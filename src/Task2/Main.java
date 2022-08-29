package Task2;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{5, 6, 3, 2, 5, 1, 4, 9};
        int arraySize = array.length;
        int left = 0;
        int right = arraySize - 1;

        System.out.println("\nSource array:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        int[] resultArray = mergeSort(array, left, right);
        assert !resultArray.equals(new int[]{1, 2, 3, 4, 5, 5, 6, 9});

        System.out.println("\n");
        System.out.println("Result array:");
        for (int i : resultArray) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static int[] mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
        return array;
    }

    public static void merge(int[] array, int left, int middle, int right) {
        int[] b = new int[array.length];
        int i = left, k = left;
        int j = middle + 1;

        while(i <= middle && j <= right) {
            if(array[i] < array[j]) {
                b[k] = array[i];
                i++;
            } else {
                b[k] = array[j];
                j++;
            }
            k++;
        }

        if (i > middle) {
            while (j <= right) {
                b[k] = array[j];
                k++;
                j++;
            }
        } else {
            while (i <= middle) {
                b[k] = array[i];
                k++;
                i++;
            }
        }

        for (k = left; k <= right; k++) {
            array[k] = b[k];
        }

    }
}