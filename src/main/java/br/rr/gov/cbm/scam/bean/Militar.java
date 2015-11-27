package br.rr.gov.cbm.scam.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Militar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nomeCompleto; // Campo em caixa alta;

	@Enumerated(EnumType.STRING)
	private Sexo sexo;

	@Enumerated(EnumType.STRING)
	private Raca raca;

	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

	@ManyToOne
	private Municipio naturalidade;

	private String nomePai; // Campo em caixa alta;

	private String nomeMae; // Campo em caixa alta;

	@Enumerated(EnumType.STRING)
	private TipoSanguineo tipoSanguineo;

	@Enumerated(EnumType.STRING)
	private FatorRH fatorRH;

	@Enumerated(EnumType.STRING)
	private EstadoCivil estadoCivil;

	@Embedded
	private Conjuge conjuge;

	@Embedded
	private Endereco endereco;

	private String email;

	private String telefoneFixo;

	private String telefoneCelular;

	private String telefoneCelular2;

	private String contatoEmergencia;

	private String telefoneEmergencia;

	private String pisPasep;

	private String ctps;

	@Embedded
	private TituloEleitor tituloEleitor;

	@Embedded
	private Habilitacao cnh;

	@Embedded
	private Rg rg;

	private String numeroAgencia;

	private String numeroConta;

	private Banco banco;

	private String cpf;

	private String cpfSemMascara;

	private String senha;

	private String nomeGuerra;

	@Enumerated(EnumType.STRING)
	private Vinculo vinculo;

	private String matricula;

	private String siape;

	private Integer antiguidadeGeral;

	private Integer antiguidadeQuadro;

	@ManyToOne
	private PostoGraduacao postoGraduacao;

	@Temporal(TemporalType.DATE)
	private Date dataPromocao;

	@Enumerated(EnumType.STRING)
	private Comportamento comportamento;

	@Enumerated(EnumType.STRING)
	private SituacaoMilitar situacaoMilitar;

	@Enumerated
	private SituacaoMilitarAtiva situacaoMilitarAtiva;

	private String localAgregacao;

	@ManyToOne
	private Setor setor;

	@ManyToOne
	private Setor adisposicao;

	@ManyToOne
	private Quadro quadro;

	@Temporal(TemporalType.DATE)
	private Date dataIncorporacao;

	@Enumerated(EnumType.STRING)
	private Escolaridade escolaridade;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "militar", fetch = FetchType.EAGER)
	private List<Curso> cursos;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "militar", fetch = FetchType.EAGER)
	private List<Dependente> dependentes;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "militar", fetch = FetchType.EAGER)
	private List<Pensionista> pensionistas;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "militar", fetch = FetchType.EAGER)
	private List<Permissao> permissoes;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "militar", fetch = FetchType.EAGER)
	private List<Permissao> elogios;

	public void removerCurso(Curso curso) {
		this.cursos.remove(curso);
	}

	public void adicionarCurso(Curso curso) {
		if (cursos == null) {
			cursos = new ArrayList<Curso>();
		}
		curso.setMilitar(this);
		cursos.add(curso);
	}

	public void removerDependente(Dependente dependente) {
		this.dependentes.remove(dependente);
	}

	public void adicionarDependente(Dependente dependente) {
		if (dependentes == null) {
			dependentes = new ArrayList<Dependente>();
		}
		dependente.setMilitar(this);
		dependentes.add(dependente);
	}

	public void adicionarPensionista(Pensionista pensionista) {
		if (pensionistas == null) {
			pensionistas = new ArrayList<Pensionista>();
		}
		pensionista.setMilitar(this);
		pensionistas.add(pensionista);
	}

	public void adicionarPermissao(Permissao permissao) {
		if (permissoes == null) {
			permissoes = new ArrayList<Permissao>();
		}
		permissao.setMilitar(this);
		permissoes.add(permissao);
	}

	public List<Pensionista> getPensionistas() {
		return pensionistas;
	}

	public void setPensionistas(List<Pensionista> pensionistas) {
		this.pensionistas = pensionistas;
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}

	public SituacaoMilitar getSituacaoMilitar() {
		return situacaoMilitar;
	}

	public void setSituacaoMilitar(SituacaoMilitar situacaoMilitar) {
		this.situacaoMilitar = situacaoMilitar;
	}

	public SituacaoMilitarAtiva getSituacaoMilitarAtiva() {
		return situacaoMilitarAtiva;
	}

	public void setSituacaoMilitarAtiva(
			SituacaoMilitarAtiva situacaoMilitarAtiva) {
		this.situacaoMilitarAtiva = situacaoMilitarAtiva;
	}

	public String getLocalAgregacao() {
		return localAgregacao;
	}

	public void setLocalAgregacao(String localAgregacao) {
		this.localAgregacao = localAgregacao;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public String getCpfSemMascara() {
		return cpfSemMascara;
	}

	public void setCpfSemMascara(String cpfSemMascara) {
		this.cpfSemMascara = cpfSemMascara;
	}

	public Setor getAdisposicao() {
		return adisposicao;
	}

	public void setAdisposicao(Setor adisposicao) {
		this.adisposicao = adisposicao;
	}

	public Quadro getQuadro() {
		return quadro;
	}

	public void setQuadro(Quadro quadro) {
		this.quadro = quadro;
	}

	public String getNomeGuerra() {
		return nomeGuerra;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha =senha;
	}

	public void setNomeGuerra(String nomeGuerra) {
		this.nomeGuerra = nomeGuerra;
	}

	public Vinculo getVinculo() {
		return vinculo;
	}

	public void setVinculo(Vinculo vinculo) {
		this.vinculo = vinculo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}

	public Integer getAntiguidadeGeral() {
		return antiguidadeGeral;
	}

	public void setAntiguidadeGeral(Integer antiguidadeGeral) {
		this.antiguidadeGeral = antiguidadeGeral;
	}

	public Integer getAntiguidadeQuadro() {
		return antiguidadeQuadro;
	}

	public void setAntiguidadeQuadro(Integer antiguidadeQuadro) {
		this.antiguidadeQuadro = antiguidadeQuadro;
	}

	public PostoGraduacao getPostoGraduacao() {
		return postoGraduacao;
	}

	public void setPostoGraduacao(PostoGraduacao postoGraduacao) {
		this.postoGraduacao = postoGraduacao;
	}

	public Date getDataPromocao() {
		return dataPromocao;
	}

	public void setDataPromocao(Date dataPromocao) {
		this.dataPromocao = dataPromocao;
	}

	public Comportamento getComportamento() {
		return comportamento;
	}

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}

	public Date getDataIncorporacao() {
		return dataIncorporacao;
	}

	public void setDataIncorporacao(Date dataIncorporacao) {
		this.dataIncorporacao = dataIncorporacao;
	}

	public Escolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

	public List<Curso> getCursos() {
		if (cursos == null) {
			cursos = new ArrayList<Curso>();
		}
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	public Habilitacao getCnh() {
		if (cnh == null) {
			cnh = new Habilitacao();
		}
		return cnh;
	}

	public void setCnh(Habilitacao cnh) {
		this.cnh = cnh;
	}

	public Rg getRg() {
		if (rg == null) {
			rg = new Rg();
		}
		return rg;
	}

	public void setRg(Rg rg) {
		this.rg = rg;
	}

	public TituloEleitor getTituloEleitor() {
		if (tituloEleitor == null) {
			tituloEleitor = new TituloEleitor();
		}
		return tituloEleitor;
	}

	public void setTituloEleitor(TituloEleitor tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}

	public String getPisPasep() {
		return pisPasep;
	}

	public void setPisPasep(String pisPasep) {
		this.pisPasep = pisPasep;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public String getContatoEmergencia() {
		return contatoEmergencia;
	}

	public void setContatoEmergencia(String contatoEmergencia) {
		this.contatoEmergencia = contatoEmergencia;
	}

	public String getTelefoneEmergencia() {
		return telefoneEmergencia;
	}

	public void setTelefoneEmergencia(String telefoneEmergencia) {
		this.telefoneEmergencia = telefoneEmergencia;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getTelefoneCelular2() {
		return telefoneCelular2;
	}

	public void setTelefoneCelular2(String telefoneCelular2) {
		this.telefoneCelular2 = telefoneCelular2;
	}

	public Endereco getEndereco() {
		if (endereco == null) {
			endereco = new Endereco();
		}
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Conjuge getConjuge() {
		if (this.conjuge == null) {
			this.conjuge = new Conjuge();
		}
		return conjuge;
	}

	public void setConjuge(Conjuge conjuge) {
		this.conjuge = conjuge;
	}

	public TipoSanguineo getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public FatorRH getFatorRH() {
		return fatorRH;
	}

	public void setFatorRH(FatorRH fatorRH) {
		this.fatorRH = fatorRH;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public List<Permissao> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Raca getRaca() {
		return raca;
	}

	public void setRaca(Raca raca) {
		this.raca = raca;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Municipio getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(Municipio naturalidade) {
		this.naturalidade = naturalidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Militar other = (Militar) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
