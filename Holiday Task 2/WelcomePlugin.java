class WelcomePlugin implements Plugin {
    public String getName() { return "Welcome Master"; }
    
    public void start() {
        System.out.println("Welcome! System is now ready for your commands.");
    }
}