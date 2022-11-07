
package odev;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DosyaIslem implements ActionListener{
 JFrame window= new JFrame ("Kayit Formu");
 JTextField userNameTextField= new JTextField();
 JPasswordField passwordTextField= new JPasswordField();
 JLabel userNameLabel= new JLabel("Kullanici Adi");
 JLabel passwordLabel= new JLabel("Sifre");
 JButton signUpButton= new JButton("Giris Yap");
 JLabel blank= new JLabel();
 FileWriter fileWriter;
 
 DosyaIslem(){
     
     GridLayout g1= new GridLayout();
     g1.setColumns(2);
     g1.setRows(3);
     
     window.setLayout(g1);
     signUpButton.addActionListener(this);
     window.add(userNameLabel);
     window.add(userNameTextField);
     window.add(passwordLabel);
     window.add(passwordTextField);
     window.add(blank);
     window.add(signUpButton);
     
     window.setSize(300,200);
     window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     window.setVisible(true);
    
 }

    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getActionCommand()==signUpButton.getActionCommand()){
           try
           {
               fileWriter= new FileWriter("C:/test.txt");
               fileWriter.write(userNameLabel.getText()+" : "+userNameTextField.getText()+"\n");
               fileWriter.write(passwordLabel.getText()+" : "+passwordTextField.getText());
               fileWriter.close();
               JOptionPane.showMessageDialog(null, "Dosya Basariyla Yazdirildi!");
               
           }
           catch(Exception e)
           {
             JOptionPane.showMessageDialog(null, e+"");
   
           }
    }
    }
}

