package src.day05;

public class RichestWealth {
    public static void main(String[] args) {
        int[][] accounts={
                {1,2,3},
                {3,2,1}
        };
        int maxTotalWealth=maximumWealth(accounts);
        System.out.println(maxTotalWealth);
    }
        public static int maximumWealth(int[][] accounts) {
            int maxWealth=0;
            for(int i=0;i<accounts.length;i++){
                int wealth=0;
                for(int j=0;j<accounts[i].length;j++){
                    wealth = wealth + accounts[i][j];

                }
                if(wealth>maxWealth){
                    maxWealth=wealth;
                }
            }
            return maxWealth;
        }
}
