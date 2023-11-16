package dev.hackaton.agua.infrastructure.adapters.input.rest;

import dev.hackaton.agua.application.ports.input.EventUseCase;
import dev.hackaton.agua.domain.model.EventRequest;
import dev.hackaton.agua.domain.model.SuccessResponse;
import dev.hackaton.agua.infrastructure.adapters.input.rest.data.ReceptionEventRequestDto;
import dev.hackaton.agua.infrastructure.adapters.input.rest.data.SuccessResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Users rest adapter.
 */
@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/v1/")
public class EventRestAdapter implements EventApi{

    private final EventUseCase eventUseCase;

    @Override
    public ResponseEntity<SuccessResponseDto> _createEvent(ReceptionEventRequestDto receptionEventRequestDto) {

        EventRequest eventRequest = new EventRequest();
        eventRequest.getActivity();
        eventRequest.getTime();
        eventRequest.getUser();
        eventRequest.getName();
        eventRequest.getConsumption();

        SuccessResponse successResponse = eventUseCase.createEvent(eventRequest);

        SuccessResponseDto successResponseDto = new SuccessResponseDto();
        successResponseDto.setCode(successResponse.getCode());
        successResponseDto.setMessage(successResponse.getMessage());

        return ResponseEntity.ok().body(successResponseDto);
    }

}
