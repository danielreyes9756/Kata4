package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import kata4.model.Mail;
import kata4.model.Histogram;
import java.util.List;

 public class MailHistogramBuilder {
    public static Histogram<String> build(List<Mail> mail){
        Histogram<String> histo = new Histogram<>();
        for (Mail m:mail) {
            histo.increment(m.getDomain());
        }
    return histo;
    }
}
 
