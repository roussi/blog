package com.aroussi.blog.model;

import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Builder
@Entity
@Table(name = "AR_TAG")
public class Tag extends AbstractModel {
    @NotNull
    @UniqueElements
    private String name;
}
