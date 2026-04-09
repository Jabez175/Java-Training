import java.util.*;
class map{
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        Map<Integer,Integer> m = new HashMap<>();
        for (int i=0;i<5;i++){
            m.put(i,arr[i]);
        }
        System.out.println(m.keySet());
        for(Map.Entry<Integer,Integer> entry : m.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        
    }
}