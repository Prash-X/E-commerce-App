package dev.prashant.UserService.mapper;

import dev.prashant.UserService.dto.UserDto;
import dev.prashant.UserService.model.User;

public class UserEntityDTOMapper {
    public static UserDto getUserDTOFromUserEntity(User user){
        UserDto userDto = new UserDto();
        userDto.setEmail(user.getEmail());
        userDto.setRoles(user.getRoles());
        return userDto;
    }
}
