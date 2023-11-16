package dev.hackaton.agua.domain.service;

import dev.hackaton.agua.application.ports.input.EventUseCase;
import dev.hackaton.agua.domain.model.EventRequest;
import dev.hackaton.agua.domain.model.SuccessResponse;
import dev.hackaton.agua.infrastructure.adapters.output.persistence.entity.ActivityEntity;
import dev.hackaton.agua.infrastructure.adapters.output.persistence.entity.UserActivitiesEntity;
import dev.hackaton.agua.infrastructure.adapters.output.persistence.entity.UserEntity;
import dev.hackaton.agua.infrastructure.adapters.output.persistence.repository.ActivityRepository;
import dev.hackaton.agua.infrastructure.adapters.output.persistence.repository.UserActivityRepository;
import dev.hackaton.agua.infrastructure.adapters.output.persistence.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class EventService implements EventUseCase {


    private final String SHOWER = "DUCHA";

    private final String BATHROOM = "INODORO";

    private final String WASHING_MACHINE = "LAVADORA";

    @Autowired
    private ActivityRepository activityRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserActivityRepository userActivityRepository;



    @Override
    public SuccessResponse createEvent(EventRequest eventRequest) {

        Optional<ActivityEntity> activityEntity = activityRepository.findById(eventRequest.getActivity().longValue());

        if(activityEntity.isEmpty()) {
            SuccessResponse successResponse = new SuccessResponse();
            successResponse.setCode("404");
            successResponse.setMessage("Actividad no valida.");
            return successResponse;
        }

        Optional<UserEntity> userEntity = userRepository.findById(eventRequest.getUser().longValue());

        if(userEntity.isEmpty()) {
            SuccessResponse successResponse = new SuccessResponse();
            successResponse.setCode("404");
            successResponse.setMessage("Usuario no enconterado.");
            return successResponse;
        }

//        try {
//            eventTime = new LocalDateTime(eventRequest.getTime());
//        } catch (
//            SuccessResponse successResponse = new SuccessResponse();
//            successResponse.setCode("000");
//            successResponse.setMessage("Evento creado correctamente");
//            return successResponse;
//        )

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateFormatter = LocalDateTime.now();

        UserActivitiesEntity userActivitiesEntity = new UserActivitiesEntity();
//        userActivitiesEntity.setActivityEntity(activityEntity.get());
        userActivitiesEntity.setUser(userEntity.get());
        userActivitiesEntity.setCreationTime(dateFormatter);
        userActivitiesEntity.setConsumption(eventRequest.getConsumption());

        SuccessResponse successResponse = new SuccessResponse();
        successResponse.setCode("201");
        successResponse.setMessage("Evento creado correctamente");
        return successResponse;
    }
}
