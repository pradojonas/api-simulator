package com.local.mock.faturawhatsapp.manutencao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/optc/whatsapp")
public class ManutencaoWhatsAppOptinResource {

    @PostMapping("/incluir") 
    public ResponseEntity<ManutencaoWhatsAppOptinResponseDTO> consultarDadosCadastrais(@RequestBody ManutencaoWhatsAppOptinRequestDTO requestDTO) {

	ManutencaoWhatsAppOptinResponseDTO response = mockResponseSucessoDTO();
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

    private ManutencaoWhatsAppOptinResponseDTO mockResponseSucessoDTO() {
	ManutencaoWhatsAppOptinResponseDTO mock = new ManutencaoWhatsAppOptinResponseDTO();
	
	return mock;
    }

}
