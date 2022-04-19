/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author Soha
 */
import View.NewJFrame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NewLine extends JDialog {

    private JTextField itemNameTF;
    private JLabel itemNameL;
    
    private JTextField itemCountTF;
    private JLabel itemCountL;
    
    private JTextField itemPriceTF;
    private JLabel itemPriceL;
    
    private JButton okButton;
    private JButton canselButton;

    public NewLine(NewJFrame frame) {
       
        
        itemNameL = new JLabel("Item Name : ");
        itemNameTF = new JTextField(20);
        
        itemCountL = new JLabel("Count : ");
        itemCountTF = new JTextField(20);
        
        itemPriceL = new JLabel("Item Price : ");
        itemPriceTF = new JTextField(20);
        
        okButton = new JButton("Ok");
        canselButton = new JButton("Cancel");

        okButton.setActionCommand("createItemOk");
        canselButton.setActionCommand("createItemCancel");

        okButton.addActionListener(frame);
        canselButton.addActionListener(frame);

        setLayout(new GridLayout(4, 2));
        setSize(200, 200);
        setLocation(200, 300);

        add(itemNameL);
        add(itemNameTF);
        add(itemCountL);
        add(itemCountTF);
        add(itemPriceL);
        add(itemPriceTF);
        add(okButton);
        add(canselButton);
        
        pack();

    }

    public JTextField getItemNameTF() {
        return itemNameTF;
    }

    public JTextField getItemCountTF() {
        return itemCountTF;
    }

    public JTextField getItemPriceTF() {
        return itemPriceTF;
    }



}