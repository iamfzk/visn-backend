package com.visnis.in.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OtherPermissionRequest {
    private Boolean isSuppor;
    private Boolean isDashboard;
    private Boolean isPromoMarerial;
    private Boolean isNews;
    private Boolean isAdminPannelAccess;
    private Boolean isCreateBonus;
    private Long departmentId;
}
