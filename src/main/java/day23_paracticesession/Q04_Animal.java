package day23_paracticesession;

public class Q04_Animal extends Q04_Creatures {

    public void eat(){
        System.out.println("Animals eat..");}

    public void drink(){
        System.out.println("Animals drink..");}
    public void move(){System.out.println("Animals can move...");}

    @Override
    public void weight() {
        System.out.println("All animals have weight");
    }

    @Override
    public void consume() {
        System.out.println("All creatures consume food");
    }


}
