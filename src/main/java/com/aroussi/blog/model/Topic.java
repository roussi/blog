package com.aroussi.blog.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Builder
@Entity
@Table(name = "AR_TOPIC")
public class Topic extends AbstractModel {

    private String name;
}
