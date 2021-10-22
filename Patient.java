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
public class Patient {
    private String name, symptoms;
    private int priorityKey;
    private int age;
    private boolean medCondition;

    //Overloaded constructor
    public Patient(String name, String symptoms, int age, boolean medCondition){
        this.name = name;
        this.symptoms = symptoms;
        this.medCondition = medCondition;
        this.age = age;
        this.priorityKey = createPriority();
    }
    //Incase constructor is called without overloaded parameters.
    public Patient(){
        name = "";
        symptoms = "";
        age = 0;
        medCondition = false;

        /* or the way in which we where taught this year.
        name = new String();
        symptoms = new String();
        */
    }

    public int getAge(){
        return this.age;
    }

    public String getName() {
        return name;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSymptoms(String symptoms){
        this.symptoms = symptoms;
    }

    public int getPrioKey(){
        return this.priorityKey;
    }

    public void setPrioKey(int inputKey){
        this.priorityKey = inputKey;
    }

    public boolean getMedCondition(){
        return this.medCondition;
    }

    public void setMedCondition(Boolean input){
        this.medCondition = input;
    }

    //A below method to initalize the priorityKey variable with the right priority for age.
   //I like to use the this keyword as I feel it makes it simpler to understand when reading
  // When one knows the concept. this class.
    public int createPriority(){
        if(this.age >= 90)
        {
            priorityKey = 10;
        }
        else if( this.age >= 80)
        {
            priorityKey = 9;
        }
        else if( this.age >= 70 )
        {
            priorityKey = 8;
        }
        else if( this.age >= 65 )
        {
            if( this.age <= 69 )
            {
            priorityKey = 7;
            }
        }
        else if( this.age >= 18 && medCondition == true)
        {
            if( this.age <= 64 && medCondition == true)
            {
                priorityKey = 6;
            }
        }

        else if( this.age >= 55 )
        {
            if( this.age <= 64 )
            priorityKey = 5;
        }
        else if( this.age >= 45 )
        {
            if( this.age <= 54 )
            {
                priorityKey = 4;
            }
        }
        else if( this.age >= 30 )
        {
            if( this.age <= 44 )
            {
                 priorityKey = 3;
            }
        }
        else if( this.age >= 18 )
        {
            if( this.age <= 29 )
            {
            priorityKey = 2;
            }
        }
        else if( this.age < 18 )
        {
            priorityKey = 1;
        }
        return priorityKey;
    }
}
