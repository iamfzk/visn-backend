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
public class ManagersClientsPermission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
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

	private LocalDateTime createdDate;
	private LocalDateTime updatedDate;

}
