package com.visnis.in.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.visnis.in.dao.ManagersClientInvestsPermissionRepository;
import com.visnis.in.dao.ManagersLpaPermissionRepository;
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
import com.visnis.in.request.PermissionRequest;
import com.visnis.in.response.Response;
import com.visnis.in.service.IUserPemissionService;

import jakarta.transaction.Transactional;

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
	private ManagersLpaPermissionRepository managersLpaPermissionRepo;
	private ManagersClientInvestsPermissionRepository managersClientInvestsPermissionRepo;

	@Autowired
	public UserPemissionServiceImpl(UserPermissionsRepository userPermissionsRepo,
			DepositPermissionRepository depositRepo, WithdrawalPermissionsRepository withdrawalPermissionsRepo,
			WthdrawalApprovalPermissionRepository wthdrawalApprovalPermissionRepo,
			TransferPermissionRepository transferPermissionRepo, InvestPermissionRepository investPermissionRepo,
			ParentSystemPermissionRepository parentSystemPermissionRepo,
			CommentTemplatesPermissionRepository commentTemplatesPermissionRepo,
			BonusesSystemPermissionRepository bonusesSystemPermissionRepo, StatusesRepository statusesRepo,
			LocalPaymentAgentLPARepository localPaymentAgentLPARepo, OtherPermissionRepository otherPermissionRepo,
			SalesInterfacePermissionRepository salesInterfacePermissionRepo,
			ManagersPermissionRepository managersPermissionRepo,
			ManagersClientBonusesPermissionRepository managersClientBonusesPermissionRepo,
			ManagersLpaPermissionRepository managersLpaPermissionRepo,
			ManagersClientInvestsPermissionRepository managersClientInvestsPermissionRepo) {
		super();
		this.userPermissionsRepo = userPermissionsRepo;
		this.depositRepo = depositRepo;
		this.withdrawalPermissionsRepo = withdrawalPermissionsRepo;
		this.wthdrawalApprovalPermissionRepo = wthdrawalApprovalPermissionRepo;
		this.transferPermissionRepo = transferPermissionRepo;
		this.investPermissionRepo = investPermissionRepo;
		this.parentSystemPermissionRepo = parentSystemPermissionRepo;
		this.commentTemplatesPermissionRepo = commentTemplatesPermissionRepo;
		this.bonusesSystemPermissionRepo = bonusesSystemPermissionRepo;
		this.statusesRepo = statusesRepo;
		this.localPaymentAgentLPARepo = localPaymentAgentLPARepo;
		this.otherPermissionRepo = otherPermissionRepo;
		this.salesInterfacePermissionRepo = salesInterfacePermissionRepo;
		this.managersPermissionRepo = managersPermissionRepo;
		this.managersClientBonusesPermissionRepo = managersClientBonusesPermissionRepo;
		this.managersLpaPermissionRepo = managersLpaPermissionRepo;
		this.managersClientInvestsPermissionRepo = managersClientInvestsPermissionRepo;
	}

//    -----------------------------------------Start addPemissions--------------------------------------------
	@Override
	@Transactional
	public ResponseEntity<Response> addPemissions(PermissionRequest request) {
		Response response = new Response();
		if (request == null) {
			response.setMessage("please select fields");
			response.setStatusCode("0");
			return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
		}
		if (request.getUserPermissions() != null) {
			UserPermissions userPermissionsEntity = Mapper
					.userPermissionsRequestToUserPermissions(request.getUserPermissions());
			userPermissionsRepo.save(userPermissionsEntity);
		}
		if (request.getDeposit() != null) {
			DepositPermission depositPermissionRequestToEntity = Mapper
					.depositPermissionRequestToEntity(request.getDeposit());
			depositRepo.save(depositPermissionRequestToEntity);
		}
		if (request.getWithdrawal() != null) {
			WithdrawalPermissions withdrawalPermissionsRequestToEntity = Mapper
					.withdrawalPermissionsRequestToEntity(request.getWithdrawal());
			withdrawalPermissionsRepo.save(withdrawalPermissionsRequestToEntity);
		}
		if (request.getWthdrawalApproval() != null) {
			WthdrawalApprovalPermission wthdrawalApprovalPermissionRequestToEntity = Mapper
					.wthdrawalApprovalPermissionRequestToEntity(request.getWthdrawalApproval());
			wthdrawalApprovalPermissionRepo.save(wthdrawalApprovalPermissionRequestToEntity);
		}
		if (request.getTransfer() != null) {
			TransferPermission transferPermissionRequestToEntity = Mapper
					.transferPermissionRequestToEntity(request.getTransfer());
			transferPermissionRepo.save(transferPermissionRequestToEntity);
		}
		if (request.getInvest() != null) {
			InvestPermission investPermissionRequestToEntity = Mapper
					.investPermissionRequestToEntity(request.getInvest());
			investPermissionRepo.save(investPermissionRequestToEntity);
		}
		if (request.getParentSystem() != null) {
			ParentSystemPermission parentSystemPermissionRequestToEntity = Mapper
					.parentSystemPermissionRequestToEntity(request.getParentSystem());
			parentSystemPermissionRepo.save(parentSystemPermissionRequestToEntity);
		}
		if (request.getCommentTemplates() != null) {
			CommentTemplatesPermission commentTemplatesPermissionRequestToEntity = Mapper
					.commentTemplatesPermissionRequestToEntity(request.getCommentTemplates());
			commentTemplatesPermissionRepo.save(commentTemplatesPermissionRequestToEntity);
		}
		if (request.getBonusesSystem() != null) {
			BonusesSystemPermission bonusesSystemPermissionRequestToEntity = Mapper
					.bonusesSystemPermissionRequestToEntity(request.getBonusesSystem());
			bonusesSystemPermissionRepo.save(bonusesSystemPermissionRequestToEntity);
		}
		if (request.getStatuses() != null) {
			StatusesPermission statusesPermissionRequestToEntity = Mapper
					.statusesPermissionRequestToEntity(request.getStatuses());
			statusesRepo.save(statusesPermissionRequestToEntity);
		}
		if (request.getLocalPaymentAgentLPA() != null) {
			LocalPaymentAgentLPA localPaymentAgentLPARequestToEntity = Mapper
					.localPaymentAgentLPARequestToEntity(request.getLocalPaymentAgentLPA());
			localPaymentAgentLPARepo.save(localPaymentAgentLPARequestToEntity);
		}
		if (request.getOther() != null) {
			OtherPermission otherPermissionRequestToEntity = Mapper.otherPermissionRequestToEntity(request.getOther());
			otherPermissionRepo.save(otherPermissionRequestToEntity);
		}
		if (request.getSalesInterface() != null) {
			SalesInterfacePermission salesInterfacePermissionRequestToEntity = Mapper
					.salesInterfacePermissionRequestToEntity(request.getSalesInterface());
			salesInterfacePermissionRepo.save(salesInterfacePermissionRequestToEntity);
		}
		if (request.getManagers() != null) {
			ManagersPermission managersPermissionRequestToEntity = Mapper
					.managersPermissionRequestToEntity(request.getManagers());
			managersPermissionRepo.save(managersPermissionRequestToEntity);
		}
		if (request.getAanagersClientBonuses() != null) {
			ManagersClientBonusesPermission managersClientBonusesPermissionRequestToEntity = Mapper
					.managersClientBonusesPermissionRequestToEntity(request.getAanagersClientBonuses());
			managersClientBonusesPermissionRepo.save(managersClientBonusesPermissionRequestToEntity);
		}
		if (request.getManagersClientInvests() != null) {
			ManagersClientInvestsPermission managersClientInvestsPermissionRequestToEntity = Mapper
					.managersClientInvestsPermissionRequestToEntity(request.getManagersClientInvests());
			managersClientInvestsPermissionRepo.save(managersClientInvestsPermissionRequestToEntity);
		}
		if (request.getManagersLpa() != null) {
			ManagersLpaPermission managersLpaPermissionRequestToEntity = Mapper
					.managersLpaPermissionRequestToEntity(request.getManagersLpa());
			managersLpaPermissionRepo.save(managersLpaPermissionRequestToEntity);
		}

		response.setMessage("permission added successfully");
		response.setStatusCode("1");
		return new ResponseEntity<>(response, HttpStatus.CREATED);
//	    -----------------------------------------end addPemissions--------------------------------------------

	}

	@Override
	public ResponseEntity<Response> getPemissionsByDepartmentId(Long departmentId) {
		Response response = new Response();
		ArrayList<Object> data=new ArrayList<>();
		if (departmentId == null) {
			response.setMessage("please provoid departmentId");
			response.setStatusCode("0");
			return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
		}
		

			List<UserPermissions> all = userPermissionsRepo.findAllByDepartmentId(departmentId);

			List<DepositPermission> all2 = depositRepo.findAllByDepartmentId(departmentId);
		
//		if (request.getWithdrawal() != null) {
//			WithdrawalPermissions withdrawalPermissionsRequestToEntity = Mapper
//					.withdrawalPermissionsRequestToEntity(request.getWithdrawal());
//			withdrawalPermissionsRepo.save(withdrawalPermissionsRequestToEntity);
//		}
//		if (request.getWthdrawalApproval() != null) {
//			WthdrawalApprovalPermission wthdrawalApprovalPermissionRequestToEntity = Mapper
//					.wthdrawalApprovalPermissionRequestToEntity(request.getWthdrawalApproval());
//			wthdrawalApprovalPermissionRepo.save(wthdrawalApprovalPermissionRequestToEntity);
//		}
//		if (request.getTransfer() != null) {
//			TransferPermission transferPermissionRequestToEntity = Mapper
//					.transferPermissionRequestToEntity(request.getTransfer());
//			transferPermissionRepo.save(transferPermissionRequestToEntity);
//		}
//		if (request.getInvest() != null) {
//			InvestPermission investPermissionRequestToEntity = Mapper
//					.investPermissionRequestToEntity(request.getInvest());
//			investPermissionRepo.save(investPermissionRequestToEntity);
//		}
//		if (request.getParentSystem() != null) {
//			ParentSystemPermission parentSystemPermissionRequestToEntity = Mapper
//					.parentSystemPermissionRequestToEntity(request.getParentSystem());
//			parentSystemPermissionRepo.save(parentSystemPermissionRequestToEntity);
//		}
//		if (request.getCommentTemplates() != null) {
//			CommentTemplatesPermission commentTemplatesPermissionRequestToEntity = Mapper
//					.commentTemplatesPermissionRequestToEntity(request.getCommentTemplates());
//			commentTemplatesPermissionRepo.save(commentTemplatesPermissionRequestToEntity);
//		}
//		if (request.getBonusesSystem() != null) {
//			BonusesSystemPermission bonusesSystemPermissionRequestToEntity = Mapper
//					.bonusesSystemPermissionRequestToEntity(request.getBonusesSystem());
//			bonusesSystemPermissionRepo.save(bonusesSystemPermissionRequestToEntity);
//		}
//		if (request.getStatuses() != null) {
//			StatusesPermission statusesPermissionRequestToEntity = Mapper
//					.statusesPermissionRequestToEntity(request.getStatuses());
//			statusesRepo.save(statusesPermissionRequestToEntity);
//		}
//		if (request.getLocalPaymentAgentLPA() != null) {
//			LocalPaymentAgentLPA localPaymentAgentLPARequestToEntity = Mapper
//					.localPaymentAgentLPARequestToEntity(request.getLocalPaymentAgentLPA());
//			localPaymentAgentLPARepo.save(localPaymentAgentLPARequestToEntity);
//		}
//		if (request.getOther() != null) {
//			OtherPermission otherPermissionRequestToEntity = Mapper.otherPermissionRequestToEntity(request.getOther());
//			otherPermissionRepo.save(otherPermissionRequestToEntity);
//		}
//		if (request.getSalesInterface() != null) {
//			SalesInterfacePermission salesInterfacePermissionRequestToEntity = Mapper
//					.salesInterfacePermissionRequestToEntity(request.getSalesInterface());
//			salesInterfacePermissionRepo.save(salesInterfacePermissionRequestToEntity);
//		}
//		if (request.getManagers() != null) {
//			ManagersPermission managersPermissionRequestToEntity = Mapper
//					.managersPermissionRequestToEntity(request.getManagers());
//			managersPermissionRepo.save(managersPermissionRequestToEntity);
//		}
//		if (request.getAanagersClientBonuses() != null) {
//			ManagersClientBonusesPermission managersClientBonusesPermissionRequestToEntity = Mapper
//					.managersClientBonusesPermissionRequestToEntity(request.getAanagersClientBonuses());
//			managersClientBonusesPermissionRepo.save(managersClientBonusesPermissionRequestToEntity);
//		}
//		if (request.getManagersClientInvests() != null) {
//			ManagersClientInvestsPermission managersClientInvestsPermissionRequestToEntity = Mapper
//					.managersClientInvestsPermissionRequestToEntity(request.getManagersClientInvests());
//			managersClientInvestsPermissionRepo.save(managersClientInvestsPermissionRequestToEntity);
//		}
//		if (request.getManagersLpa() != null) {
//			ManagersLpaPermission managersLpaPermissionRequestToEntity = Mapper
//					.managersLpaPermissionRequestToEntity(request.getManagersLpa());
//			managersLpaPermissionRepo.save(managersLpaPermissionRequestToEntity);
//		}

			data.add(all);
			data.add(all2);
		response.setMessage("Success");
		response.setStatusCode("1");
		response.setData(data);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
}
