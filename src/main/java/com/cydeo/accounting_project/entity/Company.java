package com.cydeo.accounting_project.entity;

import com.cydeo.accounting_project.enums.CompanyStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "companies")
public class Company extends BaseEntity{
    @Column(unique = true)
    private String title;
    private String phone;
    private String website;
    @Enumerated(EnumType.STRING)
    private CompanyStatus companyStatus;
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private Address address;
}
