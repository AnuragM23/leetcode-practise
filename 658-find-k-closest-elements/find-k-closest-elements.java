class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        int left=0, right=n-1;

        while(left<right){
            int mid = left + (right-left)/2;
            if(arr[mid] < x) left = mid+1;
            else right=mid;
        }

        left = left-1;
        right = left+1;

        while(right - left - 1 < k){
            if(left < 0) right++;
            else if(right >= arr.length) left--;
            else if(Math.abs(arr[left]-x) <= Math.abs(arr[right]-x)) left--;
            else right++;
        }

        List<Integer> result = new ArrayList<>();
        for(int i=left+1; i<right; i++){
            result.add(arr[i]);
        }
        return result;
    }
}