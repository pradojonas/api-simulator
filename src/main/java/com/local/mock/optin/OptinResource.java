package com.local.mock.optin;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/optin-out-nfc/")
public class OptinResource {

    @PostMapping(value = "/")
    public ResponseEntity<OptinResponseDTO> consultarDadosCadastrais(@RequestBody OptinRequestDTO requestDTO) {

	OptinResponseDTO response = mockOptinResponseDTO();

	return ResponseEntity.ok(response);
    }

    private OptinResponseDTO mockOptinResponseDTO() {
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
