package Usuarios_Api.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_clientes")
public class Cliente extends Usuario {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true, length = 11)
    private String cpf;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(nullable = false)
    private LocalDate dataNascimento;

    @Embedded
    private Endereco endereco;
}
