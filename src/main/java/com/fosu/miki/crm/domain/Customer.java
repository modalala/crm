package com.fosu.miki.crm.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "customer")
@Data
public class Customer {
    @Id
    @Column(name = "cus_id")
    private Integer cusId;
    @Column(name = "username")
    private String username;
    @Column(name ="telphone")
    private String telphone;
}
