package week_9homework;

import java.util.Scanner;

public class Programme_2_MarkSheet {
    int id, maths, science, english, total;
    float percentage;
    String name, result, grade;

    public static void main(String[] args) {
        Programme_2_MarkSheet obj = new Programme_2_MarkSheet();
        obj.markSheet();
    }

    public void studentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.next();
        System.out.print("Enter rollNo: ");
        id = sc.nextInt();
        System.out.print("Enter Maths Marks: ");
        maths = sc.nextInt();
        System.out.print("Enter Science Marks: ");
        science = sc.nextInt();
        System.out.print("Enter English Marks: ");
        english = sc.nextInt();
        if (maths < 0 || maths > 100 || science < 0 || science > 100 || english < 0 || english > 100) {
            System.out.println("Invalid marks, Enter marks between 0 and 100");
            System.out.print("Enter Maths Marks: ");
            maths = sc.nextInt();
            System.out.print("Enter Science Marks: ");
            science = sc.nextInt();
            System.out.print("Enter English Marks: ");
            english = sc.nextInt();
        }
        sc.close();
    }

    public void marksCalculation() {
        studentDetails();
        total = maths + science + english;
        percentage = total / 3f;

        if (percentage >= 35) {
            result = "PASS";
        } else {
            result = "FAIL";
        }

        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "-";
        }

        while (percentage >= 35) {
            if (maths < 35) {
                result = "FAIL";
                grade = "-";
                break;
            } else if (science < 35) {
                result = "FAIL";
                grade = "-";
                break;
            } else if (english < 35) {
                result = "FAIL";
                grade = "-";
                break;
            }
        }
    }

    public void markSheet() {
        marksCalculation();
        System.out.println("|-------------------------------------|");
        System.out.println("|              MarkSheet              |");
        System.out.println("|-------------------------------------|");
        System.out.println("| Name:    " + name + "                |");
        System.out.println("| Roll No: " + id + "                  |");
        System.out.println("|_____________________________________|");
        System.out.println("| Subjects: Marks                     |");
        System.out.println("|_____________________________________|");
        System.out.println("| Maths:   " + maths + "               |");
        System.out.println("| Science: " + science + "             |");
        System.out.println("| English: " + english + "             |");
        System.out.println("|_____________________________________|");
        System.out.println("| Total:   " + total + "               |");
        System.out.println("|_____________________________________|");
        System.out.println("| Percentage:" + percentage + "       |");
        System.out.println("| Result:    " + result + "           |");
        System.out.println("| Grade:     " + grade + "            |");
        System.out.println("|_____________________________________|");
}
}