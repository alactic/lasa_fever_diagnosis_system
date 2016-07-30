package lasa_fever;

import javax.swing.*;
import java.awt.event.*;
public class Ebola extends JFrame {

    public static int count_yes=0;
    public static int count_no=0;
JPanel panel = new JPanel();
JLabel sub = new JLabel("Please check the symptom/s you are having");
JLabel stage = new JLabel("Second Diagnosis Stage:");

JLabel stage2 = new JLabel("Impaired Kidney or Liver");
JRadioButton yes = new JRadioButton("YES");
JRadioButton no = new JRadioButton("NO");
JButton check=new JButton("Check");
public static void main(String[] args) {
Diagnosis frameTabel = new Diagnosis();
}


Ebola(){
super("Third Diagnosis");
setSize(300,700);
setLocation(500,100);
panel.setLayout (null); 
panel.add(sub);
panel.add(stage);
panel.add(stage2);
panel.add(yes);
panel.add(no);
panel.add(check);

sub.setBounds(10,60,250,20);
stage.setBounds(10,90,150,20);
stage2.setBounds(10,110,150,20);
yes.setBounds(10,140,150,20);
no.setBounds(10,170,150,20);
check.setBounds(70,500,80,20);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);


RadioHandler1 box1=new RadioHandler1();
yes.addItemListener(box1);
RadioHandler2 box2=new RadioHandler2();
no.addItemListener(box2);

ButtonGroup radioGroup = new ButtonGroup(); // create ButtonGroup
radioGroup.add( yes ); // add plain to group
radioGroup.add( no ); // add bold to group


ButtonHandler handler=new ButtonHandler();
check.addActionListener(handler);
}
 class RadioHandler1 implements ItemListener
 {
    public void itemStateChanged(ItemEvent e)
    {
     if(yes.isSelected())
     {
         count_yes=count_yes+1;
                           
        }else
         if(!yes.isSelected())
     {
         count_yes=count_yes-1;
                          
        }
     System.out.print(count_yes);
    System.out.print(count_no);
     }

 }


class RadioHandler2 implements ItemListener
 {
    public void itemStateChanged(ItemEvent e)
    {
       if(no.isSelected())
     {
         count_no=count_no+1;
                          
        }else if(!no.isSelected())
     {
         count_no=count_no-1;
                      
        }
      
    }

 }

class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
           if(count_yes==1){
                JOptionPane.showMessageDialog(null, "YOU HAVE EBOLA");
               
           } else
               if(count_no==1){
                     JOptionPane.showMessageDialog(null, "EBOLA IS SUSPECTED, GO FOR OTHER TEST TO CONFIRM");
              }
        }
}
}
