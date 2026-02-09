package Assignmentworks;

public class Findamissingnumberinarray {

    public static void main(String[] args) {
        // Find a Missing number in array
        // number should be in range
        // should not have duplicate

        int a[] = {1, 4, 5, 3};

        int sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            sum1 = sum1 + a[i];
        }
        System.out.println("Sum of array elements: " + sum1);

        int sum2 = 0;
        for (int i = 1; i <= 5; i++) {
            sum2 = sum2 + i;
        }
        System.out.println("Sum of range elements: " + sum2);

        System.out.println("Missing Number is: " + (sum2 - sum1));
    }
}
