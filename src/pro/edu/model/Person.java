package pro.edu.model;
/*
  @author   george
  @project   vsem2
  @class  Person
  @version  1.0.0 
  @since 26.03.2021 - 19.03
*/

public class Person {
    private String idCard;

    public Person() {
    }

    public Person(String idCard) {
        this.idCard = idCard;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idCard='" + idCard + '\'' +
                '}';
    }
}
