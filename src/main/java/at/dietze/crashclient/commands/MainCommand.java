package at.dietze.crashclient.commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;

public class MainCommand extends CommandBase {

	@Override
	public String getCommandName() {
		// TODO Auto-generated method stub
		return "cracky";
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
		Minecraft.getMinecraft().thePlayer.addChatComponentMessage((IChatComponent) new ChatComponentText(EnumChatFormatting.DARK_AQUA + "{CrackyClient} List of Commands:"));
		Minecraft.getMinecraft().thePlayer.addChatComponentMessage((IChatComponent) new ChatComponentText(EnumChatFormatting.DARK_AQUA + "/crashaac"));
		Minecraft.getMinecraft().thePlayer.addChatComponentMessage((IChatComponent) new ChatComponentText(EnumChatFormatting.DARK_AQUA + "/crashswing"));
		
	}

}
