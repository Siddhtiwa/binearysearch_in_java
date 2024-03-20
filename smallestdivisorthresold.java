public class smallestdivisorthresold {
    public static void main(String[] args) {
        int[] arr = {44,22,33,11,1};
        int n = arr.length;
        int t = 5;
        int mx = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            if(arr[i] >mx){
                mx = arr[i];
            }
        }
        int d= 1;
        int low = 1, hi = mx;
        while(low<=hi){
            int mid = low + (hi- low)/2;
            int sum =0;
            for (int i = 0; i < n; i++) {
                if(arr[i]%mid==0) sum +=arr[i]/mid;
                else sum +=arr[i]/mid+1;
            }
            if(sum<=t){
                d = mid;
                hi = mid-1;
            }
            else low = mid + 1;

        }
        System.out.print(d);

    }
}
