package com.example.customerbirthday.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class CustomerEntity {
    private Long customerId;
    private String firstName;
    private String lastName;

}
