import java.util.ArrayList;
import java.util.List;

class PluginManager {
    // Encapsulation
    private List<Plugin> activePlugins = new ArrayList<>();

    public void addPlugin(Plugin p) {
        activePlugins.add(p);
        System.out.println("System: Added " + p.getName());
    }

    public void runAll() {
        System.out.println("\n--- Powering up all plugins ---");
        for (Plugin p : activePlugins) {
            p.start(); // Polymorphism 
        }
    }
}