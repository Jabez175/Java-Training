public class Main {
    public static void main(String[] args) {
        PluginManager manager = new PluginManager();

        Plugin welcome = new WelcomePlugin();
        Plugin security = new SecurityPlugin();

        manager.addPlugin(welcome);
        manager.addPlugin(security);

        manager.runAll();
    }
}