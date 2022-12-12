public class Q03_CalculatingAverage {

    // create a method that calculate 4 students' 6,4,3 and 5 exams Average respectively

    public static void main(String[] args) {
        calculateAverage("Tom Hanks", 55,69,45,90,100);
        calculateAverage("John Travolta",45,56,78,66);
        calculateAverage("Brad Pit", 100,90,80,78);

    }
    public static void calculateAverage(String stdName, double... mark) { // put ... to receive limitless

        double sum = 0;
        // coz i want to receive marks of students and devide them
        for (double w : mark) {

            sum += w; // this will increase the value of the sum with "w"
        }
        System.out.println(stdName + " 's Average of Exams:" +String.format("%.2f",sum/mark.length ));
        //"%.2f" telling java just give us 2 decimal after dividing and we have to use String.format so Java can handle this

    }

}
