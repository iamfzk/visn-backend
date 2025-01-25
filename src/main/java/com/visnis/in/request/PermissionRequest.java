package com.visnis.in.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PermissionRequest {
	private UserPermissionsRequest  userPermissions;
	private DepositPermissionRequest deposit;
	private WithdrawalPermissionsRequest  withdrawal;
	private WthdrawalApprovalPermissionRequest wthdrawalApproval;
	private TransferPermissionRequest transfer;
	private InvestPermissionRequest invest;
	private ParentSystemPermissionRequest parentSystem;
	private CommentTemplatesPermissionRequest commentTemplates; 
	private BonusesSystemPermissionRequest bonusesSystem;
	private StatusesPermissionRequest statuses;
	private LocalPaymentAgentLPARequest localPaymentAgentLPA;
	private OtherPermissionRequest other;
	private SalesInterfacePermissionRequest  salesInterface;
	private ManagersPermissionRequest managers;
	
	
	
	
	private ManagersClientBonusesPermissionRequest aanagersClientBonuses;
	private ManagersLpaPermissionRequest managersLpa;
}
