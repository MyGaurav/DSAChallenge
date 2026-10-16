class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if(isAllNine(digits)){
            int[] res = new int[n+1];
            for(int i = 1;i<= n; i++){
                res[i] = digits[i-1];
            }
            for(int i = res.length-1; i>=0;i--){
                if(res[i] == 9){
                    res[i] = 0;
                }else{
                    res[i] += 1;
                }
                
        }
        return res;
        }

        for(int i = n-1; i>=0;i--){
                if(digits[i] < 9){
                    digits[i] += 1;
                    return digits;
                }
                digits[i] = 0;
        }
        
        return digits;
        
    }
    public boolean isAllNine(int[] arr){
        for(int i = 0; i<arr.length;i++){
            if(arr[i] != 9){
                return false;
            }
        }
        return true;
    }
}