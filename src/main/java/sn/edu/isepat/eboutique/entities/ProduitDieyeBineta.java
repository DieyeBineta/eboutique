package sn.edu.isepat.eboutique.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "produit_dieye_bineta")
public class ProduitDieyeBineta {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;

    @Column(length = 100, nullable = false)
    private String nom;

    @Column(nullable = false)
    private Double prix;

    private String description;
}