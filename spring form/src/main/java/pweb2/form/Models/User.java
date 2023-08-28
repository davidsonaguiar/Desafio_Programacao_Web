package pweb2.form.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "TBL_USERS")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  public Long getId() {
    return id;
  }

  @NotNull
  @Size(min = 2, max = 255)
  private String nome;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @NotNull
  @Past
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  public LocalDate data_nascimento;

  public LocalDate getData_nascimento() {
    return this.data_nascimento;
  }

  public void setData_nascimento(LocalDate data) {
    this.data_nascimento = data;
  }

  @NotNull
  @Size(min = 2, max = 255)
  private String nome_mae;

  public String getNome_mae() {
    return nome_mae;
  }

  public void setNome_mae(String nome_mae) {
    this.nome_mae = nome_mae;
  }

  @NotNull
  @Size(min = 2, max = 255)
  private String nome_pai;

  public String getNome_pai() {
    return nome_pai;
  }

  public void setNome_pai(String nome_pai) {
    this.nome_pai = nome_pai;
  }

  @NotNull
  @Pattern(regexp = "^(1[1-9]|2[1-9]|3[0-9]|4[1-9]|5[1-5]|6[1-9]|7[1-9]|8[1-9]|9[1-9])$", message = "DDD Inválido")
  @Size(max = 2, min = 2)
  private String ddd;

  public String getDdd() {
    return ddd;
  }

  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  @NotNull
  private Integer numero;

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  @NotNull
  private Integer ramal;

  public Integer getRamal() {
    return ramal;
  }

  public void setRamal(Integer ramal) {
    this.ramal = ramal;
  }

  @NotEmpty
  @Email
  private String email;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @NotBlank
  private String serie;

  public String getSerie() {
    return serie;
  }

  public void setSerie(String serie) {
    this.serie = serie;
  }

  @NotNull
  private String turno;

  public String getTurno() {
    return turno;
  }

  public void setTurno(String turno) {
    this.turno = turno;
  }

  @Size(max = 3)
  public String[] atividades;

  public String[] getAtividades() {
    return atividades;
  }

  public void setAtividades(String[] atividades) {
    this.atividades = atividades;
  }
}
