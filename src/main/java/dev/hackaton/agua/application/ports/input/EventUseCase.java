package dev.hackaton.agua.application.ports.input;

import dev.hackaton.agua.domain.model.EventRequest;
import dev.hackaton.agua.domain.model.SuccessResponse;

public interface EventUseCase {

    SuccessResponse createEvent(EventRequest eventRequest);
}
