package HashMap;

import java.util.HashMap;

public class CharacterReplacement 
{
    public int characterReplacement(String s, int k)
    {
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();
        int maxLength = 0;
        int leftPointer = 0;
        int maxFrequencyInWindow = 0;

        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++)
        {
            char currentChar = s.charAt(rightPointer);

            // update the frequency of the current character in the window
            charFrequencyMap.put(currentChar, charFrequencyMap.getOrDefault(currentChar, 0) + 1);

            // update the highest frequency of any character in the current window
            maxFrequencyInWindow = Math.max(maxFrequencyInWindow, charFrequencyMap.get(currentChar));

            // If the characters to change (window size - max frequency) > k, shrink the window
            while ((rightPointer - leftPointer + 1) - maxFrequencyInWindow > k)
            {
                char leftChar = s.charAt(leftPointer);
                charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) - 1);
                leftPointer++;
            }

            maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
        }

        return maxLength;
    }
    
}
