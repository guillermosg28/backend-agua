package dev.hackaton.agua.domain.service;

import dev.hackaton.agua.application.ports.input.EventUseCase;
import dev.hackaton.agua.domain.model.EventRequest;
import dev.hackaton.agua.domain.model.SuccessResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class EventService implements EventUseCase {
    @Override
    public SuccessResponse createEvent(EventRequest eventRequest) {

        SuccessResponse successResponse = new SuccessResponse();
        successResponse.setCode("000");
        successResponse.setMessage("Evento creado correctamente");
        return successResponse;
    }
}
