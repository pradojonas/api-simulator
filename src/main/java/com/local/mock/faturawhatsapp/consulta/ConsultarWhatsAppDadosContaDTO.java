package com.local.mock.faturawhatsapp.consulta;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsultarWhatsAppDadosContaDTO {

	
	private Long account;
	private Long branch;
	private Long digit;
	private String status;
	
	
	
	public Long getAccount() {
		return account;
	}
	public void setAccount(Long account) {
		this.account = account;
	}
	public Long getBranch() {
		return branch;
	}
	public void setBranch(Long branch) {
		this.branch = branch;
	}
	public Long getDigit() {
		return digit;
	}
	public void setDigit(Long digit) {
		this.digit = digit;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
