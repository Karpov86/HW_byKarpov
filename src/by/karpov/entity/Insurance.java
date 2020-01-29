package by.karpov.entity;

import java.util.Date;

public class Insurance {

    private int id;
    private Person person;
    private Date dateOfIssue;
    private Date expirationDate;

    public Insurance(int id, Person person, Date dateOfIssue, Date expirationDate) {
        this.id = id;
        this.person = person;
        this.dateOfIssue = dateOfIssue;
        this.expirationDate = expirationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
