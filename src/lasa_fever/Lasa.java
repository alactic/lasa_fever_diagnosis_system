package lasa_fever;

import javax.swing.*;
import java.awt.event.*;
public class Lasa extends JFrame {

JPanel panel = new JPanel();
JLabel sub = new JLabel("Please check the symptom/s you are having");
JLabel stage = new JLabel("Third Stage:");
JCheckBox symtoms_1 = new JCheckBox("Facial Swelling");
JCheckBox symtoms_2 = new JCheckBox("Conjuctivitis");
JCheckBox symtoms_3 = new JCheckBox("Protein in urine");
JButton check=new JButton("Check");
public static void main(String[] args) {
Diagnosis frameTabel = new Diagnosis();
}


Lasa(){
super("Diagnosis of Ebola");
setSize(300,700);
setLocation(500,100);
panel.setLayout (null); 
panel.add(sub);
panel.add(stage);
panel.add(symtoms_1);
panel.add(symtoms_2);
panel.add(symtoms_3);
panel.add(check);

sub.setBounds(10,60,250,20);
stage.setBounds(10,90,150,20);
symtoms_1.setBounds(10,140,150,20);
symtoms_2.setBounds(10,180,150,20);
symtoms_3.setBounds(10,220,150,20);
check.setBounds(70,500,80,20);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);



CheckBoxHandler1 box1=new CheckBoxHandler1();
symtoms_1.addItemListener(box1);

CheckBoxHandler2 box2=new CheckBoxHandler2();
symtoms_2.addItemListener(box2);

CheckBoxHandler3 box3=new CheckBoxHandler3();
symtoms_3.addItemListener(box3);

ButtonHandler handler=new ButtonHandler();
check.addActionListener(handler);
}

int count1=0;
 class CheckBoxHandler1 implements ItemListener
 {
    public void itemStateChanged(ItemEvent e)
    {
        if(symtoms_1.isSelected())
        {
            count1=count1+1;
        }
        else 
            if(!symtoms_1.isSelected())
            {
                count1=count1-1;
            }
          System.out.print(count1);
    }
 }

 class CheckBoxHandler2 implements ItemListener
 {
    public void itemStateChanged(ItemEvent e)
    {
     if(symtoms_2.isSelected())
     {
          count1=count1+1;
          
     }else
         if(!symtoms_2.isSelected())
         {
             count1=count1-1;
         }
     System.out.print(count1);
    }
 }
 
  class CheckBoxHandler3 implements ItemListener
 {
    public void itemStateChanged(ItemEvent e)
    {
        if(symtoms_3.isSelected())
     {
          count1=count1+1;
     }else
            if(!symtoms_3.isSelected())
            {
                count1=count1-1;
            }
        System.out.print(count1);
    }
  }

 class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
           if(count1>=2){
                Treatment treat=new Treatment();
               treat.setVisible(true);
               dispose();
               
           } else
               if(count1<2){
                    JOptionPane.showMessageDialog(null, "LASA FEVER IS SUSPECTED, GO FOR OTHER TEST TO CONFIRM");
    
              }
        }
}
}
