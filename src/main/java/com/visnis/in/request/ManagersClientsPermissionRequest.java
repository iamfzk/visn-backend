package com.visnis.in.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManagersClientsPermissionRequest {
    private Boolean isView;
    private Boolean isViewUserEmail;
    private Boolean isViewUserPhone;
    private Boolean isAcountAcc;
    private Boolean isAction;
    private Boolean isEdit;
    private Boolean isTags;
    private Boolean isUsersNotes;
    private Boolean isCards;
    private Boolean isLoginAsUser;
    private Boolean isDashboard;
    private Boolean isFullAccess;
    private Long departmentId;
}
