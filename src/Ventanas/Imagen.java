package Ventanas;


import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class Imagen extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o,
            boolean bln, boolean bln1, int i, int i1) {
        if(o instanceof JLabel){
            JLabel lbl =(JLabel)o;
            return lbl;
        } else {
            
            if(o instanceof JButton){
                JButton jb=(JButton) o;
                if(jb.isSelected()){
                    System.out.println("here");
                }
                return jb;
            }
        }
        return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1); //To change body of generated methods, choose Tools | Templates.
    }
     
}
