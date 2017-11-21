
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author C I C I L I A
 */
public class Main {
    public static void main(String [] args){
        Penguat x = new Penguat();
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan jumlah data : ");
        int y = in.nextInt();
        for(int i = 0; i < y; i++){
            System.out.println("Data ke " + (i+1) + " = ");
            x.insert(in.nextInt());
        }
    }
}
