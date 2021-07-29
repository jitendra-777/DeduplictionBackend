package com.jocota.DeDuplication.Dedupliction.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "customer")
public class CustomerDetails {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String panNumber;
    private String aadharNumber;
    private String DOB;

}
