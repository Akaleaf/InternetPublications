package com.akaleaf.internetpublications;

public class PublicationsList {

    private Publication[] publications;
    private int publicationsCount;

    public PublicationsList(int length) {
        
        publications = new Publication[length];
        
    }
    
    /**
    * Добавляет новую публикацию в список
    *
    * @newPublication Новая добавляемая публикация
    * @return результат выполнения работы
    */
    public boolean addPublication(Publication newPublication) {
        
        if (!hasAlreadyExists(newPublication.getTitle)) {
            
            publications[publicationsCount] = newPublication;
            publicationsCount++;
            
        }
        
    }
    
    /**
    * Удаляет публикацию из списка посредством сравнения title.
    *
    * @title Используется для поиска публикации.
    * @return результат выполнения.
    */
    public boolean removePublication(String title) {
        
        findMe(title) = null;
        int i = 0;
        
        while (publications[i] != null) {
            
            i++;
            
        }
        
        while (i != publications.length) {
            
            publications[i] = publications[i + 1];
            
        }
        
    }
    
    /**
    * Выводит список
    */
    public void showMePublications() {
        
        int i = 0;
        
        while (publications[i] != null) {
            
            
            
        }
        
    }
    
    /**
    * Ищет публикацию из списка посредством сравнения title.
    *
    * @title Используется для поиска публикации.
    *  @return публикацию.
    */
    public Publication findMe(String title) {
       
       int i = 0;
       
       while ((publications[i] != null) && !(publications[i].getTitle().equals(title))) {
           
           i++;
           
       }
       
       if (i != publications.length) {
           
           return publications[i];
           
       } else {
           
           return null;
           
       }
        
    }
    
    /**
    * Есть ли уже публикация с таким title.
    *
    *@title для поиска
    *@return Есть ли уже публикация с таким title
    */
    public boolean hasAlreadyExists(String title) {
        
        if (findMe == null) {
            
            return false;
            
        } else {
            
            return true;
            
        }
        
    }
    
    public int getPublicationsCount() {
        
        return publicationsCount;
        
    }
    
}