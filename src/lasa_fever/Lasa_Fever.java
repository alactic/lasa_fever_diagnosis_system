package lasa_fever;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Lasa_Fever extends JFrame implements ActionListener{
JButton SUBMIT, creat;
JPanel panel;
JLabel label1,label2;
final JTextField text1;
final JPasswordField text2;
Lasa_Fever(){
label1 = new JLabel();
label1.setText("UserName:");
text1 = new JTextField(15);

label2 = new JLabel();
label2.setText("Password:");
text2 = new JPasswordField(15);
SUBMIT=new JButton("Login");
creat=new JButton();
creat.setText("Create an account");
panel=new JPanel(new GridLayout(3,1));
panel.add(label1);
panel.add(text1);
panel.add(label2);
panel.add(text2);
panel.add(SUBMIT);
panel.add(creat);
add(panel,BorderLayout.CENTER);
creat.addActionListener(
new ActionListener()
{
    public void actionPerformed(ActionEvent e){
        NewPage fra=new NewPage();
        fra.setVisible(true);
        dispose();

    }
});
SUBMIT.addActionListener(this);
setTitle("Login Form");
}
public void actionPerformed(ActionEvent ae){
String value1=text1.getText();
String value2=text2.getText();
Connection con = null;
//String url = "jdbc:mysql://localhost:3306/";;
//String db = "test";
//String driver = "com.mysql.jdbc.Driver";
String user = "root";
String pass = "";
String user1="";
String pass1="";
try{
//Class.forName(driver);
 con=DriverManager.getConnection("jdbc:mysql://localhost/lasa_fever", user, pass);
Statement st = con.createStatement();
ResultSet res = st.executeQuery("SELECT * FROM patient_info where username='"+value1+"' && password='"+value2+"'");
while (res.next()) {
user1 = res.getString("username");
pass1 = res.getString("password");

}
if (value1.equals(user1) && value2.equals(pass1)) {
//JOptionPane.showMessageDialog(this,"correct");
Diagnosis fra=new Diagnosis();
fra.setVisible(true);
dispose();

}
else{
JOptionPane.showMessageDialog(this,"Incorrect login or password","Error",JOptionPane.ERROR_MESSAGE);
}
}
catch(Exception e){
System.out.println(e.getMessage());
}
}



public static void main(String arg[])	{
try	{
Lasa_Fever frame=new Lasa_Fever();
frame.setSize(300,100);
frame.setVisible(true);
}
catch(Exception e){
JOptionPane.showMessageDialog(null, e.getMessage());
}
}
}
