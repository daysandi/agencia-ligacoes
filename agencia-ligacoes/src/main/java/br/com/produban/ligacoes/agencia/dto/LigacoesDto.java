package br.com.produban.ligacoes.agencia.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LigacoesDto {
	
	private String rede;
	private String regional;
	private String nome;
	private Long central;
	private Long uniorg;
	private Long ramal;
	private Long dataLigacao;
	private String diaSemana;
	private String mes;
	private Long semana_mes;
	private Long horaLigacao;
	private Long numero_entrada;
	private Long duracao;
	private Long quantidade;
	private String tipoRamal;
	private String tipo;
	private Long pin;
	private Long totalPf;
	private Long totalPj;
	
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
	public Long getHoraLigacao() {
		return horaLigacao;
	}
	public void setHoraLigacao(Long horaLigacao) {
		this.horaLigacao = horaLigacao;
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCentral() {
		return central;
	}
	public void setCentral(Long central) {
		this.central = central;
	}
	public Long getUniorg() {
		return uniorg;
	}
	public void setUniorg(Long uniorg) {
		this.uniorg = uniorg;
	}
	public Long getRamal() {
		return ramal;
	}
	public void setRamal(Long ramal) {
		this.ramal = ramal;
	}

	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public Long getSemana_mes() {
		return semana_mes;
	}
	public void setSemana_mes(Long semana_mes) {
		this.semana_mes = semana_mes;
	}
	
	public Long getNumero_entrada() {
		return numero_entrada;
	}
	public void setNumero_entrada(Long numero_entrada) {
		this.numero_entrada = numero_entrada;
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

}
