class lc709 {
    public String toLowerCase(String s) {
        char ch[]=s.toCharArray();
        int i=0;
        while(i<ch.length){
            if(ch[i]>='A' && ch[i]<='Z'){
                ch[i]+=32;
            }
            i++;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        lc709 sol = new lc709();
        System.out.println(sol.toLowerCase("Hello")); // hello
        System.out.println(sol.toLowerCase("LOVELY")); // lovely
    }
}