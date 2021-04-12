/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author I d e a P a d
 */
public class Smartphone extends Toko{ //menggunakan extends untuk menghubungkan smartphone dengan toko
    int jmlKamera; //membuat tipe data int dengan variabel jmlKamera
 
    public void display(){ //membuat method display 
        System.out.println("Data barang yang di entry : "); //isi method display
    }
    public void setHarga(float harga){ //membuat method setharga dengan parameter float harga
        super.harga = harga; //super untuk memanggil variabel di class yang berbeda
        System.out.println("Harga : "+harga); //untuk menampilkan harga
    }
    public float getHarga(){ //method non void getharga
        return harga; //method non void menggunakan return
    }  
    public void setTotal(int total){ //membuat method settotal dengan parameter int total
        super.total = total;//super untuk memanggil variabel di class yang berbeda
        System.out.println("Total : "+total);//untuk menampilkan total
    }
    public int getTotal(){//method non void
        return total;//method non void menggunakan return
    }
    public void setMerk(String merk){//membuat method setmerk dengan parameter string merk
        super.merk = merk;//super untuk memanggil variabel di class yang berbeda
        System.out.println("Merk : "+merk);//untuk menampilkan merk
    }
    public String getMerk(){//method non void
        return merk;//method non void menggunakan return
    }
    public void setJmlKamera(int jmlKamera){//membuat method setjmlkamera dengan parameter int jmlkamera
        this.jmlKamera = jmlKamera;//karena variabel ada di class yang sama, maka menggunakan this
        System.out.println("Jumlah Kamera : "+jmlKamera);//untuk menampilkan jumlah kamera
    }
    public int getJmlKamera(){//method non void
        return jmlKamera;//method non void menggunakan return
    }
}