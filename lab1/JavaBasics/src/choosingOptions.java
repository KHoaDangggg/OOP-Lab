
import javax.swing.JOptionPane;
public class choosingOptions {
    public static void main(String args[]){
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION?"I do":"I don't"));
        System.exit(0);
    }
}
