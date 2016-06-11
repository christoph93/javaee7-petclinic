package org.woehlke.javaee7.petclinic.entities;

import java.util.Date;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: tw
 * Date: 01.01.14
 * Time: 21:12
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "obras")
public class Obra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Column(name = "nome")
    private String nome; 
    
    @Column(name = "responsavelTecnico")
    private String responsavelTecnico;
    
    @Column(name = "responsavel")
    private String responsavel;
    
    @Column(name = "observacao")
    private String observacao;
    
    @Column(name = "diaSemana")
    private String diaSemana;
    
    @Column(name = "prazo")
    private Date prazo;
    
    @Column(name = "inicioObra")
    private Date inicioObra;
    
    @Column(name = "terminoObra")
    private Date terminoObra;
    
    @Column(name = "saldo")
    private double saldo;
    
    @Column(name = "tempoDecorrido")
    private long tempoDecorrido;

    public String getReposnsavelTecnico() {
        return responsavelTecnico;
    }

    public void setResponsavelTecnico(String reposnsavelTecnico) {
        this.responsavelTecnico = reposnsavelTecnico;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public Date getInicioObra() {
        return inicioObra;
    }

    public void setInicioObra(Date inicioObra) {
        this.inicioObra = inicioObra;
    }

    public Date getTerminoObra() {
        return terminoObra;
    }

    public void setTerminoObra(Date terminoObra) {
        this.terminoObra = terminoObra;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getTempoDecorrido() {
        return tempoDecorrido;
    }

    public void setTempoDecorrido(long tempoDecorrido) {
        this.tempoDecorrido = tempoDecorrido;
    }
        
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Obra{" + "id=" + id + ", nome=" + nome + ", responsavelTecnico=" + responsavelTecnico + ", responsavel=" + responsavel + ", observacao=" + observacao + ", diaSemana=" + diaSemana + ", prazo=" + prazo + ", inicioObra=" + inicioObra + ", terminoObra=" + terminoObra + ", saldo=" + saldo + ", tempoDecorrido=" + tempoDecorrido + '}';
    }

    
}
