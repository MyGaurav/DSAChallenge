class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }

        int[] arr = new int[num1.length() + num2.length()];
        for(int i = num1.length() -1; i>=0; i--){

             for(int j = num2.length() -1; j>=0; j--){
                 
                 int ival = num1.charAt(i) -'0';
                 int jval = num2.charAt(j) -'0';

                 int prod = (ival * jval) + arr[i + j + 1];
                 arr[i + j + 1] = prod%10;
                 arr[i + j] += prod/10;

             }
        }
        StringBuilder s = new StringBuilder();
        int i =0;
        while(i<arr.length && arr[i] == 0) i++;
        while(i<arr.length){
            s.append(arr[i++]);
        
       }
       return s.toString();
    }
}