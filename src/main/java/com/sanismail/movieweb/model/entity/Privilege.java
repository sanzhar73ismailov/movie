package com.sanismail.movieweb.model.entity;


import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

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
import lombok.ToString;

@Entity
@Table(schema = "main", name = "privilege")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Privilege {
    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(name = "idSeqPrivilege", sequenceName = "main.privilege_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idSeqPrivilege")
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;

    @ManyToMany(mappedBy = "privileges")
    private Set<Role> roles;

    public Privilege(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Privilege{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", roles=").append(roles != null ? roles.size() : "null");
        sb.append('}');
        return sb.toString();
    }
}
