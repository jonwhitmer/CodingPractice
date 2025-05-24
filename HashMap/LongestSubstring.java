import java.util.HashMap;
import java.util.Map;

public class LongestSubstring 
{
    public static int lengthOfLongestSubstring(String s) 
    {
        Map<Character, Integer> map = new HashMap<>();
        int length = 0, maxLength = 0;

        for (int i = 0; i < s.length(); i++)
        {
            System.out.println("MAP: " + map);    
            System.out.println("LENGTH: " + length);
            System.out.println("MAX LENGTH: " + maxLength);
            System.out.println("\n");

            if (map.containsKey(s.charAt(i)))
            {
                length = Math.max(map.get(s.charAt(i)) + 1, length); 
                // If it contains the key, that's when we alter the length
            }

            map.put(s.charAt(i), i);
            maxLength = Math.max(maxLength, i - length + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) 
    {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}