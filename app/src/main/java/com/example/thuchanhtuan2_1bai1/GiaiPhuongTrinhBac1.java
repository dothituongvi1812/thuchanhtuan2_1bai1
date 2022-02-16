package com.example.thuchanhtuan2_1bai1;

public class GiaiPhuongTrinhBac1 {
   private float a;
    private float b;
    public GiaiPhuongTrinhBac1(){

    }
    public static String giaiPhuongTrinhBac1(float a, float b){
        String kq="";
        if(a==0){
            if(b==0){
                kq+="Phương trình vô số nghiệm";
            }
            else{
                kq+="Phương trình vô nghiệm";
            }
        }
        else{
            kq+=-b/a;
        }

        return kq;
    }
}
