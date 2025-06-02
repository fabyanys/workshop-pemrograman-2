/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ui;

/**
 *
 * @author fabya
 */
import java.io.*;

public class UserStorage {
    private static final String FILE_NAME = "users.txt";

    public static void saveUser(String username, String id) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.write(username + "," + id);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Gagal menyimpan pengguna.");
        }
    }

    public static boolean validateUser(String username, String id) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(id)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca data pengguna.");
        }
        return false;
    }
}
