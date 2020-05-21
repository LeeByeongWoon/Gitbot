package com.prac;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Listener extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        User user = event.getAuthor();
        TextChannel tc = event.getTextChannel();
        Message msg = event.getMessage();
//        if(!user.isBot()&&msg.getContentRaw().equalsIgnoreCase("Hello")){
//            tc.sendMessage("hello, "+ user.getAsMention()).queue();
//        }
        if(msg.getContentRaw().charAt(0) == '!'){
            String[] args = msg.getContentRaw().substring(1).split(" ");
            if((args.length <=0))return;
            if (args[0].equalsIgnoreCase("test")&&args.length<2){
                tc.sendMessage("Hello,"+user.getAsMention()).queue();
            }else if(args[0].equalsIgnoreCase("hello")){
                if(args.length <2) return;
                if(args[1].equalsIgnoreCase("bot")){
                    tc.sendMessage("hello!, sir!").queue();
                }else if(args[1].equalsIgnoreCase("김대경")){
                    tc.sendMessage("머머리").queue();
                }
            }
        }
    }
}
