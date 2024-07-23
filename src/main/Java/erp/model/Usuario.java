package erp.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "senha", nullable = false)
    private String senha;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_criacao", nullable = false)
    private Date dataCriacao;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_atualizacao")
    private Date dataAtualizacao;

    @Column(name = "imagem_perfil")
    private String imagemPerfil;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "endereco_rua")
    private String enderecoRua;

    @Column(name = "endereco_numero")
    private String enderecoNumero;

    @Column(name = "endereco_bairro")
    private String enderecoBairro;

    @Column(name = "endereco_cidade")
    private String enderecoCidade;

    @Column(name = "endereco_estado")
    private String enderecoEstado;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_nascimento")
    private Date dataNascimento;

    @Column(name = "roles")
    private String roles;

    public Usuario() {}

    public Usuario(String nome, String email, String senha, Date dataCriacao, Date dataAtualizacao, String imagemPerfil, String status, String telefone, String enderecoRua, String enderecoNumero, String enderecoBairro, String enderecoCidade, String enderecoEstado, Date dataNascimento, String roles) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataCriacao = dataCriacao;
        this.dataAtualizacao = dataAtualizacao;
        this.imagemPerfil = imagemPerfil;
        this.status = status;
        this.telefone = telefone;
        this.enderecoRua = enderecoRua;
        this.enderecoNumero = enderecoNumero;
        this.enderecoBairro = enderecoBairro;
        this.enderecoCidade = enderecoCidade;
        this.enderecoEstado = enderecoEstado;
        this.dataNascimento = dataNascimento;
        this.roles = roles;
    }

    // Getters and Setters for all fields

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public String getImagemPerfil() {
        return imagemPerfil;
    }

    public void setImagemPerfil(String imagemPerfil) {
        this.imagemPerfil = imagemPerfil;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEnderecoRua() {
        return enderecoRua;
    }

    public void setEnderecoRua(String enderecoRua) {
        this.enderecoRua = enderecoRua;
    }

    public String getEnderecoNumero() {
        return enderecoNumero;
    }

    public void setEnderecoNumero(String enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }

    public String getEnderecoBairro() {
        return enderecoBairro;
    }

    public void setEnderecoBairro(String enderecoBairro) {
        this.enderecoBairro = enderecoBairro;
    }

    public String getEnderecoCidade() {
        return enderecoCidade;
    }

    public void setEnderecoCidade(String enderecoCidade) {
        this.enderecoCidade = enderecoCidade;
    }

    public String getEnderecoEstado() {
        return enderecoEstado;
    }

    public void setEnderecoEstado(String enderecoEstado) {
        this.enderecoEstado = enderecoEstado;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", dataAtualizacao=" + dataAtualizacao +
                ", imagemPerfil='" + imagemPerfil + '\'' +
                ", status='" + status + '\'' +
                ", telefone='" + telefone + '\'' +
                ", enderecoRua='" + enderecoRua + '\'' +
                ", enderecoNumero='" + enderecoNumero + '\'' +
                ", enderecoBairro='" + enderecoBairro + '\'' +
                ", enderecoCidade='" + enderecoCidade + '\'' +
                ", enderecoEstado='" + enderecoEstado + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", roles='" + roles + '\'' +
                '}';
    }
}
