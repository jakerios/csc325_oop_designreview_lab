/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author jakerios
 */
public class Freshman extends Student {
    private int credits;
    
    public Freshman(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }
    
    /**
     * Overridden toString method
     * @return 
     */
    @Override
    public String toString() {
        String res = super.getName() + " " + super.getAge() + " " + credits + super.getGPA();
        return res;
    }
    
}
