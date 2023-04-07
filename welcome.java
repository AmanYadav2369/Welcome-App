import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class welcome extends JFrame
{
Container c;
JLabel head, name, res;
JTextField txtname;
JButton btnsubmit;

welcome(){
c=getContentPane();
c.setLayout(null);

head=new JLabel("Welcome App");
head.setBounds(120,10,400,40);
head.setFont(new Font("Arial", Font.BOLD, 35));
head.setForeground(Color.RED);
c.add(head);

name=new JLabel("Enter Your Name :");
name.setBounds(130,100,300,30);
name.setFont(new Font("Arial", Font.BOLD, 25));
name.setForeground(Color.BLUE);
c.add(name);

txtname=new JTextField(30);
txtname.setBounds(130,150,220,30);
txtname.setFont(new Font("Arial", Font.PLAIN, 25));
c.add(txtname);

btnsubmit=new JButton("Submit");
btnsubmit.setBounds(140,230,200,30);
btnsubmit.setFont(new Font("Arial", Font.BOLD, 25));
btnsubmit.setForeground(Color.BLUE);
c.add(btnsubmit);

res=new JLabel("");
res.setBounds(120,300,400,30);
res.setFont(new Font("Arial", Font.BOLD, 25));
res.setForeground(Color.BLUE);
c.add(res);

ActionListener a = (ae) -> { 
String Name=txtname.getText();
String msg="Welcome"+" "+Name;
res.setText(msg);
 };
btnsubmit.addActionListener(a);

setSize(500,500);
setLocationRelativeTo(null);
setTitle("welcome app by Aman Yadav....");
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[])
{
welcome w=new welcome();
}
}