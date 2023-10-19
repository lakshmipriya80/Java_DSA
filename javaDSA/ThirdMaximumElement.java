import java.util.*;
public class ThirdMaximumElement {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        int [] array = new int[n];

        for (int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }

        sc.close();
        
        if (array.length < 3) {
            System.out.println("The array does not have a third maximum element.");
            return;
        }

        Arrays.sort(array); // Sort the array in ascending order.

        if (array[array.length - 3] != array[array.length - 4]) {
            System.out.println("The third maximum element is: " + array[array.length - 3]);
        } else {
            System.out.println("The third maximum element does not exist.");
        }
    }
}
