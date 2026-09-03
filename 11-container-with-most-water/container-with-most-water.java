class Solution {
    public int maxArea(int[] heights) {
        int left=0, right=heights.length-1;
        int maxVolume = Math.min(heights[left], heights[right])*(right-left);
        while(left < right){
            int volume = Math.min(heights[left], heights[right])*(right-left);
            maxVolume = Math.max(maxVolume, volume);
            if(heights[left] < heights[right]) left++;
            else right--;
        }
        return maxVolume;
    }
}