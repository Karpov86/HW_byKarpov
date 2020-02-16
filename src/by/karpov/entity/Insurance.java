package by.karpov.entity;

import java.util.Date;
import java.util.Objects;

public class Insurance {

    private Long id;
    private Person person;
    private Date dateFrom;
    private Date dateTo;

    public Insurance(Long id, Person person, Date dateFrom, Date dateTo) {
        this.id = id;
        this.person = person;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Insurance insurance = (Insurance) o;
        return Objects.equals(id, insurance.id) &&
                Objects.equals(person, insurance.person) &&
                Objects.equals(dateFrom, insurance.dateFrom) &&
                Objects.equals(dateTo, insurance.dateTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, person, dateFrom, dateTo);
    }
}