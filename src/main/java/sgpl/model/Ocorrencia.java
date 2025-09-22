package sgpl.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "Ocorrencia")
public class Ocorrencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    @Column(nullable = false, length = 50)
    private String titulo;

    // FALTAM TRÊS CHAVES ESTRANGEIRAS
    @Column(nullable = false)
    public LocalDateTime dataOcorrencia;

    @Column(nullable = false, length = 500)
    public String descricao;

    @Column(nullable = false, length = 10)
    public String periodo;

    @Column(nullable = false, length = 20)
    public String classificacao;
    
    @Column(nullable = true, length = 500)
    public String resolucao;
    
    @ManyToOne
    @JoinColumn(name = "ambiente_id")
    private Ambiente ambiente;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private Usuario professor;

    @Column(nullable = false)
    public String  statusOcorrencia;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(LocalDateTime dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    
    public String getResolucao() {
		return resolucao;
	}

	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}

	public String getStatusOcorrencia() {
		return statusOcorrencia;
	}

	public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(Ambiente ambiente) { this.ambiente = ambiente;}

    public Usuario getProfessor() {
        return professor;
    }

    public void setProfessor(Usuario professor) {
        this.professor = professor;
    }

    public String isStatusOcorrencia() {
        return statusOcorrencia;
    }

    public void setStatusOcorrencia(String statusOcorrencia) {
        this.statusOcorrencia = statusOcorrencia;
    }
}
