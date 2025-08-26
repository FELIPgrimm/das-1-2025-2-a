package br.univille.observer;

import java.util.ArrayList;

public class Publisher {
    //lista estática 
    //private Subscriber [] subscribers = new Subscriber[10];
    //Lista dinâmica
    private ArrayList <Subscriber> subscribers = new ArrayList<>();
     
    private String mainState;
    public String getMainState() {
        return mainState;
    }
    public void setMainState(String mainState) {
        this.mainState = mainState;
    }

//inscreve ulm assinante na lista de assinante 
    public void subscribe (Subscriber assinante){
        subscribers.add(assinante);
    }
// notifica todo mundo da mensagem nova usando o For
    public void notifySubscribers(){
        for(Subscriber umAssinante: subscribers){
            umAssinante.update(mainState);
        }

    }

}
