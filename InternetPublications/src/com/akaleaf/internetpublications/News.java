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
public class News extends Publication {
    
    private String source;
    
    public News(String title, String source) {
    
        super.title = title;
        this.source = source;
    
    }
    
    @Override
    public void outputData() {
    
        System.out.print(title + " News " + source);
        
    }

    public String getSource() {
    
        return this.source;
    
    }
    
    public void setSource(String source) {
    
        this.source = source;
    
    }
    
}
