package br.uff.ihs.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "setor")
public class Setor extends PanacheEntityBase {

    // Mudanca no Enum deve refletir mudanca na coluna Setor.Codigo
    public static enum Codigo {
        INFORMATICA, TRANSPORTE, ALMOXARIFADO, PATRIMONIO
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    private String nome;
    private String email;
    private Boolean ativo;
    private String lotacao;

    @Enumerated(EnumType.STRING)
    private Codigo codigo;

    // @ManyToMany
    // @JoinTable(
    // name = "setor_status",
    // joinColumns = @JoinColumn(name = "setor_id"),
    // inverseJoinColumns = @JoinColumn(name = "status_id")
    // )
    // @JsonIgnore
    // @JsonManagedReference
    // List<Status> status;

    // @ManyToMany(mappedBy = "setores")
    // List<Usuario> usuarios;
}