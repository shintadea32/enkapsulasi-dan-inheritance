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
public class Tv extends Toko{//menggunakan extends untuk menghubungkan tv dengan toko
    String jenis;//membuat tipe data string dengan variabel jenis
    
    public void display(){//membuat method display 
        System.out.println("Data barang yang di entry : ");//isi method display
    }
    public void setHarga(float harga){//membuat method setharga dengan parameter float harga
        super.harga = harga;//menggunakan super karena variabel berada di class yang berbeda
        System.out.println("Harga : "+harga);//untuk menampilkan harga
    }
    public float getHarga(){//method non void
        return harga;//method non void menggunakan return
    }
    public void setTotal(int total){//membuat method set total dengan parameter int total
        super.total = total;//menggunakan super karena variabel berada di class yang berbeda
        System.out.println("Total : "+total);//untuk menampilkan total
    }
    public int getTotal(){//method non void
        return total;//method non void menggunakan return
    }
    public void setMerk(String merk){//membuat method setmerk dengan parameter string merk
        super.merk = merk;//menggunakan super karena variabel ada di class yang berbeda
        System.out.println("Merk : "+merk);//untuk menampilkan merk
    }
    public String getMerk(){//method non void
        return merk;//method non void menggunakan return
    }
    public void setJenis(String jenis){//membuat method setjenis dengan parameter string jenis
        this.jenis = jenis;//karena variabel berada di class yang sama maka menggunakan this
        System.out.println("Jenis : "+jenis);//untuk menampilkan jenis
    }
    public String getJenis(){//method non void
        return jenis;//method non void menggunakan return
    }   
}