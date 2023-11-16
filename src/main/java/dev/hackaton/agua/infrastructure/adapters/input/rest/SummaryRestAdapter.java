package dev.hackaton.agua.infrastructure.adapters.input.rest;

import dev.hackaton.agua.application.ports.input.SummaryUseCase;
import dev.hackaton.agua.domain.model.SummaryResponse;
import dev.hackaton.agua.infrastructure.adapters.input.rest.data.SummaryResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class SummaryRestAdapter implements SummaryApi{

    private final SummaryUseCase summaryUseCase;
    @Override
    public ResponseEntity<SummaryResponseDto> _summaryUser(Integer userId) {

        SummaryResponse summaryResponse = summaryUseCase._summaryUser(userId);

        SummaryResponseDto summaryResponseDto = new SummaryResponseDto();
        summaryResponseDto.setUser(summaryResponse.getUser());
        summaryResponseDto.setTotalConsumption(BigDecimal.valueOf(summaryResponse.getTotalConsumption()));
        summaryResponseDto.setAverageConsumption(BigDecimal.valueOf(summaryResponse.getAverageConsumption()));

        return ResponseEntity.ok().body(summaryResponseDto);
    }
}
