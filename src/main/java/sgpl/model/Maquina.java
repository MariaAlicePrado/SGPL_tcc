package sgpl.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Maquina")
public class Maquina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    // FALTA UMA CHAVE ESTRANGEIRA
    @Column(nullable = true, length = 50)
    public String patrimonio;
    @Column(nullable = false, length = 50)
    public String nome;

    @ManyToOne
    @JoinColumn(name = "ocorrencia_id")
    private Ocorrencia ocorrencia;

    @Column(nullable = false, length = 20)
    public String statusMaquina;

    public Ocorrencia getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(Ocorrencia ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatusMaquina() {
        return statusMaquina;
    }

    public void setStatusMaquina(String statusMaquina) {
        this.statusMaquina = statusMaquina;
    }
}