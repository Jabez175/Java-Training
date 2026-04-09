
import java.util.*;

public class ClosestElement_TreeSet{
    public static void main(String[] args){
        TreeSet<Integer> tree = new TreeSet<>(Arrays.asList(5,3,4,9,1));
        int target=7;
        Integer floor= tree.lower(target);
        Integer ceiling= tree.higher(target);
        if(floor==null)
        {
            System.out.println(ceiling);
        }
        else if(ceiling==null)
        {
            System.out.println(floor);
        }
        else if(target-floor<=ceiling-target)
        {
            System.out.println(floor);
        }
        else
        {
            System.out.println(ceiling);
        }

    }
}