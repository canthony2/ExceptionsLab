package lab3;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
        
        String lastName = "";
        boolean correctInput = true;
        
        do{
            correctInput = true;
            String fullName = JOptionPane.showInputDialog("Enter full name:");
            try{
                lastName = nameService.extractLastName(fullName);
                String msg = "If you followed the instructions, your last name is: " + lastName;
                JOptionPane.showMessageDialog(null, msg);
            }
        
            catch(EmptyNameException ene) {
                JOptionPane.showMessageDialog(null, "Improper name format: please try again");
            }
            catch(IllegalLengthException ile) {
                JOptionPane.showMessageDialog(null, "Improper name format: please try again");
            }
        }
        while(!correctInput);
    }
     
}
