package ru.exchange.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "USERS")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq")
    @SequenceGenerator(name = "users_seq", sequenceName = "users_seq", allocationSize = 1)
    @Column(name = "ID")
    private long id;

    @Column(name = "LOGIN")
    @Size(max = 64)
    @NotNull
    private String username;

    @Column(name = "PASSWORD")
    @Size(max = 255)
    @NotNull
    @JsonIgnore
    private String password;

    @Column(name = "FIO")
    @Size(max = 255)
    private String fio;

    @Column(name = "ORGANIZATION")
    @Size(max = 255)
    private String organization;

    @ManyToOne(targetEntity = Role.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "ROLE", referencedColumnName = "ID")
    @NotNull
    private Role role;
}
