package com.visnis.in.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManagersPermissionRequest {
    private Boolean isSetMannager;
    private Boolean isViewMannager;
    private Boolean isGetClient;
    private Boolean isCreatTask;
    private Boolean isEditTask;
    private Boolean isDeleteTask;
    private Boolean isViewTask;
    private Boolean isFullAccess;
    private Long departmentId;
}
