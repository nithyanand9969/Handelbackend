package com.Handel.co.Entity;

import jakarta.persistence.*;

@Entity
@Table
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name="user_id")
    private Long id;




}
