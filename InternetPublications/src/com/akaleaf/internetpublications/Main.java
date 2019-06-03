/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akaleaf.internetpublications;

import java.util.Scanner;

/**
 *
 * @author akaleaf
 */
public class Main {
    
    public static void main(String args[]) {
    
        Publication[] publications = new Publication[10];
        int publicationsTop = -1;
        int answer = 0;
        Scanner in = new Scanner();
    
        while (answer != 11) {

            System.out.println("1. Add article");
            System.out.println("2. Add news");
            System.out.println("3. Show me publications");
            System.out.println("11. Exit");
        
            switch (answer) {
            
                case 1: {
            
                    System.out.print("  Enter the title of new article: ");
                    String title = in.nextLine();
                    System.out.print("  Enter the author of new article: ");
                    String author = in.nextLine();
                
                    publications[publicationsTop++] = new Article(title, author);
                    break;
            
                }
            
                case 2: {
            
                    System.out.print("  Enter the title of new article: ");
                    String title = in.nextLine();
                    System.out.print("  Enter the source of new article: ");
                    String source = in.nextLine();
                
                    publications[publicationsTop++] = new News(title, source);
                    break;
            
                }
                
                case 3: {
            
                    for (int i = 0; i != publications.length; i++) {
                    
                        publications[i].outputData();
                    
                    }
                    break;
            
                }
        
            }
        
        }
    
    }
    
}
