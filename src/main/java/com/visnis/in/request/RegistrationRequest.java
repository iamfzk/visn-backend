package com.visnis.in.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationRequest {
	private String firstName;
	private String middelName;
	private String lastName;
	private String dob;
	private String password;
	private String contry;
	private String phoneNamber;
}
