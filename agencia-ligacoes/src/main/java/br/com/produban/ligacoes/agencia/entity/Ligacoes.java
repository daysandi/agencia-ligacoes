package br.com.produban.ligacoes.agencia.entity;

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
	private Long central;
	private Long uniorg;
	private Long ramal;
	private Long dataLigacao;
	private String diaSemana;
	private String mes;
	private Long semanaMes;
	private Long horaLigacao;
	private Long numeroEntrada;
	private Long duracao;
	private Long quantidade;
	private String tipoRamal;
	private String tipo;
	private Long pin;
	private Long totalPf;
	private Long totalPj;
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
	public Long getCentral() {
		return central;
	}
	public void setCentral(Long central) {
		this.central = central;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getRamal() {
		return ramal;
	}
	public void setRamal(Long ramal) {
		this.ramal = ramal;
	}
	public Long getUniorg() {
		return uniorg;
	}
	public void setUniorg(Long uniorg) {
		this.uniorg = uniorg;
	}
	
	
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	
	
	public Long getDuracao() {
		return duracao;
	}
	public void setDuracao(Long duracao) {
		this.duracao = duracao;
	}
	public Long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Long getPin() {
		return pin;
	}
	public void setPin(Long pin) {
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
	public Long getDataLigacao() {
		return dataLigacao;
	}
	public void setDataLigacao(Long dataLigacao) {
		this.dataLigacao = dataLigacao;
	}
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public Long getSemanaMes() {
		return semanaMes;
	}
	public void setSemanaMes(Long semanaMes) {
		this.semanaMes = semanaMes;
	}
	public Long getHoraLigacao() {
		return horaLigacao;
	}
	public void setHoraLigacao(Long horaLigacao) {
		this.horaLigacao = horaLigacao;
	}
	public Long getNumeroEntrada() {
		return numeroEntrada;
	}
	public void setNumeroEntrada(Long numeroEntrada) {
		this.numeroEntrada = numeroEntrada;
	}
	public String getTipoRamal() {
		return tipoRamal;
	}
	public void setTipoRamal(String tipoRamal) {
		this.tipoRamal = tipoRamal;
	}
	public Long getTotalPf() {
		return totalPf;
	}
	public void setTotalPf(Long totalPf) {
		this.totalPf = totalPf;
	}
	public Long getTotalPj() {
		return totalPj;
	}
	public void setTotalPj(Long totalPj) {
		this.totalPj = totalPj;
	}
}
