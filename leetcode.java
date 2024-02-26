twosum:
class Solution {
    public static int[] twoSum(int[] arr, int target) {
        int[] val = new int[2];
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j <= arr.length - 1; j++) {
                if(i==j){
                    continue;
                }
                if (arr[i] + arr[j] == target) {
                    val[0] = i;
                    val[1] = j;
                    

                }
            }
        }
        return val;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scn.nextInt();

        }
        int target = scn.nextInt();

        int[] ans = twoSum(arr, target);
        for (int j = 0; j < 4; j++) {
            System.out.println(ans[j] + " ");
        }

    }
}
class Solution {
    public static int[] twoSum(int[] arr, int target) {
        int[] val = new int[2];
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j <= arr.length - 1; j++) {
                if(i==j){
                    continue;
                }
                if (arr[i] + arr[j] == target) {
                    val[0] = i;
                    val[1] = j;
                    

                }
            }
        }
        return val;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scn.nextInt();

        }
        int target = scn.nextInt();

        int[] ans = twoSum(arr, target);
        for (int j = 0; j < 4; j++) {
            System.out.println(ans[j] + " ");
        }

    }
}class Solution {
    public static int[] twoSum(int[] arr, int target) {
        int[] val = new int[2];
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j <= arr.length - 1; j++) {
                if(i==j){
                    continue;
                }
                if (arr[i] + arr[j] == target) {
                    val[0] = i;
                    val[1] = j;
                    

                }
            }
        }
        return val;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scn.nextInt();

        }
        int target = scn.nextInt();

        int[] ans = twoSum(arr, target);
        for (int j = 0; j < 4; j++) {
            System.out.println(ans[j] + " ");
        }

    }
}
```class Solution {
    public static int[] twoSum(int[] arr, int target) {
        int[] val = new int[2];
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j <= arr.length - 1; j++) {
                if(i==j){
                    continue;
                }
                if (arr[i] + arr[j] == target) {
                    val[0] = i;
                    val[1] = j;
                    

                }
            }
        }
        return val;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scn.nextInt();

        }
        int target = scn.nextInt();

        int[] ans = twoSum(arr, target);
        for (int j = 0; j < 4; j++) {
            System.out.println(ans[j] + " ");
        }

    }
  palindrom:
  class Solution {
    public boolean isPalindrome(int x) {
        int X=x;
        if(x<0){
            return false;
        }
        int y = 0;
        while(x!=0){
            int r = x%10;
            y=y*10+r;
            x/=10;

        }
        if(X==y){
            return true;
        }
        return false;
        
    }
}
}
median of two sorted arrays:
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        ArrayList<Integer> Al = new ArrayList<>();
        int x = 0;
        int y = 0;
        while(x<m&&y<n){
            if(nums1[x]<nums2[y]){
                Al.add(nums1[x]);
                x++;
            }else{
                Al.add(nums2[y]);
                y++;
            }
        }
        while(x<m){
            Al.add(nums1[x]);
            x++;
        }
        while(y<n){
            Al.add(nums2[y]);
            y++;
        }
        int s = Al.size();
        if(s%2!=0){
            return Al.get(s/2);
        }else{
            return (Al.get(s/2)+Al.get((s/2)-1))/2.0;

        }
        
    }
}
