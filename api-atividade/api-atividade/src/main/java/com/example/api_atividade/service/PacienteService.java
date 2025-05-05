package com.example.api_atividade.service;

import com.example.api_atividade.model.Paciente;
import com.example.api_atividade.repository.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class PacienteService {
    private PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    public Paciente salvar(@Valid Paciente paciente) {
        if (pacienteRepository.findByEmail(paciente.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email já cadastrado");
        }
        return pacienteRepository.save(paciente);
    }

    public List<Paciente> listar() {
        return pacienteRepository.findAll();
    }
}
