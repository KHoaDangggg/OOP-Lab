package hust.soict.ICT.lab01.JavaBasics;

import javax.swing.JOptionPane;
public class choosingOptions {
    public static void main(String args[]){
        Object[] options = {"I do",
                "I don't"};
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
        //Customize dialog
//        int option = JOptionPane.showOptionDialog(null,
//                "Do you want to change to the first class ticket?",
//                null,
//                JOptionPane.OK_CANCEL_OPTION,
//                JOptionPane.INFORMATION_MESSAGE,
//                null,
//                new String[]{"I do", "I don't"},
//                "default");
        JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION?"I do":"I don't"));
        System.exit(0);
    }
}
