import java.util.Random;

public class MergeSort {
    static int compareCounter= 0;
    static int replaceCounter = 0;

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[15];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(11);
        }

        System.out.println("Before:");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("\nAfter:");
        printArray(numbers);
        //

        int[] numbersSorted = {1,2,3,4,5,6,7};



        System.out.println("Before:");
        printArray(numbersSorted);

        mergeSort(numbersSorted);

        System.out.println("\nAfter:");
                                                                                                                                                                                                                  replaceCounter=0;
        printArray(numbersSorted);

        int[] numbersParialySorted = {1,6,7,2,3,4};



        System.out.println("Before:");
        printArray(numbersParialySorted);

        mergeSort(numbersParialySorted);

        System.out.println("\nAfter:");

        printArray(numbersParialySorted);

    }


    public static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;

        compareCounter++;
        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];


        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);
    }

    public static void merge (int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize) {
            compareCounter++;
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
                replaceCounter++;
            }
            else {
                inputArray[k] = rightHalf[j];
                j++;
                replaceCounter++;
            }
            k++;
        }

        while (i < leftSize) {
            replaceCounter++;
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            replaceCounter++;
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }

    }

    public static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n" + "compare counter " + compareCounter);
        System.out.println("swap counter " + replaceCounter);
        replaceCounter = 0;
        compareCounter = 0;

    }
}
