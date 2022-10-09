package com.usa.misiontic.masterclass3.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "category")
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer name;
    private Integer description;
    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "category")
    @JsonIgnoreProperties("category")
    private List<Library> libs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public Integer getDescription() {
        return description;
    }

    public void setDescription(Integer description) {
        this.description = description;
    }

    public List<Library> getLibs() {
        return libs;
    }

    public void setLibs(List<Library> libs) {
        this.libs = libs;
    }
}
