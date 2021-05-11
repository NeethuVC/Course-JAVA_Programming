/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Book {
    private String title;
    private int pages;
    private int year;
    
    public Book(String a,int b,int c){
        title=a;
        pages=b;
        year=c;
    }
    public String toString(){
        return this.title + ", " + this.pages + " pages, "+ this.year;
    }
    public String getTitle(){
     return this.title;
    }
    
    
    
}
