package day23_paracticesession;

public class Q04_Bird extends Q04_Animal{

    public void tweet (){
        System.out.println("Bird tweet");
    }

    @Override
    public void weight() {
        System.out.println("Birds are very light animals");
    }
}
