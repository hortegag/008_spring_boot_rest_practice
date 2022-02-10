package com.kata.budgetplanner.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Collection;

@Entity()
@Data()
@Table(name = "roles")
@NoArgsConstructor
@AllArgsConstructor
public class Roles implements Serializable {

    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    @Column(name = "id_rol")
    private Long id;
    private String name;
    private String description;

    @ToString.Exclude
    @ManyToMany
    @JoinTable(
            name = "groups_roles",
            joinColumns = @JoinColumn(
                    name = "id_rol"),
            inverseJoinColumns = @JoinColumn(
                    name = "id_group"))
    private Collection<Groups> groups;


}
