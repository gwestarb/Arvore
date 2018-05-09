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

public final class NoArvoreBinaria<T> {
    private T info;
    private NoArvoreBinaria<T> esquerda;
    private NoArvoreBinaria<T> direita;
    
    /**
     * Cria um nó sem sub-arvores à esquerda e direita
     * @param info Valor a ser armazenado na árvore
     */
    public NoArvoreBinaria(T info) {
        this.setInfo(info);
        esquerda = null;
        direita = null;
    }
    
    public NoArvoreBinaria(T info, NoArvoreBinaria<T> esq, NoArvoreBinaria<T> dir){
        this.setInfo(info);
        this.setEsquerda(esq);
        this.setDireita(dir);
    }
    
    public void setInfo(T info){
        this.info = info;
    }
    
    public T getInfo(){
        return info;
    }
    
    public NoArvoreBinaria<T> getEsquerda(){
        return esquerda;
    }
    
    public NoArvoreBinaria<T> getDireita(){
        return direita;
    }
    
    public void setEsquerda(NoArvoreBinaria<T> esquerda){
        this.esquerda = esquerda;
    }
    
    public void setDireita(NoArvoreBinaria<T> direita){
        this.direita = direita;
    }
}
