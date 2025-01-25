package com.visnis.in.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferPermissionRequest {
    private Boolean isView;
    private Boolean isExecute;
    private Boolean isFullAccess;
    private Long departmentId;
}
