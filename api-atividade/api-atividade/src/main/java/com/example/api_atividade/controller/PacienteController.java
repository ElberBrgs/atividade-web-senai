package com.example.api_atividade.controller;

import com.example.api_atividade.model.Paciente;
import com.example.api_atividade.service.PacienteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    private PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping
    public List<Paciente> listar() {
        return pacienteService.listar();
    }

    @PostMapping
    public ResponseEntity<Map<String,Object>> salvar(@Valid @RequestBody Paciente paciente){
        pacienteService.salvar(paciente);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Map.of("mensagem", "Paciente cadastrado com sucesso"));
    }

}
