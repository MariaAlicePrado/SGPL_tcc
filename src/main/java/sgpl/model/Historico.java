package sgpl.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Historico")
public class Historico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;


    @Column(nullable = false)
    public Date dataHistorico;
    @Column(nullable = false, length = 500)
    public String descricao;

    @ManyToOne
    @JoinColumn(name = "tecnico_id")
    private Usuario tecnico;

    @ManyToOne
    @JoinColumn(name = "ocorrencia_id")
    private Ocorrencia ocorrencia;

    @Column(nullable = false)
    public String statusHistorico;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public Date getDataHistorico() {
        return dataHistorico;
    }

    public void setDataHistorico(Date dataHistorico) {
        this.dataHistorico = dataHistorico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatusHistorico() {
        return statusHistorico;
    }

    public Usuario getTecnico() {
        return tecnico;
    }

    public void setTecnico(Usuario tecnico) {
        this.tecnico = tecnico;
    }

    public void setStatusHistorico(String statusHistorico) {
        this.statusHistorico = statusHistorico;
    }
}
