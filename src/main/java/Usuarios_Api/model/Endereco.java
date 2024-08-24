package Usuarios_Api.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {
    private String cep;
    private String logradouro;
    private String uf;
    private String bairro;
    private String numero;
    private String complemento;
}
