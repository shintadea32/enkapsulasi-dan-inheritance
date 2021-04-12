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
public class Toko {
    private String admin;
    float harga; //memiliki tipe data float dengan variabel harga
    int total; //memiliki tipe data int dengan variabel total
    String merk; //memiliki tipe data string dengan variabel merk
   
    
    public void display(){  //memiliki method dengan nama display
        System.out.println("Data barang yang di entry : "); //isi method display
    }
    public void setAdmin(String admin){ //memiliki method dengan nama setAdmin
        this.admin = admin; //this digunakan untuk variabel yang ada didalam class
        System.out.println("Adminnya : "+admin); //untuk memunculkan nama admin
    }
    public String getAdmin(){ //membuat method non void
        return admin; //method non void menggunakan return
    
    }  
}