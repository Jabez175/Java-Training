class l3232 {
    public boolean canAliceWin(int[] nums) {
        int cs=0;
        int cd=0;
        for(int i:nums){
            if(i<10) cs+=i;
            else cd+=i;
        }
        if(cs==cd) return false;
        else return true;
    }
}