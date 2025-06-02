/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ui;

/**
 *
 * @author fabya
 */
public class Buku {
    private String kode;
    private String judul;
    private String genre;
    private String isi;
    
    public Buku(String kode, String judul, String genre, String isi){
        this.kode = kode;
        this.judul = judul;
        this.genre = genre;
        this.isi = isi;
    }
    
    public String getKode(){
        return kode;
    }
    public String getJudul(){
        return judul;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public String getIsi(){
        return isi;
    }
    
    public static Buku fromfile(String kode, String konten){
        String[] parts = konten.split("\n", 3);
        if (parts.length == 3){
            return new Buku(kode, parts[0], parts[1], parts[2]);
        }
        return null;
    }
}
