/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
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
    private List<Mail> mailList;
    Histogram<String> histogram;
    public static void main(String[] args) throws IOException {
        new Kata4().execute();
    }
    public void execute() throws IOException {
        input();
        process();
        output();
    }
    private void input() throws IOException {
        String filname = "C:\\Users\\danie\\Documents\\NetBeansProjects\\kata4\\src\\email.txt";
        mailList = MailListReader.read(filname);
    }
    private void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }
    private void output() {
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
} 