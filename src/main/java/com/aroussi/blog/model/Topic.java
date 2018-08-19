package com.aroussi.blog.model;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Topic extends AbstractModel {

    private String name;
}
