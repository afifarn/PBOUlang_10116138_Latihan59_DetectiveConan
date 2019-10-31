/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116138_latihan59_detectiveconan;

/**
 *
 * @author Aradnu
 */
public class PBOUlang_10116138_Latihan59_DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainCharacter mc = new MainCharacter("Shinichi Kudo", "pai Lemon","Es Kopi", "ambisius", 21);
        mc.setNamaSamaran("Conan");
        mc.displayKarakter();
        System.out.println("Nama Samaran : "+ mc.getNamaSamaran());
        
        System.out.println("");
    
        PemeranPendukung pp = new PemeranPendukung("Kogoro Mouri","Ramen","Beer","Sedikit Sombong", 30);
        pp.setPanggilan("Heiji");
        pp.displayKarakter();
        System.out.println("Nama Panggilan : " + pp.getPanggilan());
        System.out.println("");
        
        PemeranPendukung pp2 = new PemeranPendukung("Ran Mouri","Cake","Juice","Pengertian", 30);
        pp2.setPanggilan("Ran");
        pp2.displayKarakter();
        System.out.println("Nama Panggilan : " + pp2.getPanggilan());
        System.out.println("");

    }
    
}
