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
public class ManagersPermission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Boolean isSetMannager;
	private Boolean isViewMannager;
	private Boolean isGetClient;
	private Boolean isCreatTask;
	private Boolean isEditTask;
	private Boolean isDeleteTask;
	private Boolean isViewTask;
	private Boolean isFullAccess;
	private Long departmentId;

	private LocalDateTime createdDate;
	private LocalDateTime updatedDate;
}
