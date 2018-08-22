package com.aroussi.blog.model;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "AR_ROLE")
public class Role {

    @Id
    private String name;
    private String description;
}
