package com.local.mock.optin;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/optin-out-nfc")
public class OptinResource {

    @PostMapping
    public ResponseEntity<OptinResponseDTO> consultarDadosCadastrais(@RequestBody OptinRequestDTO requestDTO) {

	OptinResponseDTO response = mockResponseSucessoDTO();
	return ResponseEntity.ok(response);
	
//	OptinResponseDTO response = mockResponseErroDTO();
//	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }

    private OptinResponseDTO mockResponseErroDTO() {
	OptinResponseDTO mockErro = new OptinResponseDTO();
	mockErro.setCode("501 [Serviço Mockado]");
	mockErro.setMessage("Erro na chamada ao Mainframe [Serviço Mockado].");
	return mockErro;
    }

    private OptinResponseDTO mockResponseSucessoDTO() {
	OptinResponseDTO mock = new OptinResponseDTO();
	mock.setNomeLayout("PQ061WS");
	mock.setTamLayout("105");
	mock.setCode("PQ010");
	mock.setMessage("PARAMETRO HABILITA-NFC JA POSSUE ESSE VALOR [Serviço mockado em localhost]");
	mock.setFuncao("M");
	mock.setOrg("112");
	mock.setCartao("0004576756000145014");
	mock.setPid("");
	mock.setHabitaNfc("");
	
	return mock;
    }

}
