package com.atalar.software.user.model;


import org.jetbrains.annotations.NotNull;

public record ChangePasswordRequest(@NotNull String currentPassword,
                                    @NotNull String newPassword,
                                    @NotNull String confirmationPassword) {
}
