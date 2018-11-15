package Exo2;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author yaho
 */
public class my_label extends JLabel{
    public  my_label(int x, int y,int w, int h, String t){
     this.setBounds(x, y, w, h);   
     this.setText(t); 
     this.setHorizontalAlignment(SwingConstants.RIGHT);
     //this.setBackground(Color.WHITE);
     this.setFont(new Font("Gisha", Font.LAYOUT_LEFT_TO_RIGHT, 45));
    }
}