package com.cakmak.fizikmatematikproblem;

public class Problem {

    public static class Matematik{
        public static void daireAlan(int yaricap){
            System.out.println("Dairenin Alanı:"+(yaricap*yaricap*Math.PI));

        }
        public static void ucgenAlan(int kenarA,int kenarB,int kenarC){

            double u=((kenarA+kenarB+kenarC)/2);
            double Alan=Math.sqrt(u*((u-kenarA)*(u-kenarB)*(u-kenarC)));

            System.out.println("Üçgenin Alanı= "+Alan);

        }

    }

    public static class Fizik{

        public static void icCarpim(Vectorel vec1,Vectorel vec2){
            int iccarpim=vec1.getI()*vec2.getI()+vec1.getJ()*vec2.getJ()+vec1.getK()*vec2.getK();
            System.out.println(vec1.getIsim()+" ile "+vec2.getIsim()+" in ic carpımı="+iccarpim);
        }

    }
}
