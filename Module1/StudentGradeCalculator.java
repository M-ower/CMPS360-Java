
public class StudentGradeCalculator {

    public static void main(String[] args) {

        // Store the student's information.
        String studentName = "Ghaith Al-Darwash";
        String major = "Software Engineering";
        String course = "CMPS 360";

        // Store three assignment grades.
        double grade1 = 94;
        double grade2 = 88;
        double grade3 = 96;

        // Calculate the average of the three grades.
        double average = (grade1 + grade2 + grade3) / 3;

        // Display the student's information and average.
        System.out.println("Student: " + studentName);
        System.out.println("Major: " + major);
        System.out.println("Course: " + course);
        System.out.printf("Average: %.2f%n", average);

        // Check whether the student passed the course.
        if (average >= 70) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
    }
}
