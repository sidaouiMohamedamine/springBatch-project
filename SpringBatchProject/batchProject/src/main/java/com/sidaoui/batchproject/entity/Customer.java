package com.sidaoui.batchproject.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="CUSTOMER_INFO")
public class Customer {
    @Id
    @Column(name="CUSTOMER_ID")
    private int id;
    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="EMAIL")
    private String email;
    @Column(name="GENDER")
    private String gender;
    @Column(name="CONTACT")
    private String contactNo;
    @Column(name="COUNTRY")
    private String country;
    @Column(name="DOB")
    private String dob;
}
