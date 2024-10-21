package com.cesur.splinterio.models.utils.mappers;

import java.time.LocalDateTime;

import com.cesur.splinterio.models.User;
import com.cesur.splinterio.models.dtos.UserDTO;
import com.cesur.splinterio.models.dtos.UserDTOWOP;

public class UserMapper {
    public static UserDTO userToDTO(User user){
        UserDTO response = new UserDTO();
        if(user != null){
            response.setId(user.getId());
            response.setName(user.getName());
            response.setEmail(user.getEmail());
            response.setRol(user.getRol());
            response.setActive(user.getActive());
            response.setPassword(user.getPassword());
            response.setLastConnection(user.getLastConnection());
        }
        return response;
    }
    public static UserDTOWOP userToDtoWOP(User user){
        UserDTOWOP response;
        if(user != null){
            response = new UserDTOWOP(
                user.getId(), 
                user.getName(),
                user.getEmail(),
                user.getRol(),
                user.getActive(),
                user.getLastConnection()
            );
        }else {
            response = new UserDTOWOP();
        }
        return response;
    }
    public static User dtoToUserCreated(UserDTO user){
        User response = new User();
        if(user != null){
            response.setId(user.getId());
            response.setName(user.getName());
            response.setEmail(user.getEmail());
            response.setPassword(user.getPassword());
            response.setRol(user.getRol());
            
            response.setActive(user.getActive());
            // response.setDeletedAt();
            // response.setUpdateAt();
            // response.setLastConnection();
            if(user.getCreatedAt() == null){
                response.setCreatedAt(LocalDateTime.now());
            } else {
                response.setCreatedAt(user.getCreatedAt());
                if (user.getDeleteAt() != null){
                    response.setDeletedAt(user.getDeleteAt());
                } else if(user.getUpdatedAt() != null ){

                }
            }

        } 
        return response;
    }


}
