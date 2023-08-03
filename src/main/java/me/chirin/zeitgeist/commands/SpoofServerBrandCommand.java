package me.chirin.zeitgeist.commands;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import meteordevelopment.meteorclient.commands.Command;
import net.minecraft.command.CommandSource;

import static com.mojang.brigadier.Command.SINGLE_SUCCESS;
import static meteordevelopment.meteorclient.MeteorClient.mc;

public class SpoofServerBrandCommand extends Command {
    public SpoofServerBrandCommand() {
        super("spoofbrand", "Spoofs the minecraft server brand.", "spoofserver");
    }

    public void build(LiteralArgumentBuilder<CommandSource> builder) {
        builder.then(argument("brand", StringArgumentType.greedyString()).executes(context -> {
            String brand = context.getArgument("brand", String.class);
            if (!brand.isEmpty() && !mc.isInSingleplayer() && mc.world != null && mc.player != null) {
                mc.player.setServerBrand(brand);
                info("Succesfully spoofed server brand to: " + mc.player.getServerBrand());
            }

            return SINGLE_SUCCESS;
        }));
    }
}
