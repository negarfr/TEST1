package day23_paracticesession;

public class Q03_CalculateVolumeOgCube {

    // Create a method to calculate volume of cube, square prism and rectangular prism

    public double volumeOfCube (double a){ //a*a=a ==> gives you the requier outcome. only one edge is enough to calculate
        return a*a*a;
    }
    public double volumeOfSquarePrism(double a, double b){ //a*a*b

        return a*a*b;
    }

    public static double volumeOfRectangularPrism(double a, double b, double c){

        return a*b*c;
    }
    public static double totalPrices(double a, double...prices){
        return a;
    }
}
