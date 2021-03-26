package pro.edu.model;
/*
  @author   george
  @project   vsem2
  @class  Student
  @version  1.0.0 
  @since 26.03.2021 - 18.21
*/

import java.time.LocalDate;

public class Student  extends Person{
    private String firstName;
    private String lastName;
    private String patronymic;
    private LocalDate birth;
    private boolean gender;
    private String phone;

    public Student() {
    }

    public Student(String firstName, String lastName, String patronymic, LocalDate birth, boolean gender, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birth = birth;
        this.gender = gender;
        this.phone = phone;
    }

    public Student(String idCard, String firstName, String lastName, String patronymic, LocalDate birth, boolean gender, String phone) {
        super(idCard);
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birth = birth;
        this.gender = gender;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birth=" + birth +
                ", gender=" + gender +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class Builder{
        private Student studentToBuild;

        public Builder() {
            this.studentToBuild = new Student();
        }

        public Builder setSimilarTo(Student student){
            this.studentToBuild.firstName = student.firstName;
            this.studentToBuild.lastName = student.lastName;
            this.studentToBuild.patronymic = student.patronymic;
            this.studentToBuild.birth = student.birth;
            this.studentToBuild.gender = student.gender;
            this.studentToBuild.phone = student.phone;
            return this;
        }


        public Builder setFirstName(String firstName){
            studentToBuild.setFirstName(firstName);
            return this;
        }

        public Builder setIdCard(String str){
            studentToBuild.setIdCard(str);
            return this;
        }

        public Builder setLastName(String name){
            studentToBuild.setLastName(name);
            return this;
        }

        public Builder setPatronymic(String name){
            studentToBuild.setPatronymic(name);
            return this;
        }

        public Builder setBirth(LocalDate date){
            studentToBuild.setBirth(date);
            return this;
        }

        public Builder setGender(boolean gender){
            studentToBuild.setGender(gender);
            return this;
        }

        public Builder setPhone(String ph){
            studentToBuild.setPhone(ph);
            return this;
        }

        public Student build(){
            return studentToBuild;
        }
    }


}
