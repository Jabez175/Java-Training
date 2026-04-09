import java.util.*;
class set{
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        for(int i=0;i<10;i++)
        {
            if(set.contains(i))
            {
                System.out.println("true");
                break;
            }
        }
        System.out.println(set);
    }
}
