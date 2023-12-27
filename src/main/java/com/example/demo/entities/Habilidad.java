package main.java.com.example.demo.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Habilidad implements Serializable {
    @Id
    @SequenceGenerator(name = "habilidad_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "habilidad_id_seq")
    private Integer id;
    private String nombre;
    private String descripcion;
    private String nuuid;
    private Date fechaUltimaModificacion; // Agregada la fecha de última modificación

    @ManyToOne
    @JoinColumn(name = "rando_id")
    private Rango rango;

    // Relación bidireccional: si es necesario, agrega la relación inversa en la clase Rango
    // @OneToMany(mappedBy = "habilidad")
    // private List<Rango> rangos;

    // Otros mapeos y propiedades según tus necesidades

}