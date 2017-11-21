/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C I C I L I A
 */
public class SimpulBinaryTree {
        //paket data terlihat anggota
    int element;
    SimpulBinaryTree anakkiri;
    SimpulBinaryTree anakkanan;
    //konstruktor
    public SimpulBinaryTree(){}
    public SimpulBinaryTree(int theElement){
        element = (int) theElement;
    }
    public SimpulBinaryTree(int theElement, SimpulBinaryTree theleftChild, SimpulBinaryTree therightChild){
        element = (int) theElement;
        anakkiri = theleftChild;
        anakkanan = theleftChild;
    }

    public SimpulBinaryTree getAnakkiri() {
        return anakkiri;
    }

    public SimpulBinaryTree getAnakkanan() {
        return anakkanan;
    }

    public int getElement() {
        return element;
    }
}
