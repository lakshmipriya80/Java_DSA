import java.util.HashSet;

public class FindDuplicateUsingHS {
    
     public static void main(String[] args) {
        int[] input = {5, 7, 11, 11};
        int duplicate = findDuplicate(input);
        
        if (duplicate != -1) {
            System.out.println("The duplicate element is: " + duplicate);
        } else {
            System.out.println("No duplicate element found.");
        }
    }

    public static int findDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }

        return -1; 
    }
}


//  for (int i = 0; i < nums.length - 1; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] == nums[j]) {
//                     return nums[i]; // Found a duplicate element
//                 }
//             }
//         }

//         return -1; // No duplicate found
//     }