package com.visnis.in.mapper;

import java.time.LocalDateTime;

import com.visnis.in.entity.BonusesSystemPermission;
import com.visnis.in.entity.CommentTemplatesPermission;
import com.visnis.in.entity.DepositPermission;
import com.visnis.in.entity.InvestPermission;
import com.visnis.in.entity.LocalPaymentAgentLPA;
import com.visnis.in.entity.ManagersClientBonusesPermission;
import com.visnis.in.entity.ManagersClientInvestsPermission;
import com.visnis.in.entity.ManagersLpaPermission;
import com.visnis.in.entity.ManagersPermission;
import com.visnis.in.entity.OtherPermission;
import com.visnis.in.entity.ParentSystemPermission;
import com.visnis.in.entity.SalesInterfacePermission;
import com.visnis.in.entity.StatusesPermission;
import com.visnis.in.entity.TransferPermission;
import com.visnis.in.entity.UserPermissions;
import com.visnis.in.entity.WithdrawalPermissions;
import com.visnis.in.entity.WthdrawalApprovalPermission;
import com.visnis.in.request.BonusesSystemPermissionRequest;
import com.visnis.in.request.CommentTemplatesPermissionRequest;
import com.visnis.in.request.DepositPermissionRequest;
import com.visnis.in.request.InvestPermissionRequest;
import com.visnis.in.request.LocalPaymentAgentLPARequest;
import com.visnis.in.request.ManagersClientBonusesPermissionRequest;
import com.visnis.in.request.ManagersClientInvestsPermissionRequest;
import com.visnis.in.request.ManagersLpaPermissionRequest;
import com.visnis.in.request.ManagersPermissionRequest;
import com.visnis.in.request.OtherPermissionRequest;
import com.visnis.in.request.ParentSystemPermissionRequest;
import com.visnis.in.request.SalesInterfacePermissionRequest;
import com.visnis.in.request.StatusesPermissionRequest;
import com.visnis.in.request.TransferPermissionRequest;
import com.visnis.in.request.UserPermissionsRequest;
import com.visnis.in.request.WithdrawalPermissionsRequest;
import com.visnis.in.request.WthdrawalApprovalPermissionRequest;

public class Mapper {

	public static UserPermissions userPermissionsRequestToUserPermissions(UserPermissionsRequest request) {
		UserPermissions userPermissions = new UserPermissions();
		userPermissions.setIsView(request.getIsView());
		userPermissions.setIsAcountAcc(request.getIsAcountAcc());
		userPermissions.setIsViewDoc(request.getIsViewDoc());
		userPermissions.setIsViewUserPhone(request.getIsViewUserPhone());
		userPermissions.setIsViewUserEmail(request.getIsViewUserEmail());
		userPermissions.setIsAction(request.getIsAction());
		userPermissions.setIsEdit(request.getIsEdit());
		userPermissions.setIsRemoveUserPhone(request.getIsRemoveUserPhone());
		userPermissions.setIsExport(request.getIsExport());
		userPermissions.setIsTags(request.getIsTags());
		userPermissions.setIsUsersNotes(request.getIsUsersNotes());
		userPermissions.setIsCards(request.getIsCards());
		userPermissions.setIsPartnership(request.getIsPartnership());
		userPermissions.setIsLoginAsUser(request.getIsLoginAsUser());
		userPermissions.setIsChangeKYC(request.getIsChangeKYC());
		userPermissions.setIsAddAccount(request.getIsAddAccount());
		userPermissions.setIsEditOrder(request.getIsEditOrder());
		userPermissions.setIsEditWalletBalance(request.getIsEditWalletBalance());
		userPermissions.setIsFullAccess(request.getIsFullAccess());
		userPermissions.setDepartmentId(request.getDepartmentId());
		userPermissions.setCreatedDate(LocalDateTime.now());
		userPermissions.setUpdatedDate(LocalDateTime.now());

		return userPermissions;
	}

	public static DepositPermission depositPermissionRequestToEntity(DepositPermissionRequest request) {
		DepositPermission depositPermission = new DepositPermission();

		depositPermission.setIsView(request.getIsView());
		depositPermission.setIsConfirm(request.getIsConfirm());
		depositPermission.setIsExecute(request.getIsExecute());
		depositPermission.setIsExport(request.getIsExport());
		depositPermission.setIsEditDepositTags(request.getIsEditDepositTags());
		depositPermission.setIsFullAccess(request.getIsFullAccess());
		depositPermission.setDepartmentId(request.getDepartmentId());
		depositPermission.setCreatedDate(LocalDateTime.now());
		depositPermission.setUpdatedDate(LocalDateTime.now());

		return depositPermission;
	}

	public static WithdrawalPermissions withdrawalPermissionsRequestToEntity(WithdrawalPermissionsRequest request) {
		WithdrawalPermissions withdrawalPermissions = new WithdrawalPermissions();
		withdrawalPermissions.setIsView(request.getIsView());
		withdrawalPermissions.setIsConfirm(request.getIsConfirm());
		withdrawalPermissions.setIsExecute(request.getIsExecute());
		withdrawalPermissions.setIsExport(request.getIsExport());
		withdrawalPermissions.setIsEditWithdrawalTags(request.getIsEditWithdrawalTags());
		withdrawalPermissions.setIsFullAccess(request.getIsFullAccess());
		withdrawalPermissions.setDepartmentId(request.getDepartmentId());

		// Set timestamps
		withdrawalPermissions.setCreatedDate(LocalDateTime.now());
		withdrawalPermissions.setUpdatedDate(LocalDateTime.now());

		return withdrawalPermissions;
	}

	public static WthdrawalApprovalPermission wthdrawalApprovalPermissionRequestToEntity(
			WthdrawalApprovalPermissionRequest request) {
		WthdrawalApprovalPermission approvalPermission = new WthdrawalApprovalPermission();

		approvalPermission.setIsView(request.getIsView());
		approvalPermission.setIsConfirm(request.getIsConfirm());
		approvalPermission.setIsConfirmInsteadOfOtherPerson(request.getIsConfirmInsteadOfOtherPerson());
		approvalPermission.setIsFullAccess(request.getIsFullAccess());
		approvalPermission.setDepartmentId(request.getDepartmentId());

		// Set timestamps
		approvalPermission.setCreatedDate(LocalDateTime.now());
		approvalPermission.setUpdatedDate(LocalDateTime.now());

		return approvalPermission;
	}

	public static TransferPermission transferPermissionRequestToEntity(TransferPermissionRequest request) {
		TransferPermission transferPermission = new TransferPermission();

		transferPermission.setIsView(request.getIsView());
		transferPermission.setIsExecute(request.getIsExecute());
		transferPermission.setIsFullAccess(request.getIsFullAccess());
		transferPermission.setDepartmentId(request.getDepartmentId());

		// Set timestamps
		transferPermission.setCreatedDate(LocalDateTime.now());
		transferPermission.setUpdatedDate(LocalDateTime.now());

		return transferPermission;
	}

	public static InvestPermission investPermissionRequestToEntity(InvestPermissionRequest request) {
		InvestPermission investPermission = new InvestPermission();

		investPermission.setIsView(request.getIsView());
		investPermission.setIsInvestStrategies(request.getIsInvestStrategies());
		investPermission.setExportInvestCRM(request.getExportInvestCRM());
		investPermission.setIsFullAccess(request.getIsFullAccess());
		investPermission.setDepartmentId(request.getDepartmentId());

		// Set timestamps
		investPermission.setCreatedDate(LocalDateTime.now());
		investPermission.setUpdatedDate(LocalDateTime.now());

		return investPermission;
	}

	public static ParentSystemPermission parentSystemPermissionRequestToEntity(ParentSystemPermissionRequest request) {
		ParentSystemPermission parentSystemPermission = new ParentSystemPermission();

		parentSystemPermission.setIsConditions(request.getIsConditions());
		parentSystemPermission.setIsCommissions(request.getIsCommissions());
		parentSystemPermission.setIsCreateAccount(request.getIsCreateAccount());
		parentSystemPermission.setIsViewReport(request.getIsViewReport());
		parentSystemPermission.setIsFullAccess(request.getIsFullAccess());
		parentSystemPermission.setDepartmentId(request.getDepartmentId());

		// Set timestamps
		parentSystemPermission
				.setCreatedDate(request.getCreatedDate() != null ? request.getCreatedDate() : LocalDateTime.now());
		parentSystemPermission
				.setUpdatedDate(request.getUpdatedDate() != null ? request.getUpdatedDate() : LocalDateTime.now());

		return parentSystemPermission;
	}

	public static CommentTemplatesPermission commentTemplatesPermissionRequestToEntity(
			CommentTemplatesPermissionRequest request) {
		CommentTemplatesPermission commentTemplatesPermission = new CommentTemplatesPermission();
		commentTemplatesPermission.setIsView(request.getIsView());
		commentTemplatesPermission.setIsEdit(request.getIsEdit());
		commentTemplatesPermission.setIsCreate(request.getIsCreate());
		commentTemplatesPermission.setIsFullAccess(request.getIsFullAccess());
		commentTemplatesPermission.setDepartmentId(request.getDepartmentId());
		commentTemplatesPermission.setCreatedDate(LocalDateTime.now());
		commentTemplatesPermission.setUpdatedDate(LocalDateTime.now());

		return commentTemplatesPermission;
	}

	public static BonusesSystemPermission bonusesSystemPermissionRequestToEntity(
			BonusesSystemPermissionRequest request) {
		BonusesSystemPermission bonusesSystemPermission = new BonusesSystemPermission();

		bonusesSystemPermission.setIsView(request.getIsView());
		bonusesSystemPermission.setIsAdd(request.getIsAdd());
		bonusesSystemPermission.setIsWithdraw(request.getIsWithdraw());
		bonusesSystemPermission.setIsFullAccess(request.getIsFullAccess());
		bonusesSystemPermission.setDepartmentId(request.getDepartmentId());
		bonusesSystemPermission.setCreatedDate(LocalDateTime.now());
		bonusesSystemPermission.setUpdatedDate(LocalDateTime.now());

		return bonusesSystemPermission;
	}

	public static StatusesPermission statusesPermissionRequestToEntity(StatusesPermissionRequest request) {
		StatusesPermission statusesPermission = new StatusesPermission();

		statusesPermission.setIsView(request.getIsView());
		statusesPermission.setIsFullAccess(request.getIsFullAccess());
		statusesPermission.setDepartmentId(request.getDepartmentId());

		// Set timestamps
		statusesPermission.setCreatedDate(LocalDateTime.now());
		statusesPermission.setUpdatedDat(LocalDateTime.now());

		return statusesPermission;
	}

	public static LocalPaymentAgentLPA localPaymentAgentLPARequestToEntity(LocalPaymentAgentLPARequest request) {
		LocalPaymentAgentLPA localPaymentAgentLPA = new LocalPaymentAgentLPA();

		localPaymentAgentLPA.setIsViewLpa(request.getIsViewLpa());
		localPaymentAgentLPA.setIsEditLpa(request.getIsEditLpa());
		localPaymentAgentLPA.setIsFullAccess(request.getIsFullAccess());
		localPaymentAgentLPA.setDepartmentId(request.getDepartmentId());
		localPaymentAgentLPA.setCreatedDate(LocalDateTime.now());
		localPaymentAgentLPA.setUpdatedDate(LocalDateTime.now());

		return localPaymentAgentLPA;
	}

	public static OtherPermission otherPermissionRequestToEntity(OtherPermissionRequest request) {
		OtherPermission otherPermission = new OtherPermission();

		otherPermission.setIsSuppor(request.getIsSuppor());
		otherPermission.setIsDashboard(request.getIsDashboard());
		otherPermission.setIsPromoMarerial(request.getIsPromoMarerial());
		otherPermission.setIsNews(request.getIsNews());
		otherPermission.setIsAdminPannelAccess(request.getIsAdminPannelAccess());
		otherPermission.setIsCreateBonus(request.getIsCreateBonus());
		otherPermission.setDepartmentId(request.getDepartmentId());
		otherPermission.setCreatedDate(LocalDateTime.now());
		otherPermission.setUpdatedDate(LocalDateTime.now());

		return otherPermission;
	}

	public static SalesInterfacePermission salesInterfacePermissionRequestToEntity(
			SalesInterfacePermissionRequest request) {
		SalesInterfacePermission salesInterfacePermission = new SalesInterfacePermission();

		salesInterfacePermission.setIsView(request.getIsView());
		salesInterfacePermission.setIsViewContactsFromManneger(request.getIsViewContactsFromManager());
		salesInterfacePermission.setDepartmentId(request.getDepartmentId());
		salesInterfacePermission.setCreatedDate(LocalDateTime.now());
		salesInterfacePermission.setUpdatedDate(LocalDateTime.now());

		return salesInterfacePermission;
	}

	public static ManagersPermission managersPermissionRequestToEntity(ManagersPermissionRequest request) {
		ManagersPermission managersPermission = new ManagersPermission();

		managersPermission.setIsSetMannager(request.getIsSetMannager());
		managersPermission.setIsViewMannager(request.getIsViewMannager());
		managersPermission.setIsGetClient(request.getIsGetClient());
		managersPermission.setIsCreatTask(request.getIsCreatTask());
		managersPermission.setIsEditTask(request.getIsEditTask());
		managersPermission.setIsDeleteTask(request.getIsDeleteTask());
		managersPermission.setIsViewTask(request.getIsViewTask());
		managersPermission.setIsFullAccess(request.getIsFullAccess());
		managersPermission.setDepartmentId(request.getDepartmentId());
		managersPermission.setCreatedDate(LocalDateTime.now());
		managersPermission.setUpdatedDate(LocalDateTime.now());

		return managersPermission;
	}

	public static ManagersClientBonusesPermission managersClientBonusesPermissionRequestToEntity(
			ManagersClientBonusesPermissionRequest request) {
		ManagersClientBonusesPermission permission = new ManagersClientBonusesPermission();

		permission.setIsViewBonus(request.getIsViewBonus());
		permission.setIsAddBonus(request.getIsAddBonus());
		permission.setIsWithdrawBonus(request.getIsWithdrawBonus());
		permission.setIsFullAccess(request.getIsFullAccess());
		permission.setDepartmentId(request.getDepartmentId());
		permission.setCreatedDate(LocalDateTime.now());
		permission.setUpdatedDate(LocalDateTime.now());

		return permission;
	}
	public static ManagersClientInvestsPermission managersClientInvestsPermissionRequestToEntity(ManagersClientInvestsPermissionRequest request) {
        if (request == null) {
            return null;
        }
        
        ManagersClientInvestsPermission permission = new ManagersClientInvestsPermission();
        
        // Mapping fields from request to entity
        permission.setIsViewInvest(request.getIsViewInvest());
        permission.setIsExportInvestCRM(request.getIsExportInvestCRM());
        permission.setIsFullAccess(request.getIsFullAccess());
        permission.setDepartmentId(request.getDepartmentId());
        permission.setCreatedDate(LocalDateTime.now()); 
        permission.setUpdatedDate(LocalDateTime.now());
        
        return permission;
    }
	public static ManagersLpaPermission managersLpaPermissionRequestToEntity(ManagersLpaPermissionRequest request) {
        if (request == null) {
            return null;
        }
        
        ManagersLpaPermission permission = new ManagersLpaPermission();
        
        // Mapping fields from request to entity
        permission.setIsViewLPA(request.getIsViewLPA());
        permission.setIsEditLPA(request.getIsEditLPA());
        permission.setIsFullAccess(request.getIsFullAccess());
        permission.setDepartmentId(request.getDepartmentId());
        permission.setCreatedDate(java.time.LocalDateTime.now()); // Assuming createdDate is set at entity creation
        permission.setUpdatedDate(java.time.LocalDateTime.now()); // Assuming updatedDate is set at entity creation
        
        return permission;
    }
}
