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
public class Article extends Publication {
    
    private String author;
    
    public Article(String title, String author) {
    
        this.title = title;
        this.author = author;
    
    }
    
    @Override
    public void outputData() {
    
        System.out.print(title + " Article " + author);
        
    }
    
    public String getAuthor() {
    
        return this.author;
    
    }
    
    public void setAuthor(String author) {
    
        this.author = author;
    
    }
    
}
