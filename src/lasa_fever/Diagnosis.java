package lasa_fever;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
public class Diagnosis extends JFrame {

JPanel panel = new JPanel();
JLabel sub = new JLabel("Please check the symptom/s you are having");
JLabel stage = new JLabel("First Stage:");
JCheckBox weak = new JCheckBox("Weakness");
JCheckBox sore = new JCheckBox("Sore Throat");
JCheckBox body_pain = new JCheckBox("Body Pain");
JCheckBox fever = new JCheckBox("Fever");
JCheckBox diarrhea = new JCheckBox("Diarrhea");
JCheckBox vomit = new JCheckBox("Vomittng");
JCheckBox bleeding = new JCheckBox("Bleeding");
JButton conti=new JButton("Continue");

Diagnosis(){
super("Diagnosis");
setSize(420,500);
setLocation(400,100);
panel.setLayout (null); 
panel.add(sub);
panel.add(stage);
panel.add(weak);
panel.add(sore);
panel.add(body_pain);
panel.add(fever);
panel.add(diarrhea);
panel.add(vomit);
panel.add(bleeding);
panel.add(conti);

sub.setBounds(10,60,250,20);
stage.setBounds(10,90,150,20);
weak.setBounds(10,140,150,20);
sore.setBounds(10,180,150,20);
body_pain.setBounds(10,220,150,20);
fever.setBounds(10,260,150,20);
diarrhea.setBounds(10,300,150,20);
vomit.setBounds(10,340,150,20);
bleeding.setBounds(10,380,150,20);
conti.setBounds(70,420,120,20);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);


CheckBoxHandler1 box1=new CheckBoxHandler1();
weak.addItemListener(box1);

CheckBoxHandler2 box2=new CheckBoxHandler2();
sore.addItemListener(box2);

CheckBoxHandler3 box3=new CheckBoxHandler3();
body_pain.addItemListener(box3);

CheckBoxHandler4 box4=new CheckBoxHandler4();
fever.addItemListener(box4);

CheckBoxHandler5 box5=new CheckBoxHandler5();
diarrhea.addItemListener(box5);

CheckBoxHandler6 box6=new CheckBoxHandler6();
vomit.addItemListener(box6);

CheckBoxHandler6 box7=new CheckBoxHandler6();
bleeding.addItemListener(box7);

ButtonHandler handler=new ButtonHandler();
conti.addActionListener(handler);
}
int ebola=0;
int lasa_fever=0;
 class CheckBoxHandler1 implements ItemListener
 {
    public void itemStateChanged(ItemEvent e)
    {
     if(weak.isSelected())
     {
          ebola=ebola+1;
          lasa_fever=lasa_fever+1;
     }else if(!weak.isSelected()){
         ebola=ebola-1;
          lasa_fever=lasa_fever-1;
     }
          System.out.print(ebola);
          System.out.print(lasa_fever);
        }
        }

 class CheckBoxHandler2 implements ItemListener
 {
    public void itemStateChanged(ItemEvent e)
    {
     if(sore.isSelected())
     {
          ebola=ebola+1;
          lasa_fever=lasa_fever+1;
     }else if(!sore.isSelected()){
         ebola=ebola-1;
          lasa_fever=lasa_fever-1;
     }
    
    System.out.print(ebola);
    System.out.print(lasa_fever);
        }
        }
 
  class CheckBoxHandler3 implements ItemListener
 {
    public void itemStateChanged(ItemEvent e)
    {
     if(body_pain.isSelected())
     {
          ebola=ebola+1;
          lasa_fever=lasa_fever+1;
     }else if(!body_pain.isSelected()){
         ebola=ebola-1;
          lasa_fever=lasa_fever-1;
     }
    
    System.out.print(ebola);
    System.out.print(lasa_fever);
        }
        }
  
  class CheckBoxHandler4 implements ItemListener
 {
    public void itemStateChanged(ItemEvent e)
    {
     if(fever.isSelected())
     {
          ebola=ebola+1;
          lasa_fever=lasa_fever+1;
     }else if(!fever.isSelected()){
         ebola=ebola-1;
          lasa_fever=lasa_fever-1;
     }
    
    System.out.print(ebola);
    System.out.print(lasa_fever);
        }
        }
  
  class CheckBoxHandler5 implements ItemListener
 {
    public void itemStateChanged(ItemEvent e)
    {
     if(diarrhea.isSelected())
     {
          ebola=ebola+1;
          lasa_fever=lasa_fever+1;
     }else if(!diarrhea.isSelected()){
         ebola=ebola-1;
          lasa_fever=lasa_fever-1;
     }
    
    System.out.print(ebola);
    System.out.print(lasa_fever);
        }
        }
  
  class CheckBoxHandler6 implements ItemListener
 {
    public void itemStateChanged(ItemEvent e)
    {
     if(vomit.isSelected())
     {
          ebola=ebola+1;
          lasa_fever=lasa_fever+1;
     }else if(!vomit.isSelected()){
         ebola=ebola-1;
          lasa_fever=lasa_fever-1;
     }
    
    System.out.print(ebola);
    System.out.print(lasa_fever);
        }
        }
 
  class CheckBoxHandler7 implements ItemListener
 {
    public void itemStateChanged(ItemEvent e)
    {
     if(bleeding.isSelected())
     {
          ebola=ebola+1;
          lasa_fever=lasa_fever+1;
     }else if(!bleeding.isSelected()){
         ebola=ebola-1;
          lasa_fever=lasa_fever-1;
     }
    
    System.out.print(ebola);
    System.out.print(lasa_fever);
        }
        }
    class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
           if(ebola==7){
               Diagnosis2 lasa=new Diagnosis2();
               lasa.setVisible(true);
               dispose();
    
           } else{
               JOptionPane.showMessageDialog(null, "TEST FOR OTHER DISEASES");
           }
        }
    }

 
public static void main(String[] args) {
Diagnosis diagnosis = new Diagnosis();
}

}
