package day17_ArraysCont;

public class Topic2_ArraySwap {

    public static void main(String[] args) {

        String [] names ={"ziya","Hrakar","Fruze"};

        // swap the "fruze with "hraklar" and later swap "ziya with "Hrakar"

        // names[2]=names[1]; //{"Ziya","Hrakar","Hrakar"}

        String dummy=names[2];
        names[2]=names[1];//{"Ziya","Hrakar","Hrakar"}
        names[1]=dummy;//{"ziya","Fruze","Hrakar"}

        dummy=names[0];
        names[0]=names[2];//{"Hrakar","Fruze","Hrakar"}
        names[2]=dummy;//{"Hrakar","Fruze","Ziya"}

        System.out.print("{ "+names[0]+" , "+names[1]+" , "+names[2]+" }");







    }
}
