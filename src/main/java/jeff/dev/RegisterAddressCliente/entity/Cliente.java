package jeff.dev.RegisterAddressCliente.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cliente")
@Data
@Builder
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "name", nullable = false)
    String name;

    @ManyToOne
    Endereco endereco;
}
