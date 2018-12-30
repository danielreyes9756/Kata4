package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author danie
 */

import kata4.model.Mail;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

 public class MailListReader {
    public static List<Mail> read(String fileName) throws IOException {
        List<Mail> mailList = new ArrayList<>();
        BufferedReader read = new BufferedReader(new FileReader(new File(fileName)));
        String mail;
        while((mail=read.readLine())!=null){
            if(mail.contains("@")){
                mailList.add(new Mail(mail));
            }
         }
        read.close();
        return mailList;
    }
}