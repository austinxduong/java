package QuickSort;
import java.util.Random;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        Random rndm = new Random();
        int[] numbers = new int[13];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rndm.nextInt(100);
        }
                System.out.println("Before:" + Arrays.toString(numbers));
                 

                quicksort(numbers, 0, numbers.length - 1);

                System.out.println("After:" + Arrays.toString(numbers));
                ;
    }
        private static void quicksort(int[] arr, int lowIndex, int highIndex) {
    
            if (lowIndex >= highIndex) {
                return;
            }
        
            int pivot = arr[highIndex];
        
            int leftPointer = lowIndex;
            int rightPointer = highIndex;
        
            while (leftPointer < rightPointer) {
                while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                    leftPointer++;
                    }
                while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                    rightPointer--;
                    }
                swap (arr, leftPointer, rightPointer);
                }
        
            swap (arr, leftPointer, highIndex);
        
            quicksort(arr, lowIndex, leftPointer - 1);
            quicksort(arr, leftPointer + 1, highIndex);
        
            }
            private static void swap(int[] arr, int index1, int index2) {
                int temp = arr[index1];
                arr[index1] = arr[index2];
                arr[index2] = temp;
            }

   }



// Before:[5, 55, 69, 54, 75, 82, 12, 14, 73, 64, 42, 66, 92]
// After:[5, 12, 14, 42, 54, 55, 64, 66, 69, 73, 75, 82, 92]
