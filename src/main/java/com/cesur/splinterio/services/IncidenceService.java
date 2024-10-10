package com.cesur.splinterio.services;
import com.cesur.splinterio.models.dtos.IncienceDTO;

import java.util.List;

public interface IncidenceService {
    IncienceDTO getIncidencesById(Long id);
    List<IncienceDTO> getIncidencesByUserName(String username);
    boolean storeIncidence(IncienceDTO datos);
    void deleteIncidence(Long id);
}
