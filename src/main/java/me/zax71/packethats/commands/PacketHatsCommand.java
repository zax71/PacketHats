package me.zax71.packethats.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.*;
import me.zax71.packethats.PacketHats;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;

@CommandAlias("PacketHats|PHats|PHat")
public class PacketHatsCommand extends BaseCommand {

    @Subcommand("reload")
    @CommandPermission("PHats.reload")
    @Description("Reloads the configuration file")
    public static void onReload(Player sender, String[] args) {
        sender.sendMessage(PacketHats.plugin.prexix.append(Component.text("Reload placeholder")));
    }

    @Default
    @HelpCommand
    @CommandPermission("PHats.help")
    public static void onHelp(Player sender, String[] args) {
        sender.sendMessage(PacketHats.plugin.prexix.append(Component.text("help placeholder")));
    }

    @Subcommand("hat")
    @CommandPermission("PHats.hat")
    public class PacketHatsCommandHat extends BaseCommand {

        @Default
        @HelpCommand
        @CommandPermission("PHats.hat.help")
        public static void onHatHelp(Player sender, String[] args) {
            sender.sendMessage(PacketHats.plugin.prexix.append(Component.text("hats help placeholder")));
        }

        @Subcommand("on")
        @CommandPermission("PHats.hat.on")
        public static void onHatOn(Player sender, String[] args) {
            sender.sendMessage(PacketHats.plugin.prexix.append(Component.text("hat on placeholder")));
        }
        @Subcommand("off")
        @CommandPermission("PHats.hat.off")
        public static void onHatOff(Player sender, String[] args) {
            sender.sendMessage(PacketHats.plugin.prexix.append(Component.text("hat off placeholder")));
        }
    }
}
