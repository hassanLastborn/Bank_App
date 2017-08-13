
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author test
 */
public class MainMenu extends javax.swing.JFrame {

    private Bank bank;
    private String saveLocation = null;

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        setLocationRelativeTo(null);                                             //make mainMenu startup @center
        bank = new Bank();                                                       //creates new Bank each time you create Main menu
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JContentPanel = new javax.swing.JPanel();
        addAccountButton = new javax.swing.JButton();
        removeAccountButton = new javax.swing.JButton();
        depositButton = new javax.swing.JButton();
        withdrawButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        accountTable = new javax.swing.JTable();
        MenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        changeMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        openMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Application");

        addAccountButton.setText("Add Account");
        addAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAccountButtonActionPerformed(evt);
            }
        });

        removeAccountButton.setText("Remove Account");
        removeAccountButton.setEnabled(false);
        removeAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAccountButtonActionPerformed(evt);
            }
        });

        depositButton.setText("Deposit Account");
        depositButton.setEnabled(false);
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });

        withdrawButton.setText("Withdrawal");
        withdrawButton.setEnabled(false);
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        accountTable.setAutoCreateRowSorter(true);
        accountTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Account Number", "Balance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        accountTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        accountTable.getTableHeader().setReorderingAllowed(false);
        accountTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(accountTable);
        if (accountTable.getColumnModel().getColumnCount() > 0) {
            accountTable.getColumnModel().getColumn(0).setResizable(false);
            accountTable.getColumnModel().getColumn(1).setResizable(false);
            accountTable.getColumnModel().getColumn(2).setResizable(false);
            accountTable.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout JContentPanelLayout = new javax.swing.GroupLayout(JContentPanel);
        JContentPanel.setLayout(JContentPanelLayout);
        JContentPanelLayout.setHorizontalGroup(
            JContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(JContentPanelLayout.createSequentialGroup()
                        .addComponent(addAccountButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeAccountButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(depositButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(withdrawButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JContentPanelLayout.setVerticalGroup(
            JContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JContentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAccountButton)
                    .addComponent(removeAccountButton)
                    .addComponent(depositButton)
                    .addComponent(withdrawButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        FileMenu.setText("File");

        changeMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        changeMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save2.png"))); // NOI18N
        changeMenuItem.setText("Save");
        changeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(changeMenuItem);

        saveAsMenuItem.setText("Save As....");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(saveAsMenuItem);

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(openMenuItem);

        exitMenuItem.setIcon(new javax.swing.ImageIcon("/Users/test/Desktop/delete.png")); // NOI18N
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(exitMenuItem);

        MenuBar.add(FileMenu);

        editMenu.setText("Edit");
        MenuBar.add(editMenu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void addAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAccountButtonActionPerformed
        AddAccountMenu menu = new AddAccountMenu(this, true, bank);                         //this=parentFrame==MainMenu
        menu.setVisible(true);
        if (menu.getCustomer() != null) {
            addCustomerToTable(menu.getCustomer());

        }
    }//GEN-LAST:event_addAccountButtonActionPerformed

    private void removeAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAccountButtonActionPerformed
        //get selected acct 4rm table,then delete it from the bank
        int selectedRow = accountTable.getSelectedRow();
        if (selectedRow >= 0) {
            Customer customer = getSelectedCustomer(selectedRow);
            if (customer != null) {
                bank.removeCustomer(customer);
                removeCustomerFromTable(selectedRow);

            }
        }
    }//GEN-LAST:event_removeAccountButtonActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        int selectedRow = accountTable.getSelectedRow();
        Customer customer = getSelectedCustomer(selectedRow);
        if (customer != null) {
            DepositMenu menu = new DepositMenu(this, true, customer);
            menu.setVisible(true);
            reloadCustomerRowData(selectedRow, customer);          //reload single row

        }

    }//GEN-LAST:event_depositButtonActionPerformed

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        int selectedRow = accountTable.getSelectedRow();
        Customer customer = getSelectedCustomer(selectedRow);
        if (customer != null) {
            WithdrawalMenu menu = new WithdrawalMenu(this, true, customer);
            menu.setVisible(true);
            reloadCustomerRowData(selectedRow, customer);          //reload single row

        }
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void accountTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountTableMouseClicked
        //Mouse clicked event for the table. Set to true whenever any account is clicked
        setAccountButtonsActive(true);

        if (evt.getClickCount() == 2) {      //This event gets fired if a double click happens

            //Display account details page
            int selectedRow = accountTable.getSelectedRow();            //Selected ROw
            Customer customer = getSelectedCustomer(selectedRow);       //Customer gotten from the row
            if (customer != null) {
                AccountDetailsPage menu = new AccountDetailsPage(this, true, customer);
                menu.setVisible(true);

            }

        }

    }//GEN-LAST:event_accountTableMouseClicked

    private void changeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeMenuItemActionPerformed
        // TODO add your handling code here:
        if (saveLocation != null) { 
            //save file into save location

        } else {
            saveAsMenuItemActionPerformed(evt);
        }


    }//GEN-LAST:event_changeMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new BofFilter());             //Code section to reduce files that can be seen after clicking ctrl+s. This to sdd BOF file to dropDown option 
        chooser.setAcceptAllFileFilterUsed(false);           //Removes the "all file drop down on the save dialog and leave only bofFiles"
        int result = chooser.showOpenDialog(this);           //returns integer. Displays save dialog box
        if (result == JFileChooser.APPROVE_OPTION) {
            if (!chooser.getSelectedFile().toString().toLowerCase().endsWith(".bof")) {
                JOptionPane.showMessageDialog(this, "Unsuppoerted file type selected", "Unsupported File", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    //Open the file
                    FileInputStream fIn = new FileInputStream(chooser.getSelectedFile());
                    ObjectInputStream obIn = new ObjectInputStream(fIn);
                    //Read it in
                    Object bankData = obIn.readObject();
                    if (bankData instanceof Bank) {
                        bank = (Bank) bankData;
                        reloadTable();
                    }
                    saveLocation = chooser.getSelectedFile().toString();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new BofFilter());             //Code section to reduce files that can be seen after clicking ctrl+s. This to sdd BOF file to dropDown option 
        chooser.setAcceptAllFileFilterUsed(false);           //Removes the "all file drop down on the save dialog and leave only bofFiles"
        int result = chooser.showSaveDialog(this);           //returns integer. Displays save dialog box
        if (result == JFileChooser.APPROVE_OPTION) {         //meaning a file has been selected
            File file = chooser.getSelectedFile();                //Get file
            String fileName = file.toString();
            if (!fileName.toLowerCase().endsWith(".bof")) {
                fileName += ".bof";                          //whatever file u try saving, it'll require .bof ext on the end. so even if u save .pdf, it'll save the .bof
            }

            boolean saved = saveFile(fileName);
            if (saved) {            //if saved, set savelocation
                saveLocation = fileName;

            }

        }
    }//GEN-LAST:event_saveAsMenuItemActionPerformed
    private boolean saveFile(String fileName) {
        try {
            FileOutputStream fout = new FileOutputStream(fileName);
            ObjectOutputStream objOut = new ObjectOutputStream(fout);
            objOut.writeObject(bank);//Write bank object. Basically just saving bank object
            objOut.close();
            fout.close();
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        } catch (IOException ex) {
            return false;
        }
    }

    private Customer getSelectedCustomer(int selectedRow) {
        Customer customer = null;
        //get selected customer from the bank. It first checks if you clicked and selected a customer.Note:muliple row selection deactivated
        if (selectedRow >= 0) {   //Atleast one customer has been selected
            int accountNumber = (int) accountTable.getValueAt(selectedRow, 2); //(row,2 is the row of acct number )
            //JOptionPane.showMessageDialog(this, accountNumber);              //since can getAccount number, we return customerof d@ acct number
            customer = bank.getCustomerByAccountNumber(accountNumber);
        }
        return customer;
    }

    //adds customr to able (get the model and then adds Row to the model)    
    private void addCustomerToTable(Customer customer) {                                     //Takes customer object
        //add customer to table
        DefaultTableModel model = (DefaultTableModel) accountTable.getModel();
        //model.setRowCount(model.getRowCount()+ 1);                                           //setting rowCount 1 greater than wat it currently is 
        //model.addRow(new Object[]{customer.getFirstName(), customer.getLastName(), customer.getAccount().getAccountNumber(), customer.getAccount().getBalance()});                   //to add a row(for the table)
        //immediately reloads the customer row data
        model.addRow(new Object[]{});
        reloadCustomerRowData(model.getRowCount() - 1, customer);
    }

    private void removeCustomerFromTable(int row) {
        DefaultTableModel model = (DefaultTableModel) accountTable.getModel();
        model.removeRow(accountTable.getSelectedRow());

    }

    private void reloadCustomerRowData(int selectedRow, Customer customer) {
        DefaultTableModel model = (DefaultTableModel) accountTable.getModel();                //Get model
        model.setValueAt(customer.getFirstName(), selectedRow, 0);
        model.setValueAt(customer.getLastName(), selectedRow, 1);
        model.setValueAt(customer.getAccount().getAccountNumber(), selectedRow, 2);
        model.setValueAt(String.format("%.2f", customer.getAccount().getBalance()), selectedRow, 3);

    }

    //Method to reload table
    private void reloadTable() {
        for (Customer c : bank.getCustomers()) {
            addCustomerToTable(c);

        }

    }

    private void setAccountButtonsActive(boolean active) {
        depositButton.setEnabled(active);
        withdrawButton.setEnabled(active);
        removeAccountButton.setEnabled(active);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu FileMenu;
    private javax.swing.JPanel JContentPanel;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JTable accountTable;
    private javax.swing.JButton addAccountButton;
    private javax.swing.JMenuItem changeMenuItem;
    private javax.swing.JButton depositButton;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JButton removeAccountButton;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JButton withdrawButton;
    // End of variables declaration//GEN-END:variables

}
