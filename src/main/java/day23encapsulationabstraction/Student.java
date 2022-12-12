package day23encapsulationabstraction;

public class Student {

    public String name = "Tom Hanks";
    private double stdGpa = 3.8;

    private String stdId= "TH123";
    private String disease = "heart Disease";
    private boolean successful = false;


    public String getStdId() {
        return stdId;
    }

    public double getStdGpa() {
        return stdGpa;
    }
    public String getDisease(){
       return disease;
    }
// If the data type is "boolean" get method name starts with "is"
    public boolean isSuccessful() {
        return successful;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public void setStdGpa(double stdGpa) {
        this.stdGpa = stdGpa;
    }

    public static void main(String[] args) {




        /*
        Encapsulation is "Data hiding"
        to hide a data we make the access modifier "private"

        After encapsulation (hiding data) you may need to "read" or update the data.

        to read or update the data we will create some methods.

         to read  encapsulated data YOU SHOULD GREAT " GET()" METHOD.
         we name is "GETTERS"
          to UPDATE encapsulated data YOU SHOULD GREAT " SET()" METHOD.
         we name is "SETTERS"

         */
        // // Note: By using set() method we prevent confusion and save memory by creating just 1 object.

        // GET and SET methods are call " Java Beans"

        // if a class is

    }
}
