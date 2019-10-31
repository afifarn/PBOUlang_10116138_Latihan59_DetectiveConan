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
public class PemeranPendukung extends Karakter{
    private String panggilan;

    public PemeranPendukung(String name, String food,String drink, String sifat, int umur) {
        super(name, food,drink, sifat, umur);
        this.nama=name;
        this.makanan=food;
        this.sifat=sifat;
        this.umur=umur;
        this.minuman=drink;
    }

    public String getPanggilan() {
        return panggilan;
    }

    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }

}
