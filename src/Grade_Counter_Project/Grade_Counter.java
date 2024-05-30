package Grade_Counter_Project;


public class Grade_Counter {
    public static void main(String []args){

        System.out.println("Grade Application");

        // creating object of a class
        Count count = new Count();


        count.totalMarks();

        count.percentage();

        count.grade();

        count.remark();

    }
}
