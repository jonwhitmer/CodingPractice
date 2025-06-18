package HashMap;

import java.util.HashMap;

public class LongestSubstring
{
    public int lengthOfLongestSubstring(String s)
    {
        HashMap<Character, Integer> lastSeenIndexMap = new HashMap<>();
        int leftPointer = 0, maxLength = 0;

        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++)
        {
            char currentChar = s.charAt(rightPointer);

            if (lastSeenIndexMap.containsKey(currentChar))
            {
                // move the left pointer to the right of the last seen index of the current character
                leftPointer = Math.max(lastSeenIndexMap.get(currentChar) + 1, leftPointer);
            }

            lastSeenIndexMap.put(currentChar, rightPointer); // put the current character in the map with its right pointer index
            maxLength = Math.max(maxLength, rightPointer - leftPointer + 1); // max b/t current max or right - left + 1
        }

        return maxLength;
    }
}