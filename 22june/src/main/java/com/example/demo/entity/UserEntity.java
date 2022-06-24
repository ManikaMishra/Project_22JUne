package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "usernames")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "getcount")
    Integer getcount;

    public UserEntity() {
        this.id = id;
        this.name = name;
        this.getcount = getcount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGetcount() {
        return getcount;
    }

    public void setGetcount(Integer getcount) {
        this.getcount = getcount;
    }
}
