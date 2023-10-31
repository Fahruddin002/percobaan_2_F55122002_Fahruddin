package com.faruk.percobaan2;

public class ProgramEnkapsulasi {
    private String nama;
    private int umur;
    public ProgramEnkapsulasi(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }
    public String getNama() { return nama; }
    public int getUmur(){
        return umur;
    }
    public void setNama(String nama) {this.nama = nama;}
    public  void setUmur(int umur){
        if (umur >= 0){
            this.umur = umur;
        } else {
            System.out.println ("Umur tidak valid, ");
        }
    }
    public static void main(String[] args){
        ProgramEnkapsulasi person = new ProgramEnkapsulasi("Fahruddin A.Lebe",19);
        System.out.println("Nama: " + person.getNama());
        System.out.println("Umur: " + person.getUmur());

        person.setNama("Alvi");
        person.setUmur(19);

        System.out.println("Nama setelah perubahan: " + person.getNama());
        System.out.println("Umur setelah perubahan: " + person.getUmur());
    }
}

