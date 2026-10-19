class Solution {
    public int nthUglyNumber(int n) {
        if(n<=6){
            return n;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        int p1 = 0, p2=0 , p3 =0; 
        while(arr.size()<n){
            int val1 = arr.get(p1) * 2;
            int val2 = arr.get(p2) * 3;
            int val3 = arr.get(p3) * 5;
            int min = Math.min(val1 , Math.min(val2 , val3));
            arr.add(min);
            if(min == val1){
                p1++;
            }
            if(min == val2){
                p2++;
            }   
            if(min == val3){
                p3++;
            }             
        }
        return arr.get(arr.size()-1);
    }
}