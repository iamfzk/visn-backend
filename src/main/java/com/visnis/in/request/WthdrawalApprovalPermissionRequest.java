package com.visnis.in.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WthdrawalApprovalPermissionRequest {
    private Boolean isView;
    private Boolean isConfirm;
    private Boolean isConfirmInsteadOfOtherPerson;
    private Boolean isFullAccess;
    private Long departmentId;
}
