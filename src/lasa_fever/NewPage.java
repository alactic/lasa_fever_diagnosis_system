
package lasa_fever;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class NewPage extends JFrame {

public static void main(String[] args) {
NewPage frameTabel = new NewPage();
}

JLabel welcome = new JLabel("Welcome to a New Frame");
JPanel panel = new JPanel();
JLabel lastname=new JLabel("Last Name");
JTextField last=new JTextField(20);
JLabel firstname=new JLabel("First Name");
JTextField first=new JTextField(20);
JLabel age=new JLabel("Age");
JTextField agefield=new JTextField(10);
JLabel email=new JLabel("Email");
JTextField emailfield=new JTextField(30);
JLabel username=new JLabel("Username");
JTextField user=new JTextField(20);
JLabel password=new JLabel("Password");
JTextField pass=new JTextField(20);

JButton submit=new JButton("Create");

NewPage(){
super("New Patient");
setSize(300,500);
setLocation(500,280);
panel.setLayout (null); 
panel.add(lastname);
panel.add(firstname);
panel.add(submit);
panel.add(last);
panel.add(first);
panel.add(age);
panel.add(agefield);
panel.add(username);
panel.add(user);
panel.add(password);
panel.add(pass);
panel.add(email);
panel.add(emailfield);
first.setBounds(70,60,150,20);
last.setBounds(70,100,150,20);
firstname.setBounds(10,60,150,20);
lastname.setBounds(10,100,150,20);
age.setBounds(10,140,150,20);
agefield.setBounds(70,140,60,20);
username.setBounds(10,220,60,20);
user.setBounds(70,220,150,20);
password.setBounds(10,260,60,20);
pass.setBounds(70,260,150,20);
email.setBounds(10,180,150,20);
emailfield.setBounds(70,180,60,20);
submit.setBounds(70,300,80,20);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
submit.addActionListener(
new ActionListener(){
    public void actionPerformed(ActionEvent e){
        String lastn=last.getText();
        String firstn=first.getText();
        String agen=agefield.getText();
        String email=emailfield.getText();
        String usern=user.getText();
        String passn=pass.getText();
        //JOptionPane.showMessageDialog(null, value1);
        
 
Connection con = null;
String user = "root";
String pass = "";
try{
//Class.forName(driver);
   // JOptionPane.showMessageDialog(null, value1);
 con=DriverManager.getConnection("jdbc:mysql://localhost/lasa_fever", user, pass);
Statement st = con.createStatement();
 st.executeUpdate("INSERT INTO patient_info " + "(last_name, first_name, age, email, username, password) " + "VALUES('"+lastn+"' ,'"+firstn+"' ,'"+agen+"',  '"+email+"',  '"+usern+"',  '"+passn+"')");
 NewPage fra=new NewPage();
       fra.setVisible(true);
        dispose();
}
catch(Exception ec){
System.out.println(ec.getMessage());
}
}
});

}

}
