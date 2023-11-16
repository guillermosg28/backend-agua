package dev.hackaton.agua.domain.service;

import dev.hackaton.agua.application.ports.input.SummaryUseCase;
import dev.hackaton.agua.domain.model.SummaryResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class SummaryService implements SummaryUseCase {
    @Override
    public SummaryResponse _summaryUser(Integer userId) {

        SummaryResponse summaryResponse = SummaryResponse.builder()
                .user("User")
                .totalConsumption(100.00)
                .averageConsumption(50.00)
                .build();
        return summaryResponse;
    }
}
