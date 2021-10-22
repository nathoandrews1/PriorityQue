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
public interface DocQueInterface {
    public void enQue(Object patient);
    public int queSize();
    public Object deQue();
    public boolean isEmpty();
    public String printQue();
}
