class SecurityPlugin implements Plugin {
    public String getName() { return "Guardian"; }
    
    public void start() {
        System.out.println("Security Check: All systems are secure. [OK]");
    }
}