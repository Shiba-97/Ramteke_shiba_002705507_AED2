/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;



/**
 *
 * @author Shiba
 */
public class Request {
    ArrayList<Token> requests;
    
    public void Token(){
        this.requests = new ArrayList<Token>();
        }
    public Token addToken(){
        Token tok = new Token();
        requests.add(tok);
        return tok;
    }
    public void deleteToken(Token tok){
        requests.remove(tok);
    }
    
    public ArrayList<Token> getRequests() {
        return requests;
    }

    public void setRequests(ArrayList<Token> requests) {
        this.requests = requests;
    }
    
}
