package com.kata.budgetplanner.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Data()
@Table(name = "groups")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Groups {
    @Id
    @GeneratedValue
    // @Setter(AccessLevel.NONE)
    @Column(name = "id_group")
    private Long id;
    private String name;

    @EqualsAndHashCode.Exclude
    private String description;

}
