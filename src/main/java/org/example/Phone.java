package org.example;

public class Phone {
    private int number;
    public String model;
    public int weight;


    public Phone (int number,String model,int weight){
        this.number=number;
        this.model=model;
        this.weight=weight;
    }
    public Phone (int number,String model){
        this.number=number;
        this.model=model;

    }
    public Phone (){    }

    public void receiveCall(String name){
        System.out.println(name+" is calling");
    }

    public void receiveCall(String name,int number){
        System.out.println(name+" is calling"+'\n'+number);
    }

    public void sendMessage(int number){
        System.out.println("Message send on "+number);
    }
    public int getNumber(){
        return number;
    }
}
