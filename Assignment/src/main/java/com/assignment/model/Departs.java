package com.assignment.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name ="departs")
public class Departs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Id;
    private String Ten;

    @OneToMany(mappedBy = "staffs")
    private Set<Assignment.model.Staffs> staffs;
    public Departs() {
    }

    public Departs( String Ten) {

        this.Ten = Ten;
    }

    public String getId() {
        return Id;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }
    public Set<Assignment.model.Staffs> getStaffs() {
        return staffs;
    }

    public void setCustomers(Set<Assignment.model.Staffs> staffs) {
        this.staffs = staffs;
    }
}
