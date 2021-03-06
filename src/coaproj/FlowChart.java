/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coaproj;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author there
 */
public class FlowChart extends javax.swing.JPanel implements ActionListener {

    /**
     * Creates new form FlowChart
     */
    static int a = 0;
    int k = 0;
    Font f = new Font("TimesRoman", Font.BOLD, 25);
    Font f1 = new Font("TimesRoman", Font.BOLD, 17);
    Font f2 = new Font("TimesRoman", Font.BOLD, 14);
    //Font f3 = new Font("TimesRoman", Font.BOLD, 14);
    Timer tm = new Timer(10,this);
    public FlowChart() {
        initComponents();
        tm.start();
    }
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2 = (Graphics2D)g;
        g.setColor(Color.white);
        g2.setFont(f);
        g2.setStroke(new BasicStroke(5));
        g2.drawLine(30+60+5, 30, 70+60+60+10+5,30);
        g2.drawString("START", 30+60+5+10+2, 30+30+5);
        
        g2.drawLine(30+60+5,30,30+60+5,30+50);
        g2.drawLine(70+60+60+5+10,30,70+60+10+60+5,30+50);
        
        g2.drawLine(30+60+5, 30+50, 70+60+10+60+5, 30+50);
        
        g2.drawLine(30+60+55+5, 30+50, 30+60+5+55, 30+50+20);
        
        g2.drawLine(30+5, 30+50+20, 70+60+60+5+60+10, 30+50+20);
        g2.setFont(f1);
        g2.drawString("A <- 0", 30+5+20+10+20+20+10, 30+50+20+10+10+5);
        g2.drawString("Q <- DIVIDEND", 30+5+20+10+20+20+10, 30+50+20+10+10+10+5+5);
        g2.drawString("M <- DIVISOR", 30+5+20+10+20+20+10, 30+50+20+20+20+10+5);
        g2.drawString("C <- "+CoaProj.no_bits, 30+5+20+10+20+20+10, 30+50+20+20+10+30+5+5);
       
      
        g2.drawLine(30+5, 30+50+20+50+30, 70+60+60+5+60+10, 30+50+20+50+30);
        g2.drawLine(30+5,30+50+20 , 30+5,30+50+20+50+30 );
        g2.drawLine(70+60+60+5+60+10, 30+50+20, 70+60+60+5+60+10, 30+50+20+50+30);
        
       g2.drawLine(115+30+5, 30+50+20+50+30, 115+30+5, 30+50+20+50+30+20);
        
        g2.drawLine(25, 30+50+20+50+30+20 ,70+60+60+5+60+10+10 , 30+50+20+50+30+20);
        
        g2.drawString("LEFT SHIFT A , Q BY 1 BIT", 25+10+10, 30+50+20+50+30+20+20+10);
        
        g2.drawLine(25, 30+50+20+50+30+20, 25, 30+50+20+50+30+20+50);
        g2.drawLine(70+60+60+5+60+10+10, 30+50+20+50+30+20 ,70+60+60+5+60+10+10 , 30+50+20+50+30+20+50);
        g2.drawLine(25, 30+50+20+50+30+20+50 ,70+60+60+5+60+10+10 , 30+50+20+50+30+20+50);
      
        g2.drawLine(25+125, 30+50+20+50+30+20+50, 25+125, 30+50+20+50+30+20+50+20);
    
        g2.drawLine(25+125, 30+50+20+50+30+20+50+20, 25+125-50, 30+50+20+50+30+20+50+20+30);
        g2.setFont(f2);
        g2.drawString("IS MSB", 25+100+1, 30+50+20+50+30+20+50+20+20+5+4);
        g2.drawString("  A = 1", 25+100+1, 30+50+20+50+30+20+50+20+20+5+4+15);
        
        g2.drawString("YES", 25+100+1+50+40, 30+50+20+50+30+20+50+20+25);
        
        g2.drawString("NO", 25+100-40-40+5+15, 30+50+20+50+30+20+50+20+25);
        
 
        g2.drawString("A <- A - M", 25, 30+50+20+50+30+20+50+20+25+10+30);
        
        g2.drawString("A <- A + M", 25+60+100+30, 30+50+20+50+30+20+50+20+25+10+30);
        
        
        
        g2.drawLine(25+125, 30+50+20+50+30+20+50+20, 25+125+50, 30+50+20+50+30+20+50+20+30);
        
        g2.drawLine(25+125-50, 30+50+20+50+30+20+50+20+30, 25+125, 30+50+20+50+30+20+50+20+30+30);
        g2.drawLine(25+125+50, 30+50+20+50+30+20+50+20+30, 25+125, 30+50+20+50+30+20+50+20+30+30);
    
        g2.drawLine(25+125-50, 30+50+20+50+30+20+50+20+30, 25+125-100, 30+50+20+50+30+20+50+20+30);
        g2.drawLine(25+125+50, 30+50+20+50+30+20+50+20+30, 25+125+100, 30+50+20+50+30+20+50+20+30);
        
        g2.drawLine(25+125-100, 30+50+20+50+30+20+50+20+30, 25+125-100, 30+50+20+50+30+20+50+20+30+10);
        g2.drawLine(25+125+100, 30+50+20+50+30+20+50+20+30, 25+125+100, 30+50+20+50+30+20+50+20+30+10);
        g2.drawLine(25+125-100-30, 30+50+20+50+30+20+50+20+30+10, 25+125-100+50, 30+50+20+50+30+20+50+20+30+10);
        g2.drawLine(25+125-100+50, 30+50+20+50+30+20+50+20+30+10, 25+125-100+50, 30+50+20+50+30+20+50+20+30+40+10);
        g2.drawLine(25+125-50-50, 30+50+20+50+30+20+50+20+30+10+40, 25+125-100, 30+50+20+50+30+20+50+20+30+10+60);
        
       g2.drawLine(25+125-100-30, 30+50+20+50+30+20+50+20+30+50, 25+125-100+50, 30+50+20+50+30+20+50+20+30+50);
         
        
     g2.drawLine(25+125-100-30, 30+50+20+50+30+20+50+20+30+50, 25+125-100+40+10, 30+50+20+50+30+20+50+20+30+50);
               g2.drawLine(25+125-100-30, 30+50+20+50+30+20+50+20+30+50, 25+125-100+40+10, 30+50+20+50+30+20+50+20+30+50);
         g2.drawLine(25+125-100-30, 30+50+20+50+30+20+50+20+30+10, 25+125-100-30, 30+50+20+50+30+20+50+20+30+40+10);
                 g2.drawLine(25+125+100, 30+50+20+50+30+20+50+20+30+50, 25+125+100, 30+50+20+50+30+20+50+20+30+50+20);
                 g2.drawLine(25+125-100, 30+50+20+50+30+20+50+20+30+50+20, 25+125+100, 30+50+20+50+30+20+50+20+30+50+20);
                 g2.drawLine(25+125, 30+50+20+50+30+20+50+20+30+50+20, 25+125, 30+50+20+50+30+20+50+20+30+50+20+20);

        g2.drawLine(25+125+100-40, 30+50+20+50+30+20+50+20+30+10, 25+125+100+40, 30+50+20+50+30+20+50+20+30+10);
        g2.drawLine(25+125+100-40, 30+50+20+50+30+20+50+20+30+10, 25+125+100-40, 30+50+20+50+30+20+50+20+30+50);
       
        
        
        g2.drawLine(25+125+100-40+80, 30+50+20+50+30+20+50+20+30+10, 25+125+100-40+80, 30+50+20+50+30+20+50+20+30+50);
        
        g2.drawLine(25+125+100-40, 30+50+20+50+30+20+50+20+30+50, 25+125+100+40, 30+50+20+50+30+20+50+20+30+50);
        
        
         g2.drawLine(25+125, 30+50+20+50+30+20+50+20+30+50+30+10, 25+125+50, 30+50+20+50+30+20+50+20+30+50+30+30+10);
         g2.drawLine(25+125+50, 30+50+20+50+30+20+50+20+30+50+30+30+10, 25+125, 30+50+20+50+30+20+50+20+30+50+30+30+30+10);
         g2.drawLine(25+125-50, 30+50+20+50+30+20+50+20+30+50+30+30+10, 25+125, 30+50+20+50+30+20+50+20+30+50+30+30+30+10);
         
        g2.drawString("IS MSB", 25+100, 30+50+20+50+30+20+50+20+30+50+30+10+20+10);
        g2.drawString("  A = 1", 25+100, 30+50+20+50+30+20+50+20+30+50+30+10+20+10+10+5);
        
        
        g2.drawLine(25+125, 30+50+20+50+30+20+50+20+30+50+30+10, 25+125-50, 30+50+20+50+30+20+50+20+30+50+30+30+10);
        g2.drawLine(25+125-50, 30+50+20+50+30+20+50+20+30+50+50+20, 25+125-50-50, 30+50+20+50+30+20+50+20+30+50+50+20);
        
        g2.drawString("YES", 25+100+50+30+5, 30+50+20+50+30+20+50+20+30+50+30+10+20+5);
        g2.drawString("NO", 25+100-50-20, 30+50+20+50+30+20+50+20+30+50+30+10+20+5);
        
         g2.drawString("NO", 15, 30+50+20+50+30+20+50+20+30+50+30+10+20+30+60+60);
        g2.drawString("Qo <- 1", 25+5, 30+50+20+50+30+20+50+20+25+10+30+120);
        
        g2.drawString("Qo <- 0", 25+60+100+30+5, 30+50+20+50+30+20+50+20+25+10+30+120);
        
        g2.drawString("C = C - 1", 25+100-5, 30+50+20+50+30+20+50+20+30+50+30+10+20+10+115);
        
        g2.drawString("C = 0 ?", 30+5, 30+50+20+50+30+20+50+20+30+50+30+10+20+10+115+70);
        
         g2.drawString("    YES", 30+50+10+10, 30+50+20+50+30+20+50+20+30+50+30+10+20+10+115+60);
         
          g2.drawString("IS MSB", 25+100+90-32, 30+50+20+50+30+20+50+20+30+50+30+10+20+10+55+120+10);
        g2.drawString("  A = 1", 25+100+90-32, 30+50+20+50+30+20+50+20+30+50+30+10+20+10+55+120+10+15);
        
         g2.drawString("  A<-A+M", 25+100+80+19, 30+50+20+50+30+20+50+20+30+50+30+10+20+10+55+120+10+15+20+20+4);
        
         g2.drawString("    YES", 30+50+10+100+30+20, 30+50+20+50+30+20+50+20+30+50+30+10+20+10+115+60);
         
          g2.setFont(f);
          
        g2.drawString("END", 30+60+5+10+20, 30+30+140+450+14);
        
        
        g2.drawLine(25+125+50, 30+50+20+50+30+20+50+20+30+50+50+20, 25+125+50+50, 30+50+20+50+30+20+50+20+30+50+50+20);
        g2.drawLine(25+125-50-50, 30+50+20+50+30+20+50+20+30+50+50+20, 25+125-50-50, 30+50+20+50+30+20+50+20+30+50+50+30);
        g2.drawLine(25+125-50-50-20-10, 30+50+20+50+30+20+50+20+30+50+50+20+10, 25+125-50-50+50, 30+50+20+50+30+20+50+20+30+50+50+20+10);
        g2.drawLine(25+125-50-50+50, 30+50+20+50+30+20+50+20+30+50+50+20+10, 25+125-50-50+50, 30+50+20+50+30+20+50+20+30+50+50+20+40+10);
        g2.drawLine(25+125-50-50-20-10, 30+50+20+50+30+20+50+20+30+50+50+20+10, 25+125-50-50-20-10, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10);
        g2.drawLine(25+125-50-50-20-10, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10, 25+125-50-50-30+80, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10);
        
        g2.drawLine(25+125+50+50, 30+50+20+50+30+20+50+20+30+50+50+20, 25+125+50+50, 30+50+20+50+30+20+50+20+30+50+50+20+10);
        g2.drawLine(25+125+50+50-40, 30+50+20+50+30+20+50+20+30+50+50+20+10, 25+125+50+50+40, 30+50+20+50+30+20+50+20+30+50+50+20+10);
        g2.drawLine(25+125+50+50-40, 30+50+20+50+30+20+50+20+30+50+50+20+10, 25+125+50+50-40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10);
        g2.drawLine(25+125+50+50+40, 30+50+20+50+30+20+50+20+30+50+50+20+10, 25+125+50+50+40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10);
        
        g2.drawLine(25+125+50+50-40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10, 25+125+50+50+40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10);
        
       g2.drawLine(25+125+50+50, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10, 25+125+50+50, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20);
        g2.drawLine(25+125-50-50, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10, 25+125-50-50, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20);
        g2.drawLine(25+125-50-50, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20, 25+125+50+50, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20);
        g2.drawLine(25+125, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20, 25+125, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20);
        g2.drawLine(25+125-40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20, 25+125+40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20);
        g2.drawLine(25+125-40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+20+20+40+10, 25+125+40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+20+20+40+10);
        g2.drawLine(25+125-40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20, 25+125-40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+20+20+40+10);
        g2.drawLine(25+125+40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20, 25+125+40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+20+20+40+10);
        g2.drawLine(25+125,30+50+20+50+30+20+50+20+30+50+50+20+10+30+20+20+40+10 , 25+125, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+20+20+40+20);
         g2.drawLine(25+125-90, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20, 25+125, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20);
        g2.drawLine(25+125-90, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20,25+125-90, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10);
        g2.drawLine(25+125-90, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10,25+125-90-45, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10);
        g2.drawLine(25+125-90, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10,25+125-90+45, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10);
        g2.drawLine(25+125-90+45, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10,25+125-90, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20);
        g2.drawLine(25+125-90-45, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10,25+125-90, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20);
        
        g2.drawLine(25+125-90-45, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10,25+125-90-45-5,30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10);
        
        
        g2.drawLine(25+125-90-45-5, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10,25+125-90-45-5, 30+50+20+50+30+50+10+20);
        g2.drawLine(25+125-90-45-5, 30+50+20+50+30+50+10+20, 25+125, 30+50+20+50+30+50+10+20);
        
        
        g2.drawLine(25+125-90+45, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10,25+125-90+45+50, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10);
        
        g2.drawLine(25+125-90+45+50, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10,25+125-90+100+50, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20+10);
        g2.drawLine(25+125-90+100+45+50, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+2,25+125-90+100+50, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20+10);
        g2.drawLine(25+125-90+45+50+100, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10,25+125+45+50+100-90-50, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20+10-55);
        g2.drawLine(25+125-90+45+50, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10,25+125+45+50-90+50, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20+10-55);
        
        g2.drawLine(25+125+45+50+100-90-45, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+30,25+125+45+50+100-90-45, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20+10+10);
        g2.drawLine(25+125+45+50+100-90-45, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+30+10,25+125+40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20+10+10);
        
        g2.drawLine(25+125-40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+30+10,25+125+40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+30+10);
        
        g2.drawLine(25+125-40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+30+10+8+25,25+125+40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20+10+10+8+25);
        g2.drawLine(25+125-40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+30+10,25+125-40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20+10+10+8+25);
        g2.drawLine(25+125+40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+30+10,25+125+40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20+10+10+8+25);
        g2.drawLine(25+125-90+100+50+50, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10,25+125-90+100+50+50+20, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10);

        
        g2.drawLine(25+125-90+100+50+50+20, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10,25+125-90+100+50+50+20, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20+20);
        
        g2.drawLine(25+125-90+100+50+50-30, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20+20,25+125-90+100+50+50+20+10, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20+20);
        g2.drawLine(25+125-90+100+50+50-30, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20+20,25+125-90+100+50+50-30, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20+20+30);
        g2.drawLine(25+125-90+100+50+50+20+10, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20+20,25+125-90+100+50+50+20+10, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20+20+30);
        g2.drawLine(25+125-90+100+50+50-30, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20+20+30,25+125-90+100+50+50+20+10, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20+20+30);
       
        g2.drawLine(25+125-90+100+50+50-30, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20+20+15,25+125-90+100+50+50-30-40, 30+50+20+50+30+20+50+20+30+50+50+20+10+30+10+20+20+10+12+10+20+10+20+10+20+20+30-15);
     
               g2.drawLine(30+60+5, 30+50, 70+60+10+60+5, 30+50);
               g2.drawLine(30+60+5,30+50,150,30+50);
               g2.drawLine(70+60+10+60+5, 30+50,150, 30+50);
               
    }  
               

       
         
       















    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/black-wallpaper-10.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 680));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        a = a + 1;
        k = k + 1;
        repaint();
        
        
    }
}

