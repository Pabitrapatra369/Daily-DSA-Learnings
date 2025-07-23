class Solution {
    public int mySqrt(int x) {
        int start=0;
        int end=x/2;
        if(x==0)return 0;
        if(x==1||x==2||x==3)return 1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(x/mid==mid)return mid;
            else if(mid>x/mid)end=mid-1;
            else if(mid<x/mid)start=start+1;
        }
        //System.out.println(start+":"+end);
        return end;
    }
}
//optimal
class Solution {
    public int mySqrt(int x) {
        if(x < 2) return x;

        int left = 1, right = x, res = 0; 

        while(left <= right){
            int mid = left + (right - left) / 2;
            if((long)mid * mid <= x){
                res = mid;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return res;
    }
}
