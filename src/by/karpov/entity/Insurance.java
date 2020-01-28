package by.karpov.entity;

import java.util.Date;

public class Insurance {

    private String id;
    private Person person;
    private Date date;

    public Insurance(String id, Person person, Date date) {
        this.id = id;
        this.person = person;
        this.date = date; //добавить вторую дату
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
