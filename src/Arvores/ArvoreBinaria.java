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
    
    //Pior caso é Linear O(n)
    //Melhor caso Constando O(0)
    //Pre-ordem a raiz é primeira acessada e no pos-ordem a raiz é a última a ser acessada
    private boolean pertence(NoArvoreBinaria<T> no, T info){
        
        if(no == null){
            return false;
        }
        else return(no.getInfo().equals(info) || 
                pertence(no.getEsquerda(), info) || 
                pertence(no.getDireita(), info));        
    }
    
    //representacao textual de uma arvore vazia <raiz rt(se) rt(sd)>
    //<r<58<><>><>>
    @Override
    public String toString(){ 
        return arvorePre(raiz);
    }
    
    public String arvorePre(NoArvoreBinaria<T> no){
        if (no == null) {
            return "<>";
        }else{
            return "<" + no.getInfo() + 
                    arvorePre(no.getEsquerda()) +
                    arvorePre(no.getDireita()) + ">";
        }
    }
    
    public int contarNos(){
        return contarNos(raiz);
    }
    
    private int contarNos(NoArvoreBinaria<T> no){
        if (no == null) {
            return 0;
        }
        else{
            return 1 + contarNos(no.getEsquerda()) + 
                       contarNos(no.getDireita());
        }
    }
}
