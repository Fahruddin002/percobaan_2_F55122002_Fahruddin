package com.faruk.percobaan2;

public class ProgramConstructor {
    private String merk;
    private static String pemilik;

    protected ProgramConstructor(){

        merk = null;
    }
    protected ProgramConstructor(String merk){

        this.merk = merk;
    }
    protected void setMerk(String merk){
        this.merk = merk;
    }
    protected String getMerk(){
        return merk;
    }
    protected static void setPemilik(String pemilik){

        ProgramConstructor.pemilik = pemilik;
    }
    protected static String getPemilik(){

        return ProgramConstructor.pemilik;
    }
    protected  void tampil(String a){
        System.out.println(a);
    }
    protected void hapus(){
        merk = null;
        pemilik = null;
    }
    public static void main(String[] args){
        ProgramConstructor program = new ProgramConstructor();
        program.setMerk("Toyota");
        System.out.println("merek: " + program.getMerk());

        ProgramConstructor.setPemilik(("Fahruddin A.Lebe"));
        System.out.println("Pemilik: " + ProgramConstructor.getPemilik());
    }
}
