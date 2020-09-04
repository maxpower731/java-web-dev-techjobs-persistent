package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull
    private String location;

    public Employer(@NotNull String location) {
        this.location = location;
    }

    @OneToMany
    @JoinColumn //Add jobs in arraylist<> if errors
    private List<Job> jobs = new ArrayList<>();

    //Empty constructor for hibernate to do its magic
    public Employer () {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
