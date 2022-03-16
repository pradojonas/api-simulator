package com.local.mock.faturawhatsapp.consulta;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConsultarWhatsAppOptinResponseDTO {

    private Long ccg_cpf;
    private Long ctrl_ccg_cpf;
    private List<ConsultarWhatsAppDadosContaDTO> account_data;
    private Long channel_id_origin;
    private Long client_id;
    private List<String> products ;
    private String registration;
    private String status;
    private String update;
    
    
	public List<ConsultarWhatsAppDadosContaDTO> getAccount_data() {
		return account_data;
	}
	public void setAccount_data(List<ConsultarWhatsAppDadosContaDTO> account_data) {
		this.account_data = account_data;
	}
	public Long getChannel_id_origin() {
		return channel_id_origin;
	}
	public void setChannel_id_origin(Long channel_id_origin) {
		this.channel_id_origin = channel_id_origin;
	}
	public Long getClient_id() {
		return client_id;
	}
	public void setClient_id(Long client_id) {
		this.client_id = client_id;
	}
	public List<String> getProducts() {
		return products;
	}
	public void setProducts(List<String> products) {
		this.products = products;
	}
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUpdate() {
		return update;
	}
	public void setUpdate(String update) {
		this.update = update;
	}
	public void setCcg_cpf(Long ccg_cpf) {
		this.ccg_cpf = ccg_cpf;
	}
	public void setCtrl_ccg_cpf(Long ctrl_ccg_cpf) {
		this.ctrl_ccg_cpf = ctrl_ccg_cpf;
	}
	public Long getCcg_cpf() {
		return ccg_cpf;
	}
	public Long getCtrl_ccg_cpf() {
		return ctrl_ccg_cpf;
	}
	
    
}