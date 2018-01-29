package br.com.produban.agencia.ligacoes.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Document(collection = "ligacoes")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ligacoes {

	@Id
	private String id;
	
	private String rede;
	private String regional;
	private String nome;
	private int central;
	private int uniorg;
	private int ramal;
	private String dataLigacao;
	private String diaSemana;
	private String mes;
	private String semanaMes;
	private String horaLigacao;
	private String numeroEntrada;
	private int duracao;
	private int quantidade;
	private String tipoRamal;
	private String tipo;
	private String pin;
	private int totalPf;
	private int totalPj;
	private String  porte;
	
	
	public String getRede() {
		return rede;
	}
	public void setRede(String rede) {
		this.rede = rede;
	}
	public String getRegional() {
		return regional;
	}
	public void setRegional(String regional) {
		this.regional = regional;
	}
	public int getCentral() {
		return central;
	}
	public void setCentral(int central) {
		this.central = central;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRamal() {
		return ramal;
	}
	public void setRamal(int ramal) {
		this.ramal = ramal;
	}
	public int getUniorg() {
		return uniorg;
	}
	public void setUniorg(int uniorg) {
		this.uniorg = uniorg;
	}
	
	
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	
	
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDataLigacao() {
		return dataLigacao;
	}
	public void setDataLigacao(String dataLigacao) {
		this.dataLigacao = dataLigacao;
	}
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public String getSemanaMes() {
		return semanaMes;
	}
	public void setSemanaMes(String semanaMes) {
		this.semanaMes = semanaMes;
	}
	public String getHoraLigacao() {
		return horaLigacao;
	}
	public void setHoraLigacao(String horaLigacao) {
		this.horaLigacao = horaLigacao;
	}
	public String getNumeroEntrada() {
		return numeroEntrada;
	}
	public void setNumeroEntrada(String numeroEntrada) {
		this.numeroEntrada = numeroEntrada;
	}
	public String getTipoRamal() {
		return tipoRamal;
	}
	public void setTipoRamal(String tipoRamal) {
		this.tipoRamal = tipoRamal;
	}
	public int getTotalPf() {
		return totalPf;
	}
	public void setTotalPf(int totalPf) {
		this.totalPf = totalPf;
	}
	public int getTotalPj() {
		return totalPj;
	}
	public void setTotalPj(int totalPj) {
		this.totalPj = totalPj;
	}
}
