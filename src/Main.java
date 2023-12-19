import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        Student student1 = new Student("Maria Salvi", 29);
        Student student2 = new Student("Max Smith", 31);
        Student student3 = new Student("Sara Rossi", 26);
        Student student4 = new Student("Giulia Lalli", 24);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        students.set(1, student4);

        System.out.println("Students in class: " + students);
        System.out.println("Students' names: " + student1.getName() + ", " + student2.getName() + ", " + student4.getName());

        Student student5 = new Student("Alex Verdi", 29);
        Student student6 = new Student("Anna Bianchi", 30);
        Student student7 = new Student("Gianni Zilli", 22);
        Student student8 = new Student("Sam Fahd", 24);

        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);

        System.out.println("Students in class: " + students);
        System.out.println("Students' names: " + student1.getName() + ", " + student2.getName() + ", " + student4.getName() + ", " + student5.getName() + ", " + student6.getName() + ", " + student7.getName() + ", " + student8.getName());
    }
}