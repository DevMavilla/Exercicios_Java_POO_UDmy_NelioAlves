package POO.Memory.EX12;
import POO.Memory.EX12.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program12 {
    public static void main ( String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos alunos serão digitados: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < students.length; i++) {
            System.out.printf("Dados do %do Aluno:\n", i + 1);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("First Note: ");
            double firstNote = sc.nextDouble();
            System.out.print("Second Note: ");
            double secondNote = sc.nextDouble();
            students[i] = new Student(name, firstNote, secondNote );
        }

        System.out.println(Student.averageClass(students));

        System.out.println("Approved students:");

        for (Student student : students) {
            if (student.average() >= 6.0) {
                System.out.println(student.getName());
            }
        }

        sc.close();
    }
}