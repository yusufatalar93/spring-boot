package com.atalar.software.auth.model;

import com.atalar.software.user.model.Role;
import org.jetbrains.annotations.NotNull;


public record RegisterRequest(@NotNull String firstname,
                              @NotNull String lastname,
                              @NotNull String email,
                              @NotNull String password,
                              @NotNull Role role) {

}
