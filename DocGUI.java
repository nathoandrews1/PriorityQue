/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctorqueapp;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Nathan
 */
public class DocGUI extends javax.swing.JFrame implements DocQueInterface {

    /**
     * Creates new form DocGUI
     */
    
    //Creating new patients for default list. I do please ask to create a patient via the GUI with age of 90
   // This will demonstrate the que working with that patient been giving highest priority and then list the 
  //patients again.
    private ArrayList<QueInput> patients; 
    private ArrayList<QueInput> scheduledPatients;
    private String date;
    private Patient Mary = new Patient("Mary Clark", "Cough", 70, true);
    private Patient Paul = new Patient("Paul O'Connor", "Cough, High Temp", 45, false);
    private Patient Colette = new Patient("Colette Andrews", "Cough, Sneeze, Sore Throat, High Temp", 58, false);
    private Patient Joseph = new Patient("Joseph Gates", "Cough, Sneeze, Sore Throat, High Temp", 24, true);
    
    
    public DocGUI() {
        initComponents();
        patients = new ArrayList<QueInput>();
        enQue(Mary);
        enQue(Paul);
        enQue(Colette);
        enQue(Joseph);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameTF = new javax.swing.JTextField();
        nameLbl = new javax.swing.JLabel();
        symptomsTF = new javax.swing.JTextField();
        symptomsLbl = new javax.swing.JLabel();
        ageTF = new javax.swing.JTextField();
        ageLbl = new javax.swing.JLabel();
        medConditionBtn = new javax.swing.JCheckBox();
        medConditionLbl = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        clearAllBtn = new javax.swing.JButton();
        listAllBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAllTF = new javax.swing.JTextArea();
        scheduleListBtn = new javax.swing.JButton();
        queSizeBtn = new javax.swing.JButton();
        scheduleBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLbl.setText("Name:");

        symptomsLbl.setText("Symptoms:");

        ageTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ageTFMousePressed(evt);
            }
        });
        ageTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTFActionPerformed(evt);
            }
        });

        ageLbl.setText("Age:");

        medConditionBtn.setText("Medical Condition");
        medConditionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medConditionBtnActionPerformed(evt);
            }
        });

        medConditionLbl.setText("Do you have a previous medical condition?");

        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        clearAllBtn.setText("Clear Text Fields");
        clearAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllBtnActionPerformed(evt);
            }
        });

        listAllBtn.setText("List All Not Scheduled");
        listAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listAllBtnActionPerformed(evt);
            }
        });

        listAllTF.setColumns(20);
        listAllTF.setRows(5);
        jScrollPane1.setViewportView(listAllTF);

        scheduleListBtn.setText("List Next Scheduled");
        scheduleListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleListBtnActionPerformed(evt);
            }
        });

        queSizeBtn.setText("Current Que Size");
        queSizeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queSizeBtnActionPerformed(evt);
            }
        });

        scheduleBtn.setText("Schedule Que");
        scheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(symptomsLbl)
                        .addGap(18, 18, 18)
                        .addComponent(symptomsTF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLbl)
                        .addGap(18, 18, 18)
                        .addComponent(nameTF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ageLbl)
                        .addGap(18, 18, 18)
                        .addComponent(ageTF))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medConditionBtn)
                            .addComponent(medConditionLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearAllBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submitBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(queSizeBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listAllBtn)
                        .addGap(18, 18, 18)
                        .addComponent(scheduleBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scheduleListBtn)
                        .addGap(0, 242, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(symptomsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(symptomsLbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLbl))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(medConditionLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medConditionBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submitBtn)
                            .addComponent(clearAllBtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(queSizeBtn)
                    .addComponent(listAllBtn)
                    .addComponent(scheduleBtn)
                    .addComponent(scheduleListBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ageTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTFActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
            int age  = Integer.parseInt(ageTF.getText());

            Patient newPatient = new Patient(nameTF.getText(), symptomsTF.getText(), age, medConditionBtn.isSelected());
            //Inside the constructor of QueInput is the patient.createPriority() function which I have made to
           //Create automatically the priority instead of manually having to do so everytime.
            enQue(newPatient);
            JOptionPane.showMessageDialog(null, "You where added to the que");

            //Clear all after submission.
            ageTF.setText("");
            nameTF.setText("");
            symptomsTF.setText("");
            medConditionBtn.setSelected(false);
    }//GEN-LAST:event_submitBtnActionPerformed

    private void clearAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllBtnActionPerformed
        // TODO add your handling code here:
        ageTF.setText("");
        nameTF.setText("");
        symptomsTF.setText("");
        medConditionBtn.setSelected(false);
    }//GEN-LAST:event_clearAllBtnActionPerformed

    private void listAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listAllBtnActionPerformed
        // TODO add your handling code here:
        
        //Set text to empty before listing. This is incase the user presses the button twice.
       //It will not overlap
        listAllTF.setText("");
        listAllTF.setText(printQue());
    }//GEN-LAST:event_listAllBtnActionPerformed

    private void scheduleListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleListBtnActionPerformed
        // TODO add your handling code here:
        listAllTF.setText("");
        listAllTF.setText(scheduledQue());
    }//GEN-LAST:event_scheduleListBtnActionPerformed

    private void medConditionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medConditionBtnActionPerformed
        // TODO add your handling code here:
        boolean trigger = false;
        if (trigger == false){
            trigger = true;
            JOptionPane.showMessageDialog(null,"Please only use this if you have an underlining condition.");
        }
    }//GEN-LAST:event_medConditionBtnActionPerformed

    private void ageTFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageTFMousePressed
        // TODO add your handling code here:
        boolean trigger =  false;
        if(trigger == false){
            trigger = true;
            JOptionPane.showMessageDialog(null, "please enter only NUMBERS!");
        }
    }//GEN-LAST:event_ageTFMousePressed

    private void queSizeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queSizeBtnActionPerformed
        // TODO add your handling code here:
        int queSize = queSize();
        JOptionPane.showMessageDialog(null, "Current size of the que is " + queSize);
    }//GEN-LAST:event_queSizeBtnActionPerformed

    private void scheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleBtnActionPerformed
        // TODO add your handling code here:
        String date = JOptionPane.showInputDialog("Please enter a date");
        Schedule(date);
    }//GEN-LAST:event_scheduleBtnActionPerformed
   
   //Named and followed the convention demonstrated in class.
    public int findInsertPoint(int tempKey){
        boolean foundPos = false;
        int position = 0;
        QueInput quePosition;
        
        //Using while loop like demonstrated in class instead of a for loop as I feel is easier for clarity.
        while(position < patients.size() && foundPos == false)
        {
            quePosition = patients.get(position);
            //When wriing an IF or ELSE statement, if it is one line, it does not have to be contained with {}
            if(quePosition.getKey() > tempKey)
                position += 1;
            
            else
             foundPos = true;
        }
        return position;
    }
    
    @Override
    public void enQue(Object patient) {
        int index;
        //(Patient) is casting the Object type Patient to the input variable patient.         
       //We also cast down the parameters from this methods input to the below constructor.
      //This can be done for any other types like (String)(int)(double) or any other Object etc.
       
      QueInput elem = new QueInput((Patient)patient);
      index = findInsertPoint(elem.getKey());
      
        if (index == queSize())
            this.patients.add(elem);
        else
            this.patients.add(index, elem);
    }
    
    //Method to Schedule instead of having it all in the button.
    public void Schedule(String date){
        this.date = date;
        scheduledPatients = new ArrayList<QueInput>();
        scheduledPatients.addAll(patients);
        
        while(!patients.isEmpty()){
            //or could simply use the deQue();
            patients.remove(0);
        }
        //Incase the list is active after scheduling set it to empty again.
        listAllTF.setText("");
        JOptionPane.showMessageDialog(null, "Patients Scheduled for " + date + "\nCurrent Que emptied");
    }
    
    @Override
    public int queSize() {
        return patients.size();
    }

    @Override
    public  Object deQue() {
        return patients.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return patients.isEmpty();
    }
    
    @Override
    public String printQue()
    {
        String print = "";
        QueInput elem;
        
        for(int i = 0;i< patients.size(); i++){
            elem = patients.get(i);
            //using print.concat to bypass presedence as demonstrated in class.
            print = print.concat(elem.printPatients() + "\nPriority = "+elem.getKey() + "\n\n");
        }
        return print;

    }
    
    //Another method for printing the scheduledQue only
        public String scheduledQue()
    {
        String print = "";
        QueInput elem;
        JOptionPane.showMessageDialog(null, "There are " + scheduledPatients.size() + " in the que\nThe date for this que is " + date);
        
        for(int i = 0;i< scheduledPatients.size(); i++){
            elem = scheduledPatients.get(i);
            //using print.concat to bypass presedence as demonstrated in class.
            print = print.concat(elem.printPatients() + "\nPriority = "+elem.getKey() + "\n\n");
        }
        return print;
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
            java.util.logging.Logger.getLogger(DocGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DocGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DocGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DocGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DocGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTF;
    private javax.swing.JButton clearAllBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listAllBtn;
    private javax.swing.JTextArea listAllTF;
    private javax.swing.JCheckBox medConditionBtn;
    private javax.swing.JLabel medConditionLbl;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton queSizeBtn;
    private javax.swing.JButton scheduleBtn;
    private javax.swing.JButton scheduleListBtn;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel symptomsLbl;
    private javax.swing.JTextField symptomsTF;
    // End of variables declaration//GEN-END:variables
}
