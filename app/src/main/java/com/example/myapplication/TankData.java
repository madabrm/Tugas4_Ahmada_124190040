package com.example.myapplication;

import java.util.ArrayList;

public class TankData {
    private static  String[] nama = new String[]{"Panzer IV Ausf S", "Tiger I", "M4 Sherman", "Churchill Mk VII", "IS-2", "Pershing", "KV-2"};

    private static int[] gambar = new int[]{R.drawable.ausfd, R.drawable.tiger, R.drawable.m4sherman, R.drawable.churchillmkvii, R.drawable.is2, R.drawable.pershing, R.drawable.kv2};

    public static ArrayList<com.example.myapplication.TankModel> getListData(){
        com.example.myapplication.TankModel tankModel = null;
        ArrayList<com.example.myapplication.TankModel> list = new ArrayList<com.example.myapplication.TankModel>();
        for ( int i = 0; i < nama.length; i++){
            tankModel = new com.example.myapplication.TankModel();
            tankModel.setGambarTank(gambar[i]);
            tankModel.setNamaTank(nama[i]);
            list.add(tankModel);
        }
        return list;
    }
}
