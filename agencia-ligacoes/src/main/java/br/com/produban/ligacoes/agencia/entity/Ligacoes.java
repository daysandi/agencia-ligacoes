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
	private Long data_ligacao;
	private String dia_semana;
	private String mes;
	private Long semana_mes;
	private Long hora_ligacao;
	private Long numero_entrada;
	private Long duracao;
	private Long quantidade;
	private String tipo_ramal;
	private String tipo;
	private Long pin;
	private Long total_pf;
	private Long total_pj;
	private String  porte;
	
	
	public Long getTotal_pj() {
		return total_pj;
	}
	public void setTotal_pj(Long total_pj) {
		this.total_pj = total_pj;
	}
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
	public Long getData_ligacao() {
		return data_ligacao;
	}
	public void setData_ligacao(Long data_ligacao) {
		this.data_ligacao = data_ligacao;
	}
	public String getDia_semana() {
		return dia_semana;
	}
	public void setDia_semana(String dia_semana) {
		this.dia_semana = dia_semana;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public Long getHora_ligacao() {
		return hora_ligacao;
	}
	public void setHora_ligacao(Long hora_ligacao) {
		this.hora_ligacao = hora_ligacao;
	}
	public Long getNumero_entrada() {
		return numero_entrada;
	}
	public void setNumero_entrada(Long numero_entrada) {
		this.numero_entrada = numero_entrada;
	}
	public Long getSemana_mes() {
		return semana_mes;
	}
	public void setSemana_mes(Long semana_mes) {
		this.semana_mes = semana_mes;
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
	public String getTipo_ramal() {
		return tipo_ramal;
	}
	public void setTipo_ramal(String tipo_ramal) {
		this.tipo_ramal = tipo_ramal;
	}
	public Long getPin() {
		return pin;
	}
	public void setPin(Long pin) {
		this.pin = pin;
	}
	public Long getTotal_pf() {
		return total_pf;
	}
	public void setTotal_pf(Long total_pf) {
		this.total_pf = total_pf;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
}
