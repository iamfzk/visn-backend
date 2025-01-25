package com.visnis.in.request;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParentSystemPermissionRequest {

    private Boolean isConditions;
    private Boolean isCommissions;
    private Boolean isCreateAccount;
    private Boolean isViewReport;
    private Boolean isFullAccess;

    private Long departmentId;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
