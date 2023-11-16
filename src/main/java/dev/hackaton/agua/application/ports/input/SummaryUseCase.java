package dev.hackaton.agua.application.ports.input;

import dev.hackaton.agua.domain.model.SummaryResponse;

public interface SummaryUseCase {

    SummaryResponse _summaryUser(Integer userId);
}
