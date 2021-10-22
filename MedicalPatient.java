/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctorqueapp;

/**
 *
 * @author Nathan
 * this was just a bit of practice with an abstract class. As it is similar to the interface.
 * Not sure what the advantages of this would bring if it was implemented this way.
 */
public abstract class MedicalPatient {
    String name, symptoms;
    int priorityKey, age;
    boolean medCondition;

    abstract int createPriority();
}
