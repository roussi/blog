package com.aroussi.blog.model;

import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@MappedSuperclass
public abstract class AbstractModel implements Serializable {

    @Id
    @GeneratedValue
    @NotNull
    private Long id;
}
