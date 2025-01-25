package com.visnis.in.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BonusesSystemPermissionRequest {
    private Boolean isView;
    private Boolean isAdd;
    private Boolean isWithdraw;
    private Boolean isFullAccess;
    private Long departmentId;
}