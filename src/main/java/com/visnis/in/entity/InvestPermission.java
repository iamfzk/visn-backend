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
public class InvestPermission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private Boolean isView;
	private Boolean isInvestStrategies;
	private Boolean ExportInvestCRM;
	private Boolean isFullAccess;
	private Long departmentId;
	private LocalDateTime createdDate;
	private LocalDateTime updatedDate;
//user id ToDo
}
