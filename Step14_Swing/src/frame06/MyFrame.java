package frame06;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyFrame extends JFrame{
   //생성자
   public MyFrame(String title) {
      super(title);
      
      setBounds(100, 100, 500, 500);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      
      JButton sendBtn=new JButton("전송");
      add(sendBtn);

      JButton deleteBtn=new JButton("삭제");
      add(deleteBtn);
   }
   
   public static void main(String[] args) {
      MyFrame f=new MyFrame("나의 프레임6");
      f.setVisible(true);
   }
}