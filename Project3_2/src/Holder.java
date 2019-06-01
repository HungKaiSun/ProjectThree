
/**
 * @author  Hung-Kai Sun
 *
 *Overview:
 * this is the actually program they will test
 * will use junit in the other class to testt
 */

public class Holder {

    public static Integer[] holder(int[] com, int amount){

        //seven spaces
        Integer[] used = new Integer[7];
        int at = 0;

        //if there is no coin
        if(com.length == 0){
            throw new IllegalArgumentException("Can't have a blank coin combination");
        }

        //if num is negative
        for(int i =0; i< com.length; i++){
            if(com[i] <= 0){
                throw new IllegalArgumentException("Can't have a negative or zero coin combination.");
            }
        }

        //find solution
        while(amount != 0){
            for(int i = com.length -1; i < com.length; i--){
                if(com[i] <= amount ) {
                    amount = amount - com[i];
                    used[at] = com[i];
                    at++;
                    break;
                }

                //if there is no solution
                else if(com[0] > amount){
                    throw new IllegalArgumentException("Can't get a coin combination solution");
                }
                else{
                    continue;
                }
            }
            if (at == 7) {
                break;
            }
        }
        return used;
    }
}
