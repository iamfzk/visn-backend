package com.visnis.in.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.visnis.in.Mapper;
import com.visnis.in.dao.BonusesSystemPermissionRepository;
import com.visnis.in.dao.CommentTemplatesPermissionRepository;
import com.visnis.in.dao.DepositPermissionRepository;
import com.visnis.in.dao.InvestPermissionRepository;
import com.visnis.in.dao.LocalPaymentAgentLPARepository;
import com.visnis.in.dao.ManagersClientBonusesPermissionRepository;
import com.visnis.in.dao.ManagersPermissionRepository;
import com.visnis.in.dao.OtherPermissionRepository;
import com.visnis.in.dao.ParentSystemPermissionRepository;
import com.visnis.in.dao.SalesInterfacePermissionRepository;
import com.visnis.in.dao.StatusesRepository;
import com.visnis.in.dao.TransferPermissionRepository;
import com.visnis.in.dao.UserPermissionsRepository;
import com.visnis.in.dao.WithdrawalPermissionsRepository;
import com.visnis.in.dao.WthdrawalApprovalPermissionRepository;
import com.visnis.in.entity.BonusesSystemPermission;
import com.visnis.in.entity.CommentTemplatesPermission;
import com.visnis.in.entity.DepositPermission;
import com.visnis.in.entity.InvestPermission;
import com.visnis.in.entity.LocalPaymentAgentLPA;
import com.visnis.in.entity.ManagersClientBonusesPermission;
import com.visnis.in.entity.ManagersPermission;
import com.visnis.in.entity.OtherPermission;
import com.visnis.in.entity.ParentSystemPermission;
import com.visnis.in.entity.SalesInterfacePermission;
import com.visnis.in.entity.StatusesPermission;
import com.visnis.in.entity.TransferPermission;
import com.visnis.in.entity.UserPermissions;
import com.visnis.in.entity.WithdrawalPermissions;
import com.visnis.in.entity.WthdrawalApprovalPermission;
import com.visnis.in.request.PermissionRequest;
import com.visnis.in.response.Response;
import com.visnis.in.service.IUserPemissionService;

@Service
public class UserPemissionServiceImpl implements IUserPemissionService {

	private UserPermissionsRepository userPermissionsRepo;
	private DepositPermissionRepository depositRepo;
	private WithdrawalPermissionsRepository withdrawalPermissionsRepo;
	private WthdrawalApprovalPermissionRepository wthdrawalApprovalPermissionRepo;
	private TransferPermissionRepository transferPermissionRepo;
	private InvestPermissionRepository investPermissionRepo;
	private ParentSystemPermissionRepository parentSystemPermissionRepo;
	private CommentTemplatesPermissionRepository commentTemplatesPermissionRepo;
	private BonusesSystemPermissionRepository bonusesSystemPermissionRepo;
	private StatusesRepository statusesRepo;
	private LocalPaymentAgentLPARepository localPaymentAgentLPARepo;
	private OtherPermissionRepository otherPermissionRepo;
	private SalesInterfacePermissionRepository salesInterfacePermissionRepo;
	private ManagersPermissionRepository managersPermissionRepo;
	private ManagersClientBonusesPermissionRepository managersClientBonusesPermissionRepo;

//    -----------------------------------------Start addPemissions--------------------------------------------
	@Override
	public ResponseEntity<Response> addPemissions(PermissionRequest request) {
		Response response = new Response();
		if (request == null) {
			response.setMessage("please select fields");
			response.setStatusCode("0");
			return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
		}

		UserPermissions userPermissionsEntity = Mapper
				.userPermissionsRequestToUserPermissions(request.getUserPermissions());
		userPermissionsRepo.save(userPermissionsEntity);
		DepositPermission depositPermissionRequestToEntity = Mapper
				.depositPermissionRequestToEntity(request.getDeposit());
		depositRepo.save(depositPermissionRequestToEntity);
		WithdrawalPermissions withdrawalPermissionsRequestToEntity = Mapper
				.withdrawalPermissionsRequestToEntity(request.getWithdrawal());
		withdrawalPermissionsRepo.save(withdrawalPermissionsRequestToEntity);
		WthdrawalApprovalPermission wthdrawalApprovalPermissionRequestToEntity = Mapper
				.wthdrawalApprovalPermissionRequestToEntity(request.getWthdrawalApproval());
		wthdrawalApprovalPermissionRepo.save(wthdrawalApprovalPermissionRequestToEntity);
		TransferPermission transferPermissionRequestToEntity = Mapper
				.transferPermissionRequestToEntity(request.getTransfer());
		transferPermissionRepo.save(transferPermissionRequestToEntity);
		InvestPermission investPermissionRequestToEntity = Mapper.investPermissionRequestToEntity(request.getInvest());
		investPermissionRepo.save(investPermissionRequestToEntity);
		ParentSystemPermission parentSystemPermissionRequestToEntity = Mapper
				.parentSystemPermissionRequestToEntity(request.getParentSystem());
		parentSystemPermissionRepo.save(parentSystemPermissionRequestToEntity);
		CommentTemplatesPermission commentTemplatesPermissionRequestToEntity = Mapper
				.commentTemplatesPermissionRequestToEntity(request.getCommentTemplates());
		commentTemplatesPermissionRepo.save(commentTemplatesPermissionRequestToEntity);
		BonusesSystemPermission bonusesSystemPermissionRequestToEntity = Mapper
				.bonusesSystemPermissionRequestToEntity(request.getBonusesSystem());
		bonusesSystemPermissionRepo.save(bonusesSystemPermissionRequestToEntity);
		StatusesPermission statusesPermissionRequestToEntity = Mapper
				.statusesPermissionRequestToEntity(request.getStatuses());
		statusesRepo.save(statusesPermissionRequestToEntity);
		LocalPaymentAgentLPA localPaymentAgentLPARequestToEntity = Mapper
				.localPaymentAgentLPARequestToEntity(request.getLocalPaymentAgentLPA());
		localPaymentAgentLPARepo.save(localPaymentAgentLPARequestToEntity);
		OtherPermission otherPermissionRequestToEntity = Mapper.otherPermissionRequestToEntity(request.getOther());
		otherPermissionRepo.save(otherPermissionRequestToEntity);
		SalesInterfacePermission salesInterfacePermissionRequestToEntity = Mapper
				.salesInterfacePermissionRequestToEntity(request.getSalesInterface());
		salesInterfacePermissionRepo.save(salesInterfacePermissionRequestToEntity);
		ManagersPermission managersPermissionRequestToEntity = Mapper
				.managersPermissionRequestToEntity(request.getManagers());
		managersPermissionRepo.save(managersPermissionRequestToEntity);
		ManagersClientBonusesPermission managersClientBonusesPermissionRequestToEntity = Mapper.managersClientBonusesPermissionRequestToEntity(request.getAanagersClientBonuses());
		managersClientBonusesPermissionRepo.save(managersClientBonusesPermissionRequestToEntity);
		return null;
//	    -----------------------------------------end addPemissions--------------------------------------------

	}
}
