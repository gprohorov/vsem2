package pro.edu;

import pro.edu.model.Student;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Ivan", "Ivanov", "Ivanich",
                LocalDate.of(2000,1,1), true, "050123456654");

         Student petro = new Student.Builder()
                 .setFirstName("Petro")
                 .setLastName("Petrov")
                 .setPatronymic("Petrovich")
                 .setBirth(LocalDate.of(2000,1,1))
                 .setGender(true)
                 .setPhone("76868686868686")
                 .build();

         Student  stepan = new Student.Builder()
                 .setSimilarTo(petro)
                 .setFirstName("Stepan")
                 .setPhone("7654435434")
                 .build();

         Student pavel = petro;
         pavel.setFirstName("Pavel");


        System.out.println(petro);
        System.out.println(stepan);
        System.out.println(pavel);


    }
}
