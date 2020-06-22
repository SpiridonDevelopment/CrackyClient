package at.dietze.crashclient;

import org.lwjgl.input.Keyboard;

import at.dietze.crashclient.commands.CrashAAC;
import at.dietze.crashclient.commands.CrashSwing;
import at.dietze.crashclient.commands.MainCommand;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.init.Blocks;
import net.minecraft.network.play.client.C03PacketPlayer;
import net.minecraft.network.play.client.C03PacketPlayer.C04PacketPlayerPosition;
import net.minecraft.network.play.client.C0APacketAnimation;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;

@Mod(modid = CrashClient.MODID, version = CrashClient.VERSION)
public class CrashClient
{
	
    public static final String MODID = "cracky";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	MinecraftForge.EVENT_BUS.register(new CrashAAC());
    	MinecraftForge.EVENT_BUS.register(new CrashSwing());
    	ClientCommandHandler.instance.registerCommand(new CrashAAC());
    	ClientCommandHandler.instance.registerCommand(new CrashSwing());
    	ClientCommandHandler.instance.registerCommand(new MainCommand());
    	MinecraftForge.EVENT_BUS.register(this);
    }
}
