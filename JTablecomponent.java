import javax.swing.*;
import java.awt.*;
import java.swing.table.*;
public class JTablecomponent
{
 public static void main(String[]args)
 {
  new JTablecomponent();
 }
 public JTablecomponent()
 {
  JFrame frame=new JFrame("creating Jtable component example!");
  JPanel panel=new JPanel();
  String data[][]={{"vinod","BCA","A"},{"raju","MCA","B"},{"ranjan","MBA","C"},{"rinku","BCA","D"}};
  String col[]={"name","course","grade"};
  JTable table=new JTable(data,col);
  panel.add(table,BorderLayout.CENTER);
  frame.add(panel);
  frame.setSize(300,200);
  frame.setVisible(true);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}
