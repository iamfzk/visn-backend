package com.visnis.in.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvestPermissionRequest {
    private Boolean isView;
    private Boolean isInvestStrategies;
    private Boolean ExportInvestCRM;
    private Boolean isFullAccess;
    private Long departmentId;
}
