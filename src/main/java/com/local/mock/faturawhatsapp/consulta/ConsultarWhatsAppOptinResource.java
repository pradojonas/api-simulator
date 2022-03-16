package com.local.mock.faturawhatsapp.consulta;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/optc/whatsapp")
public class ConsultarWhatsAppOptinResource {

    @PostMapping("/consultar") 
    public ResponseEntity<ConsultarWhatsAppOptinResponseDTO> consultarDadosCadastrais(@RequestParam String ccg_cpf, @RequestParam(value="channel_id", required=false) String channel_id, 
    		@RequestParam String ctrl_ccg_cpf, @RequestParam(value="social_media_id", required=false) String social_media_id, @RequestParam String channel_id_origin) {
    	System.out.println(ccg_cpf);
    	
	ConsultarWhatsAppOptinResponseDTO response = mockResponseSucessoDTO();
	return ResponseEntity.ok(response);
	
//	OptinResponseDTO response = mockResponseErroDTO();
//	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }

//    private OptinResponseDTO mockResponseErroDTO() {
//	OptinResponseDTO mockErro = new OptinResponseDTO();
//	mockErro.setCode("501");
//	mockErro.setMessage("Erro na chamada ao Mainframe.");
//	return mockErro;
//    }

    private ConsultarWhatsAppOptinResponseDTO mockResponseSucessoDTO() {
	ConsultarWhatsAppOptinResponseDTO mock = new ConsultarWhatsAppOptinResponseDTO();
	List<ConsultarWhatsAppDadosContaDTO> mockList = new ArrayList<ConsultarWhatsAppDadosContaDTO>();
	ConsultarWhatsAppDadosContaDTO elemento = new ConsultarWhatsAppDadosContaDTO();
	
	elemento.setAccount(12345L);
	elemento.setBranch(3963L);
	elemento.setDigit(1L);
	elemento.setStatus("Ativo");
	
	mockList.add(elemento);
	mock.setAccount_data(mockList);
	
	mock.setCcg_cpf(123456789L);
	mock.setChannel_id_origin(521L);
	mock.setClient_id(5534777896624L);
	mock.setCtrl_ccg_cpf(12L);
	mock.setProducts(new ArrayList<String>());
	mock.setRegistration("2021-05-13T14:53:45");
	mock.setStatus("ENABLED");
	mock.setUpdate("2021-05-19T14:53:45");
	
	return mock;
    }

}
