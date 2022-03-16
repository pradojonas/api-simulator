package com.local.mock.faturawhatsapp.exclusao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/optc/whatsapp")
public class ExclusaoWhatsAppOptinResource {

    @PostMapping("/cancela") 
    public ResponseEntity<ExclusaoWhatsAppOptinResponseDTO> consultarDadosCadastrais(@RequestBody ExclusaoWhatsAppOptinRequestDTO requestDTO) {

	return ResponseEntity.ok().build();
	
//	OptinResponseDTO response = mockResponseErroDTO();
//	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }

//    private OptinResponseDTO mockResponseErroDTO() {
//	OptinResponseDTO mockErro = new OptinResponseDTO();
//	mockErro.setCode("501");
//	mockErro.setMessage("Erro na chamada ao Mainframe.");
//	return mockErro;
//    }


}
