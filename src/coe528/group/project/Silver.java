/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.group.project;

/**
 *
 * @author tahag
 */
class Silver extends State{    
    @Override
    protected void setSilver(Customer C) {
        if(C.getPoints()< 1000){
            C.setStatus(new Silver());
         }else{
            setGold(C);
        }
    }

    @Override
    protected void setGold(Customer C) {
        if(C.getPoints()>= 1000){
             C.setStatus(new Gold());
         }else{
            setSilver(C);
        }
    }

    @Override
    public String toString() {
        return "Silver";
    }
    
}


