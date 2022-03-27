package me.zax71.packethats;

import co.aikar.commands.PaperCommandManager;
import me.zax71.packethats.commands.PacketHatsCommand;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public final class PacketHats extends JavaPlugin {

    public static PacketHats plugin;
    public final TextComponent prexix = Component.text("[")
            .color(NamedTextColor.DARK_GRAY)
            .append(
                    Component.text("PacketHats")
                    .color(NamedTextColor.GREEN)
            )
            .append(
                    Component.text("]")
                    .color(NamedTextColor.DARK_GRAY)
            ).append(Component.text(" ").color(NamedTextColor.WHITE));

    @Override
    public void onEnable() {
        // Config
        plugin = this;
        saveDefaultConfig();
        FileConfiguration config = getConfig();

        // Commands
        PaperCommandManager commandManager = new PaperCommandManager(this);
        commandManager.registerCommand(new PacketHatsCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
