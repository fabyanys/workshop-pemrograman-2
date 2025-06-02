/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ui;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author fabya
 */
public class BukuManager {
    private final String FOLDER_PATH = "books/";
    
    public BukuManager(){
        File folder = new File(FOLDER_PATH);
        if(!folder.exists()){
            folder.mkdir();
        }
    }
    
    public Buku bacaBuku(String kode){
        try {
            File file = new File(FOLDER_PATH + kode + ".txt");
            if (!file.exists()){
                System.out.println("Buku dengan kode \"" + kode + "\" tidak ditemukan.");
                return null;
            }
            
            BufferedReader reader = new BufferedReader(new FileReader(file));
                        
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null){
                sb.append(line).append("\n");
            }
            
            reader.close();
            return Buku.fromfile(kode, sb.toString().trim());
        } catch (IOException e){
            System.out.println("Gagal membaca buku: " + e.getMessage());
            return null;
        }
    }
    
    public boolean isKodeBukuAda(String kode) {
        File file = new File(FOLDER_PATH + kode + ".txt");
        return file.exists();
    }
}
