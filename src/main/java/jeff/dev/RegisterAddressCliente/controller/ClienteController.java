package jeff.dev.RegisterAddressCliente.controller;

import jeff.dev.RegisterAddressCliente.entity.Cliente;
import jeff.dev.RegisterAddressCliente.entity.DTOs.ClienteDTO;
import jeff.dev.RegisterAddressCliente.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ResponseEntity<Cliente> saveCliente(@RequestBody ClienteDTO body){
        Cliente cliente = clienteService.save(body);
        return ResponseEntity.ok(cliente);
    }
}
