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
public class BonusesSystemPermission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Boolean isView;
	private Boolean isAdd;
	private Boolean isWithdraw;
	private Boolean isFullAccess;
	private Long departmentId;
	private LocalDateTime createdDate;
	private LocalDateTime updatedDate;
}
