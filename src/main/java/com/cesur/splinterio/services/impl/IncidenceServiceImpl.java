package com.cesur.splinterio.services.impl;

import java.util.List;
import java.time.*;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.cesur.splinterio.models.Incidence;
import com.cesur.splinterio.models.dtos.IncienceDTO;
import com.cesur.splinterio.repositories.IncidenceRepository;
import com.cesur.splinterio.services.IncidenceService;

@Service
public class IncidenceServiceImpl implements IncidenceService {

    @Autowired
    IncidenceRepository incidenceRepository;

    @Override
    public IncienceDTO getIncidencesById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidencesById'");
    }

    @Override
    public List<IncienceDTO> getIncidencesByUserName(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIncidencesByUserName'");
    }

    @Override
    public boolean storeIncidence(IncienceDTO datos) {
        Incidence incidence = new Incidence();
        incidence.setCategory(datos.getCategory());
        incidence.setDescription(datos.getDescription());
        incidence.setPriority(datos.getPriority());
        incidence.setCreatedAt(LocalDateTime.now());
        incidence.setUserCreated(null);

        Incidence response = incidenceRepository.save(incidence);
        if(response == null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void deleteIncidence(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteIncidence'");
    }

}
