import java.util.*;
public class TwoSum
{
    public static int[] twoSum(int[] nums, int target)
    {
        // Create a hashmap to store the elements and their indices
        Map<Integer, Integer> map = new HashMap<>();
        // Loop through the input array
        for (int i = 0; i < nums.length; i++)
        {
            // Calculate the complement of the target minus the current element
            int complement = target - nums[i];

            // Check if the complement is in the hashmap
            if (map.containsKey(complement))
            {
                // If the complement is found, return the indices of the complement and current element
                return new int[] { map.get(complement), i };
            }
            // Add the current element and its index to the hashmap
            map.put(nums[i], i);
        }
        // If no solution is found, throw an exception and print out the statement
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args)
    {
        // Scanner to read the user input
        Scanner sc = new Scanner(System.in);

        // Read the length of the input array
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Read the elements of the input array
        System.out.println("Enter the elements of the array (follow this format: int1 int2 int3...): ");
        for (int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target: ");

        // Read the target
        int target = sc.nextInt();

        // Calls the twoSum method to find the indices
        int[] result = twoSum(nums, target);
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }
}
