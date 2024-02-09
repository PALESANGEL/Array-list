import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//This program will allow user input

public class Main {

    public static int[] combine(int[] arr1, int[] arr2) {
        int firstLen = arr1.length;
        int secondLen = arr2.length;
        int maxLen = Math.max(firstLen, secondLen);

        List<Integer> combinedList = new ArrayList<>();

        for (int i = 0; i < maxLen; i++) {
            if (i < firstLen) {
                combinedList.add(arr1[i]);
            }
            if (i < secondLen) {
                combinedList.add(arr2[i]);
            }
        }


        int[] outcome = new int[combinedList.size()];
        for (int i = 0; i < combinedList.size(); i++) {
            outcome[i] = combinedList.get(i);
        }

        return outcome;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the first array: ");
        int firstSize = scanner.nextInt();
        int[] array1 = new int[firstSize];

        System.out.println("Enter elements for the first array: ");
        for (int i = 0; i < firstSize; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter the size of the second array: ");
        int secondSize = scanner.nextInt();
        int[] array2 = new int[secondSize];

        System.out.println("Enter elements for the second array: ");
        for (int i = 0; i < secondSize; i++) {
            array2[i] = scanner.nextInt();
        }

        int[] combinedArray = combine(array1, array2);


        System.out.println("Combined Array: ");
        for (int element : combinedArray) {
            System.out.print(element + " ");
        }
    }
}
