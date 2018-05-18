/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arvores;

/**
 *
 * @author Pichau
 */
public class Demo {
    
    public static void main(String args[]) {
        ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
        NoArvoreBinaria<Integer> no10 = new NoArvoreBinaria<>(11);
        NoArvoreBinaria<Integer> no9 = new NoArvoreBinaria<>(100);
        NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(180, no9, no10);
        NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(50, no7, null);
        
        NoArvoreBinaria<Integer> no56 = new NoArvoreBinaria<>(540);
        NoArvoreBinaria<Integer> no11 = new NoArvoreBinaria<>(50);
        
        NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(80, no56, no11);
        NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(40, no5, no6);
        NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(50, no4, null);
        
        
        
        
        
        NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(100, no2, null);
        arvore.setRaiz(no1);
        System.out.println(arvore.calcularFolhas());
    }
}
