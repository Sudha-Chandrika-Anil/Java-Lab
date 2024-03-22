import java.util.Scanner;

public class SecondSmall {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }

        int secondSmallest = findSecondSmallest(array);

        System.out.println("The second smallest element in the array is: " + secondSmallest);
    }

    public static int findSecondSmallest(int[] array) {
        int sm = Integer.MAX_VALUE;
        int ss = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < sm) {
                ss = sm;
                sm = array[i];
            } else if (array[i] < ss && array[i] != sm) {
                ss = array[i];
            }
        }

        return ss;
    }
}
