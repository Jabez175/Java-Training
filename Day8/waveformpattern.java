import java.util.*;
class waveformpattern{
    public String wave(String s){
        char[] c = new char[s.length()];
        int k=0;
        for(int i=0;i<s.length();i+=2){
            c[k++]=s.charAt(i);
        }
        for(int i=1;i<s.length();i+=2){
            c[k++]=s.charAt(i);
        }
        return new String(c);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        waveformpattern w= new waveformpattern();
        System.out.print(w.wave(s));
    }
}