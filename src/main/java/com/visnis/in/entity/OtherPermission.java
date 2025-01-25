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
public class OtherPermission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Boolean isSuppor;
	private Boolean isDashboard;
	private Boolean isPromoMarerial;
	private Boolean isNews;
	private Boolean isAdminPannelAccess;
	private Boolean isCreateBonus;
	private Long departmentId;

	private LocalDateTime createdDate;
	private LocalDateTime updatedDate;
}
