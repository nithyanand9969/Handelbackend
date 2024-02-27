package com.Handel.co.Entity;

import jakarta.persistence.*;

@Entity
@Table
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="user_id")
    private Long id;

    @Column(name="user_name")
    private String name;
    @Column(name="user_number")
    private String number;


    public UserEntity() {
    }

    public UserEntity(Long id, String name, String number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
