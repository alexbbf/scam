package br.rr.gov.cbm.scam.view;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.rr.gov.cbm.scam.bean.ChavePesquisaDocumento;
import br.rr.gov.cbm.scam.bean.Documento;
import br.rr.gov.cbm.scam.business.DocumentoBusiness;


@ManagedBean
@ViewScoped
public class DocumentoMB {
	
	@EJB
	private DocumentoBusiness business;
	
	private Documento documento;
	
	private ChavePesquisaDocumento chavePesquisa;
	
	private List<Documento> documentos;
	
	private String palavraPesquisa;
	
	
	
	

	public void salvar() {
		 business.salvar(documento);
	}

	public void pesquisarPorAsssunto() {
		 business.pesquisarPorAsssunto(palavraPesquisa);
	}

	public List<Documento> pesquisarPorIdentificacao(String s) {
		return business.pesquisarPorIdentificacao(s);
	}

	public List<Documento> pesquisarPorOrigem(String s) {
		return business.pesquisarPorOrigem(s);
	}

	public List<Documento> pesquisarPorAssinadoPor(String s) {
		return business.pesquisarPorAssinadoPor(s);
	}

	public String getPalavraPesquisa() {
		return palavraPesquisa;
	}

	public void setPalavraPesquisa(String palavraPesquisa) {
		this.palavraPesquisa = palavraPesquisa;
	}

	public ChavePesquisaDocumento getChavePesquisa() {
		return chavePesquisa;
	}

	public void setChavePesquisa(ChavePesquisaDocumento chavePesquisa) {
		this.chavePesquisa = chavePesquisa;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public List<Documento> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}
	
	

}
