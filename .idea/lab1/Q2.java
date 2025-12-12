class Q2{
    public static void main(String[] args) {

        int marks = 85;  // Mention the mark here
        char grade;

        if (marks >= 90)
            grade = 'O';
        else if (marks >= 80)
            grade = 'E';
        else if (marks >= 70)
            grade = 'A';
        else if (marks >= 60)
            grade = 'B';
        else if (marks >= 50)
            grade = 'C';
        else
            grade = 'F';

        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}