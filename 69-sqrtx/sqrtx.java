class Solution {
    public int mySqrt(int x) {
        if(x<=1) return x;
        int left=0, right=x;
        while(left<=right){
            int mid = left + (right-left)/2;
            if((long)mid*mid < x) left=mid+1;
            else if((long)mid*mid > x) right=mid-1;
            else return mid;
        }
        return right;
    }
}