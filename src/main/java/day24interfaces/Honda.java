package day24interfaces;

public class Honda implements Ac,Brake,Engine{


    @Override
    public void digital() {
        System.out.println("This is digital Ac");
    }

    @Override
    public void secureBrake() {
        System.out.println("stops securley");

    }

    @Override
    public void ecoEngine() {
        System.out.println("This is eco engine");

    }

    @Override
    public void price() {
        System.out.println("brake price");
    }


}
