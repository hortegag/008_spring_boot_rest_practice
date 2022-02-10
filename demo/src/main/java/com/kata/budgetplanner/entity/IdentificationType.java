package com.kata.budgetplanner.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity()
@Data()
@Table(name = "identification_type")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"people"})
//@ToString(excludes={"people"})
@ToString(exclude = {"people"})
public class IdentificationType implements Serializable {

    @Id
    @GeneratedValue
    @Setter(AccessLevel.NONE)
    @Column(name = "id_identification_type")
    private Long id;

    private String name;
    private String mnemonic;
    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "identificationType", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    private List<People> people;

}
