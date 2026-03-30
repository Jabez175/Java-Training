import java.util.*;
class nonrepeatingchar{
    public char non(String s) {
        int[] f= new int[26];
        for(int i=0;i<s.length();i++){
            f[s.charAt(i)-'a']++;
        }
        int min=9999;
        char c=' ';
        for(int i=0;i<s.length();i++){
            if(min>f[s.charAt(i)-'a']) {
                min=f[s.charAt(i)-'a'];
                c= (char)('a'+i);
        }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        nonrepeatingchar n= new nonrepeatingchar();
        System.out.println(n.non(s));
    }
}