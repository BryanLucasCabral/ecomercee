package Usuarios_Api.model;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Column(nullable = false, length = 150)
    private String nome;
    
    @Column(nullable = false, unique =  true)
    private String email;

    @Column(nullable = false)
    private String senha;

    private String telefone;

    @Column(nullable = false)
    private String celular;

    @Column(nullable = false)
    private Boolean administrador;

    @Column(nullable = false)
    private Boolean colaborador;

    @Column(nullable = false)
    private Boolean usuarioExterno;
}
