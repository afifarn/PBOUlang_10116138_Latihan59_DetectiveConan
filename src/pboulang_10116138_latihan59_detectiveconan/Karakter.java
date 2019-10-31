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
public class Karakter {
    protected String nama;
    protected String makanan;
    protected String minuman;
    protected String sifat;
    protected int umur;
    
    public Karakter(String name, String food,String drink, String sifat, int umur){
        this.nama=name;
        this.makanan=food;
        this.sifat=sifat;
        this.umur=umur;
        this.minuman=drink;
}
    public void displayKarakter(){
        System.out.println("Nama : "+nama);
        System.out.println("Makanan kesukaan : "+makanan);
        System.out.println("Minuman kesukaan : "+minuman);
        System.out.println("sifat : "+sifat);
        System.out.println("umur : "+umur);
    }

}
