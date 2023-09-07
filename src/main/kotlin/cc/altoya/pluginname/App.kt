package cc.altoya.pluginname

import org.bukkit.plugin.java.JavaPlugin
import java.io.File

class App : JavaPlugin() {
    override fun onEnable() {
        loadConfig() // Loads .yml

        // How to register commands
        // this.getCommand("commandNameInYml").setExecutor(ObjectWithOnCommandMethod())

        // How to register eventListeners
        // this.server.pluginManager.registerEvents(ObjectWithEventHandlers(), this)
    }

    private fun loadConfig() {
        // Get potential config file
        val configFile = File(dataFolder, "filename.extension") // TODO UPDATE FILENAME

        if (!configFile.exists()) {
            // Add new defaults, path might be items.0.modelID
            // config.addDefault("pathInYml", "valueToSet")
        }

        // Load config
        config.options().copyDefaults(true)
        saveConfig()
    }
}
