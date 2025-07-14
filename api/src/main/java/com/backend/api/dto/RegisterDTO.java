package com.backend.api.dto;

import com.backend.api.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {

}
