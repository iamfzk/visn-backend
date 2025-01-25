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
public class CommentTemplatesPermission {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long Id;
//	start
	private Boolean isView;
	private Boolean isEdit;
	private Boolean isCreate;
	private Boolean isFullAccess;
//	end
	private Long departmentId;
	private LocalDateTime createdDate;
	private LocalDateTime updatedDate;
}
