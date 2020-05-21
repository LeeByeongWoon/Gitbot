package com.prac;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

import javax.security.auth.login.LoginException;

public class Tcode {
    public static JDA jda;
    public static void main(String[] args) {
        JDABuilder jb = new JDABuilder(AccountType.BOT);
        jb.setAutoReconnect(true);
        jb.setStatus(OnlineStatus.ONLINE);
        jb.setToken("NzEzMTUwMjYzNzIwMDE3OTYx.Xsb-_A._GNRoqaZEb_zLGBURHH2XLt8mpM");
        jb.addEventListeners(new Listener());
        try{
            jda=jb.build();
        }catch (LoginException e){
            e.printStackTrace();
        }
    }
}
