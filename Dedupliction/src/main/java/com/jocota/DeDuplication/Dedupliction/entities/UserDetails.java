package com.jocota.DeDuplication.Dedupliction.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "userdetail")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column
    private String userName;
    @Column
    private String password;
}
