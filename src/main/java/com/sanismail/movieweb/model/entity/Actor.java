package com.sanismail.movieweb.model.entity;


import java.time.LocalDate;
import java.util.Objects;
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
@Table(schema = "main", name = "actor")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Actor {
    @Id
    @Column(name = "id", nullable = false)
    @SequenceGenerator(name = "idSeqActor", sequenceName = "main.actor_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idSeqActor")
    private Integer id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "date_birth")
    private LocalDate dateBirth;
    @Column(name = "sex", nullable = false)
    private String sex;

    @ManyToMany
    @JoinTable(
            schema = "main",
            name = "movie_actor",
            joinColumns = @JoinColumn(name = "actor_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id"))
    Set<Movie> movies;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Actor actor = (Actor) o;

        return Objects.equals(id, actor.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
