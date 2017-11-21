/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C I C I L I A
 */
public class Penguat {
    int turunankedaun, turunandariinduk;
    boolean penguatDisini;
    public SimpulBinaryTree root;
    public Penguat(){}
    public Penguat(int dariinduk){
        turunandariinduk = dariinduk;
    }
    @Override
    public String toString(){
        return penguatDisini + " " + turunankedaun + " " + turunandariinduk;
    }
    public void insert(int id){
        SimpulBinaryTree newsimpul = new SimpulBinaryTree();
        newsimpul.element = id;
        if(root == null)
            root = newsimpul;
        else{
            SimpulBinaryTree current = root;
            SimpulBinaryTree parent;
            while(true){
                parent = current;
                if(id < current.element){
                    current = current.anakkiri;
                    if(current == null){
                        parent.anakkiri = newsimpul;
                        return;
                    }
                }
                else{
                    current = current.anakkanan;
                    if(current == null){
                        parent.anakkanan = newsimpul;
                        return;
                    }
                }
            }
        }
    }
    public void tempatPenguat(SimpulBinaryTree x){
        Penguat elementX = (Penguat) x.element;
        elementX.turunankedaun = 0;
        SimpulBinaryTree y = x.anakkiri;
        if(y != null){
            Penguat elementY = (Penguat) y.element;
            int toleransi = 2;
            int degradasi = elementY.turunankedaun + elementY.turunandariinduk;
            if(degradasi > toleransi){
                elementY.penguatDisini = true;
                elementX.turunankedaun = elementY.turunandariinduk;
            }
            else
                elementX.turunankedaun = degradasi;
        }
        y = x.anakkanan;
        if(y != null){
            Penguat elementY = (Penguat) y.element;
            int toleransi = 2;
            int degradasi = elementY.turunankedaun + elementY.turunandariinduk;
            if(degradasi > toleransi){
                elementY.penguatDisini = true;
                degradasi = elementY.turunandariinduk;
            }
            elementX.turunankedaun = Math.max(elementX.turunankedaun, degradasi);
        }
    }
}
