package com.visnis.in.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BonusesSystemPermissionDTO {
    private Long id;
    private Boolean isView;
    private Boolean isAdd;
    private Boolean isWithdraw;
    private Boolean isFullAccess;
    private Long departmentId;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
