import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

//this class will inherit from JFrame
public class PasswordGeneratorGUI extends JFrame{
    private PasswordGenerator pgen = new PasswordGenerator(); 

    public PasswordGeneratorGUI(){
        //Render and Add frame Title.
        super("Password Generator");

        //Set Width & Height of the GUI
        setSize(540, 570);

        //prevent GUI from being able to resized
        setResizable(false);

        //Center the GUI in the screen
        setLocationRelativeTo(null);

        //Set the layout to null to have control over the position and size of our components in the app
        setLayout(null);

        //Terminate the program when the GUI is closed.
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //render GUI components
        addGuiComponents();
    }

    private void addGuiComponents(){
        //--------------------------------------Creating Label--------------------------------------------
        //Create App Label
        JLabel appLabel = new JLabel("Srong Password Generator");

        //Set font style
        appLabel.setFont(new Font("Dialog", Font.BOLD, 32));

        //Align the label Component at CENTEr
        appLabel.setHorizontalAlignment(SwingConstants.CENTER);

        //Set the reserved bounding area of the label
        appLabel.setBounds(0, 10, 540, 39);   //x and y is measured from main origin left top corner.

        //Now add the label component to GUI
        add(appLabel);
        
        //-------------------------------------Creating Result Text Area------------------------------------
        JTextArea passwordOutput = new JTextArea();

        //prevent editing the result
        passwordOutput.setEditable(false);
        
        //set font for output text
        passwordOutput.setFont(new Font("Dialog", Font.BOLD, 32));

        //Enable Scrollability (In case if password becomes too long)
        JScrollPane outputScroll = new JScrollPane(passwordOutput);
        outputScroll.setBounds(25, 97, 479, 70);

        //Create a block border around the result box
        outputScroll.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        
        //Add to result aread to GUI
        add(outputScroll);

        //--------------------------------------Creating Password Length Label---------------------------------
        JLabel passwordLengthLabel = new JLabel("Password Length: ");
        passwordLengthLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
        passwordLengthLabel.setBounds(23, 215, 200, 39);
        add(passwordLengthLabel);
        //Also create Password Length input Text area
        JTextArea passwordLengthInputArea = new JTextArea();
        passwordLengthInputArea.setFont(new Font("Dialog", Font.BOLD, 32));
        passwordLengthInputArea.setBounds(210 ,215, 192, 39);
        add(passwordLengthInputArea);

        //-------------------------------------Creating Toggle buttons-----------------------------------------

        //UpperCase toggle button:
        JToggleButton uppercaseToggle = new JToggleButton("Uppercase");
        uppercaseToggle.setBounds(25, 302, 225, 56);
        add(uppercaseToggle);

        //LowerCase toggle button:
        JToggleButton lowercaseToggle = new JToggleButton("Lowercase");
        lowercaseToggle.setBounds(260, 302, 225, 56);
        add(lowercaseToggle);

        //Numbers toggle button:
        JToggleButton numbersToggle = new JToggleButton("Numbers");
        numbersToggle.setBounds(25, 365, 225, 56);
        add(numbersToggle);

        //Symbols toggle button:
        JToggleButton symbolsToggle = new JToggleButton("Symbols");
        symbolsToggle.setBounds(260, 365, 225, 56);
        add(symbolsToggle);

        //Generate Button at the Bottom
        JToggleButton generateButton = new JToggleButton("Generate");
        generateButton.setBounds(145, 430, 225, 56 );

        //We need to add ActionListener to read the input options given by the user.
        //If length<=0 or Any toggle is not selected, then we will terminate. Otherwise we will call generatePassword() with reqd. parameters we got from user
        generateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                String inputPasswordLengthString = passwordLengthInputArea.getText(); //get the input Length as text
                int inputPasswordLength = Integer.parseInt(inputPasswordLengthString); // then convert the input length text to Int
                
                if(inputPasswordLength<=0){
                    return;
                }

                boolean anytoggle = uppercaseToggle.isSelected() || lowercaseToggle.isSelected() || numbersToggle.isSelected() || symbolsToggle.isSelected();  //Store TRUE or FALSE according to user toggling 
                
                //If any toggle is On then call generatePassword() and return the string value to String generatepassword.
                if(anytoggle){
                   String generatedpassword = pgen.generatePassword(inputPasswordLength, uppercaseToggle.isSelected(), lowercaseToggle.isSelected(), numbersToggle.isSelected(), symbolsToggle.isSelected());

                    //Then display the output in the passwordOutput Area
                    passwordOutput.setText(generatedpassword);
                }

            }
        });
        add(generateButton);
    }
}
