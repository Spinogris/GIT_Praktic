package com.lab.rmtbanking.creditservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

import static javax.persistence.CascadeType.*;

@Entity
@Table(name = "agreements")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Agreement {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "com.andersenlab.rmtbanking.creditservice.generator.UuidTimeSequenceGenerator")
    @Column(name = "id")
    private UUID id;
     
    @Column(name = "number")
    private String number;

    @Column(name = "agreement_date")
    private LocalDate agreementDate;

    @Column(name = "termination_date")
    private LocalDate terminationDate;

    @Column(name = "responsible_specialist_id")
    private String responsibleSpecialistId;

    @Column(name = "is_active")
    private boolean active;

    @OneToOne(cascade = {MERGE, PERSIST, REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "credit_id", referencedColumnName = "id")
    private Credit credit;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Agreement that = (Agreement) o;
        return Objects.equals(this.number, that.number)
                && Objects.equals(this.credit, that.credit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, credit);
    }

    @Override
    public String toString() {
        return "Agreement{" +
                "  id=" + id +
                ", number='" + number + '\'' +
                ", agreementDate=" + agreementDate +
                ", terminationDate=" + terminationDate +
                ", responsibleSpecialistId='" + responsibleSpecialistId + '\'' +
                ", active=" + active +
                ", credit=" + credit +
                '}';
    }
}