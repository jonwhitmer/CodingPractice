package Arrays;

public class WaterContainer
{
    /*
     * You are given an integer array height of length n
     * There are n vertical lines drawn such that the two endpoints of the i-th line are (i, 0) and (i, height[i])
     * Find two lines that together with the x-axis form a container, such that the container contains the most water
     * Return the maximum amount of water a container can store
     */
    public int maxArea(int[] height)
    {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int maxArea = 0;

        while (leftPointer < rightPointer)
        {
            int currentArea = (rightPointer - leftPointer) * Math.min(height[leftPointer], height[rightPointer]);
            maxArea = Math.max(maxArea, currentArea);

            /*
             * If the left wall is less than that of the right wall, we want to move the left wall forward
             * in hopes of finding a taller wall to increase the area
             * 
             * Otherwise, we want to move the right wall backward
             * in hopes of finding a taller wall to increase the area
             */
            if (height[leftPointer] < height[rightPointer])
            {
                leftPointer++;
            }
            else
            {
                rightPointer--;
            }
        }

        return maxArea;
    }
}