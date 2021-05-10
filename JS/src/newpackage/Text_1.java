/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author PC
 */
public class Text_1 extends JFrame {
    public Text_1() {
        JLabel lb1 = new JLabel("Chao xìn");
        add(lb1);
        this.setSize(250, 250);
        //pack();
        setVisible(true);
    }
    
    public static void main(String[] agg){
        new Text_1();
    }

}
