package QuickSort;
import java.util.Random;
import java.util.Arrays;

public class Quicksort2 {
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
            int leftPointer = part(arr, lowIndex, highIndex, pivot);

            quicksort(arr, lowIndex, leftPointer - 1);
            quicksort(arr, leftPointer + 1, highIndex);
        }
        
        
        private static int part(int[] arr, int lowIndex, int highIndex, int pivot) {

            int leftPointer = lowIndex;
            int rightPointer = highIndex -1;
        
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
            return leftPointer;
        }

        
        private static void swap(int[] arr, int index1, int index2) {
            int temp = arr[index1];
            arr[index1] = arr[index2];
            arr[index2] = temp;
        }

   }

/*
Before:[97, 5, 83, 95, 55, 14, 27, 2, 72, 70, 72, 71, 55]
After:[2, 27, 5, 55, 14, 55, 70, 72, 71, 72, 83, 95, 97]
 */
