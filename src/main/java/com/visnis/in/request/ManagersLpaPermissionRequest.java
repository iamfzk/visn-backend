package com.visnis.in.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManagersLpaPermissionRequest {
    private String departmentName;
    private String departmentTitle;
}

