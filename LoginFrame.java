
package za.ac.tut.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Osego
 */
public class LoginFrame extends JFrame{
    
    //panels
    private JPanel headingPn1;
    private JPanel loginDetails;
    private JPanel headingAndLoginDetailsCombined;
    private JPanel usernamePn1;
    private JPanel passwordPn1;
    private JPanel buttonPn1;
    private JPanel mainPn1;
    
    //Labels
    
    private JLabel headingLb1;
    private JLabel usernameLb1;
    private JLabel passwordLb1;
    
    //text fields
    private JTextField usernameTextFld;

    //Password field 
    
    private JPasswordField passwordFld;
    
    // buttons 
    
    private JButton button1;
    private JButton button2;
    private JButton button3;

    
    public LoginFrame() {
        
        setTitle("Login Page");
        setSize(400,400);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create panels 
        
        headingPn1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        usernamePn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        passwordPn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        loginDetails = new JPanel(new GridLayout(2,1,1,1));
        loginDetails.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"Login details"));
        
        headingAndLoginDetailsCombined = new JPanel(new BorderLayout());
        buttonPn1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        mainPn1 = new JPanel(new BorderLayout());
        
        
        //Create labels
        
        headingLb1 = new JLabel("Login");
        headingLb1.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        headingLb1.setFont(new Font(Font.SANS_SERIF , Font.BOLD + Font.ITALIC,20));
        headingLb1.setForeground(Color.RED);
        
        usernameLb1 = new JLabel("Username: ");
        
        passwordLb1 = new JLabel("Password: ");
        
        //Create text fields
        usernameTextFld = new JTextField(10);
        usernameTextFld.setFocusable(true);
        
        passwordFld  = new JPasswordField(10);

        //Create buttons 
        
        button1 = new JButton("Submit");
        button2 = new JButton("Clear");
        button3 = new JButton("Exit");

        //add components to the panel 
        
        
        usernamePn1.add(usernameLb1);
        usernamePn1.add(usernameTextFld);
        
        passwordPn1.add(passwordLb1);
        passwordPn1.add(passwordFld);
        
        loginDetails.add(usernamePn1);
        loginDetails.add(passwordPn1);

        headingPn1.add(headingLb1);
        
        buttonPn1.add(button1);
        buttonPn1.add(button2);
        buttonPn1.add(button3);
        
        
        
        headingAndLoginDetailsCombined.add(headingPn1, BorderLayout.NORTH);
        headingAndLoginDetailsCombined.add(loginDetails, BorderLayout.CENTER);
        
             
        mainPn1.add(headingAndLoginDetailsCombined, BorderLayout.NORTH);
        mainPn1.add(buttonPn1, BorderLayout.CENTER);
  
        
        add(mainPn1);
        
        pack();

        
        setVisible(true);
        
        
        
        
    }
    
    
    
    
}
