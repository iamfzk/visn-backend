package com.visnis.in.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPermissionsRequest {
    private Boolean isView;
    private Boolean isAcountAcc;
    private Boolean isViewDoc;
    private Boolean isViewUserPhone;
    private Boolean isViewUserEmail;
    private Boolean isAction;
    private Boolean isEdit;
    private Boolean isRemoveUserPhone;
    private Boolean isExport;
    private Boolean isTags;
    private Boolean isUsersNotes;
    private Boolean isCards;
    private Boolean isPartnership;
    private Boolean isLoginAsUser;
    private Boolean isChangeKYC;
    private Boolean isAddAccount;
    private Boolean isEditOrder;
    private Boolean isEditWalletBalance;
    private Boolean isFullAccess;
    private Long departmentId;
}
