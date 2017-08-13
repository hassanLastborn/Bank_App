
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author test
 */
public class DepositMenu extends javax.swing.JDialog {

    private final Customer customer;

    /**
     * Creates new form DepositMenu
     */
    public DepositMenu(java.awt.Frame parent, boolean modal, Customer customer) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.customer = customer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        amountLabel = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        depositButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Deposit Menu");
        getContentPane().setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        amountLabel.setText("Deposit Amount");
        getContentPane().add(amountLabel);
        getContentPane().add(amountField);

        depositButton.setText("Deposit");
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });
        getContentPane().add(depositButton);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_cancelButtonActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed

        StringBuilder warnings = new StringBuilder();

        //Verify deposit is not empty
        if (amountField.getText().isEmpty()) {
            warnings.append("Deposit amount is required\n");
        } else {
            double amount = 0;
            //Verify the deposit is +ve number
            try {
                amount = Bank.round(Double.parseDouble(amountField.getText()), 2);

                //Make the deposit(Verify with the customer first confirming transaction)
                int result = JOptionPane.showConfirmDialog(this, "Deposit $" + String.format("%.2f",amount) + "to the account?\nIntererest you earned is: $:" + String.format("%.2f",(customer.getAccount().getInterest() * amount)));
                if (result == JOptionPane.OK_OPTION) {
                    try {
                        customer.getAccount().deposit(amount);
                        this.dispose();

                    } catch (InvalidAmountException ex) {
                        warnings.append("Deposit amount is invalid\n");
                    }
                }

            } catch (NumberFormatException ex) {
                warnings.append("Deposit must be a number\n");
            }

        }
        if (warnings.length() > 0) {
            JOptionPane.showMessageDialog(this, warnings.toString(), "Deposit Warnings", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_depositButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountField;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton depositButton;
    // End of variables declaration//GEN-END:variables
}
