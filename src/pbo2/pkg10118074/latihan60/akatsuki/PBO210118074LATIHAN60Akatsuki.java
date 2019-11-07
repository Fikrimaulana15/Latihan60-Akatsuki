/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.latihan60.akatsuki;

    import java.util.Scanner;
/**
 *
 * @author ASUS
 * NAMA : FIKRI MAULANA
 * KELAS : IF2
 * NIM : 101180741
 */
public class PBO210118074LATIHAN60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
        Akatsuki akatsuki = new Akatsuki();
        
        System.out.println("===Tokoh Akatsuki Berdasarkan Desa/Asal===");
        akatsuki.tampilDaftarDesa();
        akatsuki.setDesa(sc.nextInt());
        
        System.out.println("");
        
        akatsuki.tampilAnggotaDesa(akatsuki.getDesa());
        
        System.out.println("developed by : fikri maulana");
    }
    
}
    

