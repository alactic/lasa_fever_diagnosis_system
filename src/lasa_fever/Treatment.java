package lasa_fever;

import javax.swing.*;
import java.awt.event.*;
public class Treatment extends JFrame {

JPanel panel = new JPanel();
JLabel sub = new JLabel("TREATMENT");
JLabel stage1 = new JLabel("   Ribavirin, an antiviral drug, has been used with success in Lassa fever patients. ");
JLabel stage2 = new JLabel(" It has been shown to be most effective when given early in the course of the illness. ");
JLabel stage3 = new JLabel(" Patients should also receive supportive care consisting of maintenance of appropriate ");
JLabel stage4 = new JLabel("fluid and electrolyte balance, oxygenation and blood pressure, as well as treatment of ");
JLabel stage5 = new JLabel(" any other and blood pressure, as well as treatment of any other complicating infections.");

public static void main(String[] args) {
 Treatment treat = new Treatment();
}

Treatment(){
super("Treatment");
setSize(550,500);
setLocation(500,100);
panel.setLayout (null); 
panel.add(sub);
panel.add(stage1);
panel.add(stage2);
panel.add(stage3);
panel.add(stage4);
panel.add(stage5);

sub.setBounds(10,10,250,20);
stage1.setBounds(10,40,850,20);
stage2.setBounds(10,60,850,20);
stage3.setBounds(10,80,850,20);
stage4.setBounds(10,100,850,20);
stage5.setBounds(10,120,850,20);
getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);



}
}
