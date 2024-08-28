package jeff.dev.RegisterAddressCliente.entity.DTOs;

import jeff.dev.RegisterAddressCliente.entity.Cliente;
import jeff.dev.RegisterAddressCliente.entity.Endereco;

public record ClienteDTO(String name, String cep) {

    public static Cliente ToCliente(ClienteDTO body) {
        Endereco endereco = new Endereco();
        endereco.setCep(body.cep);

        return Cliente.builder()
                .name(body.name())
                .endereco(endereco)
                .build();
    }
}
