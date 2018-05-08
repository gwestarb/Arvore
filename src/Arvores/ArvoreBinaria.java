/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arvores;

/**
 *
 * @author gwestarb
 * @param <T>
 */
public class ArvoreBinaria<T> {
    
    private NoArvoreBinaria<T> raiz;
    public ArvoreBinaria() {
        raiz = null;
    }
    
    public void setRaiz(NoArvoreBinaria<T> raiz){
        this.raiz = raiz;
    }
    
    public boolean estaVazia(){
        return this.raiz == null;
    }
    
    public boolean pertence(T info){
        return pertence(this.raiz, info);
    }
    
    private boolean pertence(NoArvoreBinaria<T> no, T info){
        
        if(no == null)
            return false;
        
        else if(no.getInfo().equals(info))
            return true;
        
        else{
            if(pertence(no.getEsquerda(), info))
                return true;
            else
                return pertence(no.getDireita(), info);
        }
        
    }
    
    @Override
    public String toString(){ 
        return "";
    }
    
    public String arvorePre(NoArvoreBinaria<T> no){
        return "" ;
    }
    
    public int contarNos(){
        return -1;
    }
    
    private int contarNos(NoArvoreBinaria<T> no){
        return -1;
    }
    
}
