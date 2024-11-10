package com.atalar.software.user.service;

import com.atalar.software.user.model.ChangePasswordRequest;
import org.jetbrains.annotations.NotNull;

import java.security.Principal;

public interface UserService {
    void changePassword(@NotNull ChangePasswordRequest request, @NotNull Principal connectedUser);
}
