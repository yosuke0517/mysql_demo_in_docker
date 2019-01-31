package com.example.demo;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Account")
@Data
public class AccountEntity {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String password;


}
