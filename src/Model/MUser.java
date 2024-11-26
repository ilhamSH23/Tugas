/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Client
 */
public class MUser {
    static String role;
    int id_user;
    String nama_user;

    public static String getRole() {
        return role;
    }

    public static void setRole(String role) {
        MUser.role = role;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNama_user() {
        return nama_user;
    }

    public void setNama_user(String nama_user) {
        this.nama_user = nama_user;
    }

    public MUser(int id_user, String nama_user) {
        this.id_user = id_user;
        this.nama_user = nama_user;
    }
    }
    

