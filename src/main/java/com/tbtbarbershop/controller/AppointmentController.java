package com.tbtbarbershop.controller;

import com.tbtbarbershop.dto.AppointmentCreateDTO;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    // Injeção de dependência do Service viria aqui
    // public AppointmentController(...) {}

    @PostMapping
    public ResponseEntity<String> createAppointment(@Valid @RequestBody AppointmentCreateDTO appointmentDTO) {
        // A lógica para criar o agendamento seria implementada aqui.
        // Por enquanto, apenas logamos a requisição.
        log.info("Recebida requisição para criar agendamento: {}", appointmentDTO);

        // Exemplo de resposta
        return ResponseEntity.status(201).body("Agendamento criado com sucesso (simulação).");
    }
}
