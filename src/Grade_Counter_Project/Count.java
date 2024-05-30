package Grade_Counter_Project;


import java.util.Scanner;

public  class Count {

    double Total;
    double totalMaximumMarks = 600;
    double Percentage;
    char grade;
    String Remark;

    Scanner input = new Scanner(System.in);

    void totalMarks(){
        System.out.println("Enter marks of subject 1");
        int marks1 = input.nextInt();

        System.out.println("Enter marks of subject 2");
        int marks2 = input.nextInt();

        System.out.println("Enter marks of subject 3");
        int marks3 = input.nextInt();

        System.out.println("Enter marks of subject 4");
        int marks4 = input.nextInt();

        System.out.println("Enter marks of subject 5");
        int marks5 = input.nextInt();

        System.out.println("Enter marks of subject 6");
        int marks6 = input.nextInt();

        System.out.println("Total marks:" + Math.round(totalMaximumMarks));

        Total = marks1 + marks2 + marks3 + marks4 + marks5 + marks6;
        System.out.println("Marks Obtained: " + Total);


    }

    void percentage(){
        // formula to calculate percentage.
        // percentage= (total marks obtained / total maximum marks) * 100
        Percentage = (Total / totalMaximumMarks) * 100;

        // method to round of the float points
//        double roundOff =  Math.round(Percentage * 100.0) / 100.0;

        System.out.println("Percentage:" + Percentage);
    }

    void grade(){
        if(Percentage >= 85) {
            grade = 'A';

        }
        else if(Percentage < 85 && grade >= 70){
            grade = 'B';
        }
        else if(Percentage < 70 && grade >= 55){
            grade = 'C';
        }
        else if(Percentage < 55 && grade >= 40){
            grade = 'D';
        }
        else if(Percentage < 40){
            grade = 'E';
        }
        System.out.println("Grade: " + grade);
    }

    void remark(){
        if(Percentage >= 35){
            Remark = "Pass";
            System.out.println("Remark:" + Remark);
        }
        else{
            Remark = "Fail";
            System.out.println("Remark: " + Remark);
        }
    }
}
