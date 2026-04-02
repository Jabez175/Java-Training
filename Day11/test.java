class test{
    public static int[] leader(int[] a){
        int n=a.length;
        int max= a[n-1];
        int c=1;
        for(int i=n-2;i>=0;i--){
            if(max<a[i]){
                max=a[i];
                c++;
            }
            else a[i]=max;
        }
        int[] arr = new int[c];
        int k=1;
        arr[0]=a[0];
        for(int i=1;i<n;i++){
            if (a[i] != a[i-1]) {
                arr[k]=a[i];
                k++;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] a=leader(new int[]{16,17,4,3,5,2});
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}