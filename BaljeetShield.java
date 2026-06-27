package tf.matthew;

import org.bukkit.plugin.java.JavaPlugin;

public class BaljeetShield extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
    }
}