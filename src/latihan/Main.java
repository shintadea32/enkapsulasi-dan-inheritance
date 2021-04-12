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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Toko toko = new Toko();//membuat objek toko 
    toko.setAdmin("Shinta Dewi");//mengisi nama admin
    toko.getAdmin();//untuk memanggil admin
    
    Smartphone obj = new Smartphone();//membuat objek smartphone
    System.out.println("==========================");//untuk jeda agar mudah melihat output
    System.out.println("SMARTPHONE");//menampilkan smartphone agar tidak bingung ketika di run
    obj.display();//memanggil method display
    obj.setHarga(1500000);//mengisi harga, lalu memanggil method setharga
    obj.setTotal(1);//mengisi total, lalu memanggil method settotal
    obj.setMerk("Samsung");//mengisi merk, lalu memanggil method setmerk
    obj.setJmlKamera(3);//mengisi jmlkamera, lalu memanggil method setjmlkamera
    
    Tv obj1 = new Tv();//membuat objek tv
    System.out.println("==========================");//untuk jeda agar mudah membedakan setiap class di output
    System.out.println("TV");//menampilkan tv agar tidak bingung ketika run
    obj1.display();//memanggil method display
    obj1.setHarga(1500000);//mengisi harga, lalu memanggil method set harga
    obj1.setTotal(1);//mengisi total, lalu memanggil method settotal
    obj1.setMerk("LG");//mengisi merk, lalu memanggil method setmerk
    obj1.setJenis("Ultra HD");//mengisi jenis, lalu memanggil setjenis
    
    KipasAngin obj2 = new KipasAngin();//membuat objek kipas angin
    System.out.println("==========================");//untuk jeda agar mudah membedakan setiap class di output
    System.out.println("KIPAS ANGIN");//menampilkan kipas angin agar tidak bingung ketika di run
    obj2.display();//memanggil method display
    obj2.setHarga(1200000);//mengisi harga, lalu memanggil method setharga
    obj2.setTotal(1);//mengisi set total, lalu memanggil method set total
    obj2.setMerk("Cosmos");//mengisi merk, lalu memanggil method set merk
    obj2.setUkuran(16);//mengisi set ukuran, lalu memanggil method set ukuran
    }
}