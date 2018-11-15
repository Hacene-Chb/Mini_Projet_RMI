package Exo2;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import javax.swing.ButtonGroup;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class ImplClient extends JApplet implements ActionListener{
private static final long serialVersionUID = 1L;
	private InterPizza stub;
	JPanel panel1,panel2,pan3,pan4;
        my_label lb1;
        Label lb2,lb3,lb4,lb5,lb6,lb7;
        JTextField t_qt;   
        JButton b_cmd;
        private String choi1;
        private String choi2;
	
        public void init(){
		try {
			stub = (InterPizza)Naming.lookup("PZ");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
            check1 = new JCheckBox("Fromage Extra");
	    check2 = new JCheckBox("Olives Vertes");
	    check3 = new JCheckBox("Champignon");
	    check4 = new JCheckBox("Oignons");
	    check5 = new JCheckBox("Poivrons Verts");
	    check6 = new JCheckBox("Pepites de Poulet");
	    r1 = new JRadioButton("Petite");
	    r2 = new JRadioButton("Moyenne");
	    r3 = new JRadioButton("Large");
	    ButtonGroup group = new ButtonGroup();
	    group.add(r1);
	    group.add(r2);
	    group.add(r3);
	    try{
	    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	}catch(ClassNotFoundException ignore){
	}       catch (InstantiationException ignore) {
	        } catch (IllegalAccessException ignore) {
	        } catch (UnsupportedLookAndFeelException ignore) {
	}
	panel1 = new JPanel();
    	panel2 = new JPanel();
       	pan3 = new JPanel();
       	pan4 = new JPanel();
       	
        this.resize(600, 350);
            
            Color bColor = Color.decode("#687B7A");	       
	
            lb1 = new my_label(200, 160, 230, 120,"Commander Pizza en Ligne");
	    lb1.setBackground(bColor);  
	    lb1.setForeground(Color.decode("#0EF4ED"));
	    
            Container c = getContentPane();
	    c.setBackground(bColor);
	    
            pan3.add(lb1);
	    pan3.setBackground(Color.decode("#687B7A"));
	    c.add(panel1);
	    panel1.setBackground(Color.decode("#A4A4A4"));
	    b_cmd = new JButton("Commander");
	    b_cmd.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 16));
	    b_cmd.addActionListener(this);
	    c.add("South", panel2);
	    panel2.add(b_cmd);
	    panel2.setBackground(Color.LIGHT_GRAY);
	    lb2 = new Label("Introduiser le nombre de pizza que vous souhaitez cmd:");
	    lb2.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 18));
	    lb2.setForeground(Color.YELLOW);
	    
            t_qt = new JTextField(" ");
	    t_qt.setText("0");
	    t_qt.setBounds(new Rectangle(200,200,60,30));
            lb4 = new Label("( Qte )");
	    lb4.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 18));
	  
            lb5 = new Label("Choisissez un ou plusieurs choix:");
	    lb5.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 18));
	    lb5.setForeground(Color.YELLOW);
	    lb3 = new Label("Choisissez la taille du pizza:");
	    lb3.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 18));
	    lb3.setForeground(Color.YELLOW);
	    
	    //t_qt.setLayout(getLayout());
	    lb6 = new Label("Prix Total de votre commande:");
		lb6.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 18));
		lb6.setForeground(Color.red);
	    lb7 = new Label("0,00");
	    lb7.setBounds(new Rectangle(200,200,60,30));
		lb7.setFont(new Font("Times New Roman", Font.LAYOUT_LEFT_TO_RIGHT, 20));
		lb7.setForeground(Color.red);
	    panel1.add(lb2);
	    panel1.add(t_qt);
            panel1.add(lb4);
	    panel1.add(lb3);
	    c.add("North",pan3);
	    panel1.add(r1);
	    r1.addActionListener(this);
	    panel1.add(r2);
	    r2.addActionListener(this);
	    panel1.add(r3);
	    r3.addActionListener(this);
	    panel1.add(lb5);
	    pan4.add(check1);
	    check1.addActionListener(this);
	    pan4.add(check2);
	    check2.addActionListener(this);
	    pan4.add(check3);
	    check3.addActionListener(this);
	    pan4.add(check4);
	    check4.addActionListener(this);
	    pan4.add(check5);
	    check5.addActionListener(this);
	    pan4.add(check6);
	    check6.addActionListener(this);
	    pan4.setLayout(new GridLayout(2,3));
	    panel1.add(pan4);  
	    panel1.add(lb6);
	    panel1.add(lb7);	    
    }
	@Override
	public void actionPerformed(ActionEvent ev) {
		Object source = ev.getSource() ;
		if (source == r1) choi1=r1.getText() ;
		if (source == r2) choi1=r2.getText() ;
		if (source == r3) choi1=r3.getText() ;
		
		if ((check1.isSelected() == false)&&(check2.isSelected() == false)&&(check3.isSelected() == false)&&(check4.isSelected() == false)&&(check5.isSelected() == false)&&(check6.isSelected() == false)) {choi2="";}
		else if ((check1.isSelected() == true) && (check2.isSelected() == true) && (check3.isSelected() == true) && (check4.isSelected() == true) && (check5.isSelected() == true) && (check6.isSelected() == true)) {choi2="t";System.out.println("les choi2 est "+choi2);}
		else if ((check1.isSelected())&&(check2.isSelected())&&(check3.isSelected())&&(check4.isSelected())&&(check5.isSelected())) choi2 = "sans poulet";
		else if ((check1.isSelected())&&(check2.isSelected())&&(check3.isSelected())&&(check4.isSelected())) choi2 = "sans poivron";
		else if ((check1.isSelected())&&(check2.isSelected())&&(check3.isSelected())) choi2="sans oignant";
		else if ((check1.isSelected())&&(check2.isSelected())) choi2="sans champignon";
		else if (check1.isSelected()) choi2=check1.getText();
		else if (check2.isSelected()) choi2=check2.getText();
		else if (check3.isSelected()) choi2=check3.getText();
		else if (check4.isSelected()) choi2=check4.getText();
		else if (check5.isSelected()) choi2=check5.getText();
		else if (check6.isSelected()) choi2=check6.getText();
		if (source == b_cmd){
		int qte = Integer.parseInt(t_qt.getText());
		try {
			Double TOTAL = stub.Calculer_Prix(qte,choi1,choi2);
			lb7.setText(" "+TOTAL+" D.A");
			JOptionPane.showMessageDialog(null,"Merci pour votre payement de: "+TOTAL+"  D.A \nVotre pizza sera livrée dans 30min");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
		}
	 private JRadioButton r1 ;
	 private JRadioButton r2;
	 private JRadioButton r3;
	 private JCheckBox check1,check2,check3,check4,check5,check6;
}
