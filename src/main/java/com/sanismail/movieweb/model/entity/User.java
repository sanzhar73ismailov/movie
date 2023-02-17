package com.sanismail.movieweb.model.entity;


import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(schema = "main", name = "muser")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(name = "idSeqMuser", sequenceName = "main.muser_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idSeqMuser")
    private Integer id;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "name", nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(
            schema = "main",
            name = "muser_mrole",
            joinColumns = @JoinColumn(
                    name = "muser_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "mrole_id", referencedColumnName = "id"))
    private Set<Role> roles;
}
