/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akaleaf.internetpublications;

/**
 *
 * @author akaleaf
 */
abstract public class Publication {
    
    protected String title;
    
    public Publication(String title) {
    
        this.title = title;
        
    }
    
    abstract public void outputData();
    
//    public String getTitle() {
//    
//        return this.title;
//    
//    }
//    
//    public void setTitle(String title) {
//    
//        this.title = title;
//    
//    }
    
}