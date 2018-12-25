package ru.exchange.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ROLE")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_seq")
    @SequenceGenerator(name = "role_seq", sequenceName = "role_seq", allocationSize = 1)
    @Column(name = "ID")
    private long id;

    @Column(name = "CODE")
    @Size(max = 64)
    @NotNull
    private String code;

    @Column(name = "NAME")
    @Size(max = 255)
    @NotNull
    private String name;
}
