package com.example.qwartz_scheduler.payload;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Ответ после планирования email")
public class EmailResponse {

    @Schema(description = "Успешность операции", example = "true")
    private boolean success;

    @Schema(description = "ID задания", example = "job-uuid")
    private String jobId;

    @Schema(description = "Группа задания", example = "email-jobs")
    private String jobGroup;

    @Schema(description = "Сообщение результата", example = "Email Scheduled Successfully")
    private String message;

    public EmailResponse (boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public EmailResponse(boolean success, String jobId, String jobGroup, String message) {
        this.success = success;
        this.jobId = jobId;
        this.jobGroup = jobGroup;
        this.message = message;
    }
}
