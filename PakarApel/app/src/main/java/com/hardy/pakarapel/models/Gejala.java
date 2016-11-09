package com.hardy.pakarapel.models;

/**
 * Created by rama on 11/5/16.
 */

public class Gejala {
    private int id;
    private String gid,gejala;

    public Gejala(int id, String gid, String gejala) {
        this.id = id;
        this.gid = gid;
        this.gejala = gejala;
    }

    public Gejala(String gid, String gejala) {
        this.gid = gid;
        this.gejala = gejala;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getGejala() {
        return gejala;
    }

    public void setGejala(String gejala) {
        this.gejala = gejala;
    }
}
