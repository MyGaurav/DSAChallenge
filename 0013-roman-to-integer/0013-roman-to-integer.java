class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int total = 0;
        total = map.get(s.charAt(0));
        for(int i = 1; i<s.length(); i++){
            char c = s.charAt(i);
            int prev = map.get(s.charAt(i-1));
            int curr = map.get(c);
            
            if(prev < curr){
                total = total + curr - 2*prev;
            }else{
                total += curr;
            }
        }

        return total;
    }
}