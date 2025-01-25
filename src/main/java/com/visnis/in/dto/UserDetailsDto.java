package com.visnis.in.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailsDto {

	private Long id;
	private String firstName;
	private String middelName;
	private String lastName;
	private LocalDate dob;
	private String password;
	private String contry;
	private String phoneNamber;
	private String status;
	private LocalDateTime createdDate;
	private LocalDateTime updatedDate;
}
