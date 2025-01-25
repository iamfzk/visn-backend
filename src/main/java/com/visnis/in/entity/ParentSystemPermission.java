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
public class ParentSystemPermission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long Id;
//	start
	private Boolean isConditions;
	private Boolean isCommissions;
	private Boolean IsCreateAccount;
	private Boolean isViewReport;
	private Boolean isFullAccess;
//	end
	private Long departmentId;
	private LocalDateTime createdDate;
	private LocalDateTime updatedDate;
}
