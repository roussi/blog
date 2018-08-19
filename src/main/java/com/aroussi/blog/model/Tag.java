package com.aroussi.blog.model;

import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Tag extends AbstractModel {
    @NotNull
    @UniqueElements
    private String name;
}
