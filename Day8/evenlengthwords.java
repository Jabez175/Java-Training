import java.util.*;
public class evenlengthwords{
    public String even(String s){
        String res="";
        String r="";
        int c=0;
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)!=' ' && i==s.length()-1)){
                res+=s.charAt(i);
                c++;
                if(c%2==0) {
                    r+=res;
                    r+=" ";
                }
            }
            if(s.charAt(i)==' ' ) {
                if(c%2==0) {
                    r+=res;
                    r+=" ";
                }
                res="";
                c=0;
            }
            else {
                res+=s.charAt(i);
                c++;
            }
        }
        return r;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        evenlengthwords e= new evenlengthwords();
        System.out.print(e.even(s));
    }
}