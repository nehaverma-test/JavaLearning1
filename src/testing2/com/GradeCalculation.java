package testing2.com;

public class GradeCalculation {

    public static void main(String[] args) {

        int num = 84;
        char grade;

        if(num>=90 && num<=100)
        grade = 'A';

        else if(num>=80 && num<=89)
            grade = 'B';
        else if(num>=70 && num<=79)
            grade = 'C';
        else if (num>=60 && num<=69)
            grade = 'D';
        else
            grade = 'E';

        System.out.println(grade);
    }
}
