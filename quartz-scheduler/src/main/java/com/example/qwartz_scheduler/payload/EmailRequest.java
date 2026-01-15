package com.example.qwartz_scheduler.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.ZoneId;

@Setter
@Getter
@Schema(description = "Запрос для планирования отправки email")
public class EmailRequest {

    @Email
    @NotEmpty
    @Schema(description = "Адрес получателя", example = "user@example.com")
    private String email;

    @NotEmpty
    @Schema(description = "Тема письма", example = "Важное уведомление")
    private String subject;

    @NotEmpty
    @Schema(description = "Текст письма", example = "Привет! Это запланированное письмо.")
    private String body;

    @NotNull
    @Schema(description = "Дата и время отправки", example = "2025-04-20T12:00:00")
    private LocalDateTime dateTime;

    @NotNull
    @Schema(description = "Часовой пояс", example = "Asia/Almaty")
    private ZoneId timeZone;


}
