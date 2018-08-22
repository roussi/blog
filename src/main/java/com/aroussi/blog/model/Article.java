package com.aroussi.blog.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;

@Data
@Entity
@Table(name = "AR_ARTICLE")
public class Article extends AbstractModel{

    private String title;
    private String content;
    private String version;
    private LocalDate approvedDate;
    private boolean reviewed=false;
    private boolean validated=false;

    @ManyToOne
    @JoinColumn(name = "writer_id")
    private Uzer writer;

    @ManyToOne
    @JoinColumn(name = "reviewer_id")
    private Uzer reviewer;

    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;

    /*
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "article_tag",
            joinColumns = {
                @JoinColumn(name = "article_id",referencedColumnName = "id")
            },
            inverseJoinColumns = {
                @JoinColumn(name = "tag_id", referencedColumnName = "id")
            })
    private Collection<Tag> tags; */



}
