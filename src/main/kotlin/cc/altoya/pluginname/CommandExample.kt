package cc.altoya.pluginname

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class CommandExample : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<String>): Boolean {
        if (command.name.equals("commandNameInYML", ignoreCase = true)) {
            if (sender.hasPermission("pluginname.permission")) {
                // if (args.size != 1 && args.size != 2) return true
                // COMMAND CODE HERE
            }
        }
        return true
    }
}
