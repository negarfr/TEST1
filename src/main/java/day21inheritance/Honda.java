package day21inheritance;

public class Honda extends Car {

    public void hondaMake() {

        System.out.println("this car was made in Honda factory");
    }
    public Honda() {

        System.out.println("Honda class constructor 1");
    }

    public Honda(boolean isNew){
        super("Hybrid");
        if (isNew) {
            System.out.println("new");
        } else {
            System.out.println("used");
        }
    }
}

