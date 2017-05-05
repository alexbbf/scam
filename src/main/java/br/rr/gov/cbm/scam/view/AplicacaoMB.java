package br.rr.gov.cbm.scam.view;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.rr.gov.cbm.scam.bean.AreaAtuacao;
import br.rr.gov.cbm.scam.bean.AreaCurso;
import br.rr.gov.cbm.scam.bean.Banco;
import br.rr.gov.cbm.scam.bean.CategoriaCNH;
import br.rr.gov.cbm.scam.bean.ChavePesquisaDocumento;
import br.rr.gov.cbm.scam.bean.ChavePesquisaMilitar;
import br.rr.gov.cbm.scam.bean.Comportamento;
import br.rr.gov.cbm.scam.bean.Escolaridade;
import br.rr.gov.cbm.scam.bean.EstadoCivil;
import br.rr.gov.cbm.scam.bean.FatorRH;
import br.rr.gov.cbm.scam.bean.Grupo;
import br.rr.gov.cbm.scam.bean.OBMAtuacao;
import br.rr.gov.cbm.scam.bean.Parentesco;
import br.rr.gov.cbm.scam.bean.Raca;
import br.rr.gov.cbm.scam.bean.Sexo;
import br.rr.gov.cbm.scam.bean.SituacaoCurso;
import br.rr.gov.cbm.scam.bean.SituacaoMilitar;
import br.rr.gov.cbm.scam.bean.SituacaoMilitarAtiva;
import br.rr.gov.cbm.scam.bean.SituacaoOcorrencia;
import br.rr.gov.cbm.scam.bean.TipoCurso;
import br.rr.gov.cbm.scam.bean.TipoDependente;
import br.rr.gov.cbm.scam.bean.TipoLogradouro;
import br.rr.gov.cbm.scam.bean.TipoPensionista;
import br.rr.gov.cbm.scam.bean.TipoSanguineo;
import br.rr.gov.cbm.scam.bean.Vinculo;

@ManagedBean
@ApplicationScoped
public class AplicacaoMB {

	private Vinculo federal = Vinculo.FEDERAL;
	private SituacaoMilitar ativa = SituacaoMilitar.ATIVA;
	private SituacaoMilitarAtiva agregado = SituacaoMilitarAtiva.AGREGADO;

	private Sexo[] sexos = Sexo.values();
	private Raca[] racas = Raca.values();
	
	private TipoSanguineo[] tiposSanguineos = TipoSanguineo.values();
	private FatorRH[] fatoresRH = FatorRH.values();
	private EstadoCivil[] estadosCivis = EstadoCivil.values();
	private TipoLogradouro[] tiposLogradouro = TipoLogradouro.values();
	private CategoriaCNH[] categoriasCNH = CategoriaCNH.values();
	private Banco[] bancos = Banco.values();
	private AreaCurso[] areaCursos = AreaCurso.values();
	private TipoCurso[] tipoCursos = TipoCurso.values();
	private SituacaoCurso[] situacoesCurso = SituacaoCurso.values();
	private Escolaridade[] escolaridades = Escolaridade.values();
	private Vinculo[] vinculos = Vinculo.values();
	private Comportamento[] comportamentos = Comportamento.values();
	private SituacaoMilitar[] situacoesMilitar = SituacaoMilitar.values();
	private SituacaoMilitarAtiva[] situacoesMilitarAtiva = SituacaoMilitarAtiva
			.values();
	private Parentesco[] parentescos = Parentesco.values();
	private TipoDependente[] tipoDependente = TipoDependente.values();
	private ChavePesquisaMilitar[] chavesPesquisa = ChavePesquisaMilitar.values();
	private ChavePesquisaDocumento[] chavesPesquisaDoc = ChavePesquisaDocumento.values();
	private TipoPensionista[] tipoPensionistas = TipoPensionista.values();
	private Grupo[] grupos = Grupo.values();
	private SituacaoOcorrencia[] situacaoOcorrencias = SituacaoOcorrencia.values();
	private OBMAtuacao[] obmAtuacao = OBMAtuacao.values();
	private AreaAtuacao[] areaAtuacao = AreaAtuacao.values();
	
	public AreaAtuacao[] getAreaAtuacao() {
		return areaAtuacao;
	}
	
	public OBMAtuacao[] getObmAtuacao() {
		return obmAtuacao;
	}
	
	public ChavePesquisaDocumento[] getChavesPesquisaDoc() {
		return chavesPesquisaDoc;
	}
	
	public Grupo[] getGrupos() {
		return grupos;
	}
	
	public SituacaoOcorrencia[] getSituacaoOcorrencias() {
		return situacaoOcorrencias;
	}
	
	public TipoPensionista[] getTipoPensionistas() {
		return tipoPensionistas;
	}
	
	public ChavePesquisaMilitar[] getChavesPesquisa() {
		return chavesPesquisa;
	}
	
	public TipoDependente[] getTipoDependente() {
		return tipoDependente;
	}
	
	public Parentesco[] getParentescos() {
		return parentescos;
	}

	public SituacaoMilitarAtiva[] getSituacoesMilitarAtiva() {
		return situacoesMilitarAtiva;
	}

	public SituacaoMilitar getAtiva() {
		return ativa;
	}

	public SituacaoMilitarAtiva getAgregado() {
		return agregado;
	}

	public SituacaoMilitar[] getSituacoesMilitar() {
		return situacoesMilitar;
	}

	public Vinculo getFederal() {
		return federal;
	}

	public Comportamento[] getComportamentos() {
		return comportamentos;
	}

	public Vinculo[] getVinculos() {
		return vinculos;
	}

	public Escolaridade[] getEscolaridades() {
		return escolaridades;
	}

	public AreaCurso[] getAreaCursos() {
		return areaCursos;
	}

	public TipoCurso[] getTipoCursos() {
		return tipoCursos;
	}

	public SituacaoCurso[] getSituacoesCurso() {
		return situacoesCurso;
	}

	public Banco[] getBancos() {
		return bancos;
	}

	public CategoriaCNH[] getCategoriasCNH() {
		return categoriasCNH;
	}

	public TipoLogradouro[] getTiposLogradouro() {
		return tiposLogradouro;
	}

	public EstadoCivil[] getEstadosCivis() {
		return estadosCivis;
	}

	public FatorRH[] getFatoresRH() {
		return fatoresRH;
	}

	public TipoSanguineo[] getTiposSanguineos() {
		return tiposSanguineos;
	}

	public Raca[] getRacas() {
		return racas;
	}

	public Sexo[] getSexos() {
		return sexos;
	}

}
