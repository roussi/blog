package com.aroussi.blog.model;

import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;

@Data
@Entity
@Table(name = "AR_USER")
public class Uzer extends AbstractModel{

    @NotNull
    @Size(min = 4, max = 10)
    private String login;
    @NotNull
    @Size(min = 8)
    private String password;
    @Email
    @NotNull
    @UniqueElements
    private String email;

    private String firstname;

    private String lastname;

    /*
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_role",
            joinColumns = {
                    @JoinColumn(name = "user_id",referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "role_name", referencedColumnName = "name")
            })
    private Collection<Role> roles; */
}
