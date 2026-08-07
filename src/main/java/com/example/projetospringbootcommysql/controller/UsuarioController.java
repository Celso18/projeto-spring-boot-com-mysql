package com.example.projetospringbootcommysql.controller;

import com.example.projetospringbootcommysql.entity.UsuarioEntity;
import com.example.projetospringbootcommysql.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*") // Permite requisições HTTP do FRONT-END
public class UsuarioController {

    @Autowired
    private UsuarioRepository comandos;

    @GetMapping
    public List<UsuarioEntity> listarUsuarios() {
        // Retorna todos os valores da tabela usuario_entity
        return comandos.findAll();
    }

    @PutMapping("/{id}")
    public UsuarioEntity atualizarUsuario(
            @PathVariable Long id,
            @RequestBody UsuarioEntity usuarioAtualizado
    ) {
        // Procura o usuário pelo ID usando Long e evita conflito com ScopedValue
        UsuarioEntity usuarioAtual = comandos.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        // Atualiza os dados dentro do objeto
        usuarioAtual.setNome(usuarioAtualizado.getNome());
        usuarioAtual.setEmail(usuarioAtualizado.getEmail());

        // Salva as alterações no banco de dados
        return comandos.save(usuarioAtual);
    }
}
