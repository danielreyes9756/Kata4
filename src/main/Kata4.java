/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;
/**
 *
 * @author danie
 */
public class Kata4 {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\danie\\Documents\\NetBeansProjects\\kata4\\src\\email.txt";
        List<Mail> mailList= MailListReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay= new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
 