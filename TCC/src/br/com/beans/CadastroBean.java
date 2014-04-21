package br.com.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.domain.Funcionario;
import br.com.domain.Passagem;
import br.com.domain.Pessoa;
import br.com.domain.PassagemDataModel;
import br.com.estado.domain.Estado;
import br.com.estado.facade.EstadoServiceFacade;
import br.com.facade.PassagemServiceFacade;
import br.com.facade.PessoaServiceFacade;


@Controller
@ViewScoped 
public class CadastroBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	
	private Pessoa pessoa;
	private Funcionario funcionario;
	private List<Pessoa>listarPessoas;
	private List<Passagem>listarPassagens;
	private Pessoa[] pessoas;
	
	private Pessoa selectedPessoa;
	private Passagem selectedPassagem;
	private Passagem selectedPassagemVolta;
	private PassagemDataModel mediumPassagemModel;  
	private Passagem passagem;
	private List<Estado>listarEstado = new ArrayList<Estado>();
	private Integer options;
	
	
	@Autowired
	private PessoaServiceFacade pessoaServiceFacade;
	
	@Autowired
	private PassagemServiceFacade passagemServiceFacade;
	
	@Autowired
	private EstadoServiceFacade estadoServiceFacade;
	

	  private void init() {
		 listarPassagens = new ArrayList<Passagem>();
		 setListarPassagens(passagemServiceFacade.findAllPassagem());
	      pessoa = new Pessoa();
	      funcionario = new Funcionario();
	      passagem = new Passagem();
	      mediumPassagemModel = new PassagemDataModel(listarPassagens);
	      listarEstado = new ArrayList<Estado>();
	 }
	 

	 
	 public String cadastrar(){
		 pessoaServiceFacade.save(pessoa);
		 return "sucesso";
	 }
	
	public String iniciar(){
		return"pages/teste";
	}
	
	public String teste(){
		return "pages/cadastroUsuario";
	}
	
	public String listarPassagens(){
		return "pages/listarPassagemIdaeVolta";
	}
	public String obterPassagemSelecionada(){
		return "selecionarAcento";
	}
	
	
	public String cancelar(){
		return"sucesso";
	}
	
	
	public String listarPassagem(){
		return null;
	}
	
	
	/**   Gets and Sets   **/
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public PessoaServiceFacade getPessoaServiceFacade() {
		return pessoaServiceFacade;
	}

	public void setPessoaServiceFacade(PessoaServiceFacade pessoaServiceFacade) {
		this.pessoaServiceFacade = pessoaServiceFacade;
	}
	
	 private void message(String msg) {
	        FacesContext.getCurrentInstance().addMessage(null,
	                new FacesMessage(msg, ""));
	    }
	 
	 

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<Pessoa> getListarPessoas() {
	
		return listarPessoas;
	}

	public void setListarPessoas(List<Pessoa> listarPessoas) {
		this.listarPessoas = listarPessoas;
	}



	public Pessoa getSelectedPessoa() {
		return selectedPessoa;
	}



	public void setSelectedPessoa(Pessoa selectedPessoa) {
		this.selectedPessoa = selectedPessoa;
	}



	public List<Passagem> getListarPassagens() {
		return listarPassagens;
	}



	public void setListarPassagens(List<Passagem> listarPassagens) {
		this.listarPassagens = listarPassagens;
	}



	public PassagemServiceFacade getPassagemServiceFacade() {
		return passagemServiceFacade;
	}



	public void setPassagemServiceFacade(PassagemServiceFacade passagemServiceFacade) {
		this.passagemServiceFacade = passagemServiceFacade;
	}



	public Pessoa[] getPessoas() {
		return pessoas;
	}



	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}



	public Passagem getSelectedPassagem() {
		return selectedPassagem;
	}



	public void setSelectedPassagem(Passagem selectedPassagem) {
		this.selectedPassagem = selectedPassagem;
	}



	public PassagemDataModel getMediumPassagemModel() {
		return mediumPassagemModel;
	}



	public void setMediumPassagemModel(PassagemDataModel mediumPassagemModel) {
		this.mediumPassagemModel = mediumPassagemModel;
	}



	public Passagem getPassagem() {
		return passagem;
	}



	public void setPassagem(Passagem passagem) {
		this.passagem = passagem;
	}



	public Passagem getSelectedPassagemVolta() {
		return selectedPassagemVolta;
	}



	public void setSelectedPassagemVolta(Passagem selectedPassagemVolta) {
		this.selectedPassagemVolta = selectedPassagemVolta;
	}



	public List<Estado> getListarEstado() {
		if(listarEstado.isEmpty()){
			setListarEstado(estadoServiceFacade.listarEstado());
		}
		return listarEstado;
	}



	public void setListarEstado(List<Estado> listarEstado) {
		this.listarEstado = listarEstado;
	}



	public Integer getOptions() {
		return options;
	}



	public void setOptions(Integer options) {
		this.options = options;
	}



	

}
