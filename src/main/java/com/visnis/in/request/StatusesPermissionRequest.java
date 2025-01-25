package com.visnis.in.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatusesPermissionRequest {

    private Boolean isView;
    private Boolean isFullAccess;
    private Long departmentId;
}
