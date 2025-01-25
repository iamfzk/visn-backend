package com.visnis.in.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WithdrawalPermissionsRequest {
    private Boolean isView;
    private Boolean isConfirm;
    private Boolean isExecute;
    private Boolean isExport;
    private Boolean isEditWithdrawalTags;
    private Boolean isFullAccess;
    private Long departmentId;
}
