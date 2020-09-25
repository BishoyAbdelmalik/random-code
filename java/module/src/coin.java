public class coin {
    public static void main(String[] args) {
        System.out.println(calcCoins(new int[]{8,1, 3, 2, 4},5));
    }

    private static int calcCoins(int[] coins, int sum) {
        int returnValue=0;
        if (sum==0|| coins.length==0){
        }else{
            int start=0;
            int value=coins[start];

            while (value!=sum){
                int tempCount=0;
                int i=0;
                if(start==i){
                    i++;
                }
                for (;i<coins.length;i++){
                    if (value+coins[i]>sum){

                    }else if (value+coins[i]<=sum) {
                        tempCount++;
                        value += coins[i];
                    }

                }
                if(value==sum){
                    returnValue=tempCount+1;
                }else if(++start<coins.length) {
                    value = coins[start];
                }else {
                    break;
                }

            }
        }
        return returnValue;
    }
}
