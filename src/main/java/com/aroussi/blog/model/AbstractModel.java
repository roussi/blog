package com.aroussi.blog.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@MappedSuperclass
@EntityListeners(value = AuditingEntityListener.class)
public abstract class AbstractModel implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @CreatedBy
    private String createBy;

    @CreatedDate
    private LocalDate createdDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @LastModifiedDate
    private String lastModifiedDate;
}
