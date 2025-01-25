package com.visnis.in.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPermissions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long Id;
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
	private LocalDateTime createdDate;
	private LocalDateTime updatedDate;
}
