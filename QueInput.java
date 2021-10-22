/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctorqueapp;

/**
 *
 * @author Nathan
 */
public class QueInput {
    int key;
    private Patient patient;

    public QueInput(Patient patient){
        this.patient = patient;
        this.key = this.patient.getPrioKey();
    }

    //Probably never going to need this but, I put it in as is the standard for getters/setters
    public void setKey(int key) {
        this.key = key;
    }

    //Set patient using Patient Object type as the input Oject being the type, Patient being our
   //Our custom defined object. I am just leaving these comments to show understanding etc.
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getKey() {
        return key;
    }

    public Patient getElement() {
        return patient;
    }

    public String printPatients(){
        String msg;
        msg  = "Name = " + patient.getName() + "\nAge = " + patient.getAge() + "\nSymptoms: " + patient.getSymptoms() + "\nPrevious Medical Condition = " + patient.getMedCondition();
        return msg;
    }
}
