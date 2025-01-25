package com.visnis.in.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManagersClientBonusesPermissionRequest {
    private Boolean isViewBonus;
    private Boolean isAddBonus;
    private Boolean isWithdrawBonus;
    private Boolean isFullAccess;
	private Long departmentId;

}

