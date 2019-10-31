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
public class MainCharacter extends Karakter{
    private String namaSamaran;

    public MainCharacter(String name, String food,String drink, String sifat, int umur) {
        super(name, food,drink, sifat, umur);
        this.nama=name;
        this.makanan=food;
        this.sifat=sifat;
        this.umur=umur;
        this.minuman=drink;
    }

    public String getNamaSamaran() {
        return namaSamaran;
    }

    public void setNamaSamaran(String namaSamaran) {
        this.namaSamaran = namaSamaran;
    }

}
