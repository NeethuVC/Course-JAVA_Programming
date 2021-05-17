/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

import java.util.ArrayList;

public class MessagingService {
    
    private ArrayList<Message> messages;
    public MessagingService(){
        messages=new ArrayList<>();
    }
    public MessagingService(ArrayList<Message> message){
        this.messages=message;
    }
    public void add(Message message){
        if(message.getContent().length()<=280){
            messages.add(message);
        }
        
    }
    public ArrayList<Message> getMessages(){
        return messages;
    }
    
    
}
