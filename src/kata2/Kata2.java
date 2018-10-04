package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data ={1,2,4,7,1,9,0,2,1,3,9,9,1,1,0};
        Map<Integer, Integer> histogram = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{
                histogram.put(data[i],1);
            }            
        }
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }      
    }
    
}
