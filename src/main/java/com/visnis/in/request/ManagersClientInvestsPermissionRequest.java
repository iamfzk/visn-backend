package com.visnis.in.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManagersClientInvestsPermissionRequest {
    private Boolean isViewInvest;
    private Boolean isExportInvestCRM;
    private Boolean isFullAccess;
}
