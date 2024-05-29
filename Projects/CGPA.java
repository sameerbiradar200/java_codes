package Projects;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject 1 out off 100 ");
        int marks1 = sc.nextInt();
        System.out.println("Enter marks of subject 2 out off 100 ");
        int marks2 = sc.nextInt();
        System.out.println("Enter marks of subject 3 out off 100 ");
        int marks3 = sc.nextInt();
        System.out.println("subject 1 : "+marks1);
        System.out.println("subject 1 : "+marks2);
        System.out.println("subject 1 : "+marks3);

        int MaxMarks =100;
        int MaxGrade = 10;

        double GradePoint1= (double) (marks1 * MaxGrade) /MaxMarks;
        //System.out.println(grade point1);
        double GradePoint2= (double) (marks2 * MaxGrade) /MaxMarks;
        //System.out.println(grade point2);
        double GradePoint3= (double) (marks3 * MaxGrade) /MaxMarks;
        //System.out.println(grade point3);

        double AvgGrade = (GradePoint1 + GradePoint2 + GradePoint3) / 3;
        double CGPA = AvgGrade/MaxGrade;
        System.out.println("CGPA: " + CGPA);




    }
}
