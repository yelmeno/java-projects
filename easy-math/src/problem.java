public class problem {
    public static class MatematikProblemi {
        public static void DaireAlan(int yaricap){
            System.out.println("Dairenin alanı: " + Math.PI * ( yaricap*yaricap));

        }
        public static void UcgeninCevresi (int kenar1 , int kenar2 , int kenar3){
            System.out.println("Üçgenin çevresi: "+ (kenar1+kenar2+kenar3));
        }
    }
    public static class FizikProblemi {
        public static void icCarpim (vec vec1 , vec vec2){
            int icCarpim = vec1.getI()*vec2.getI()+vec1.getJ()*vec2.getJ()+vec1.getK()*vec2.getK();
            System.out.println("Vektörlerin iç çarpımı: " + icCarpim);

        }



    }
    public static class Vec {

    }


    }

