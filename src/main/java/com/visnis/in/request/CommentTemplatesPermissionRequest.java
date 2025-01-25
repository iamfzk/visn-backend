package com.visnis.in.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentTemplatesPermissionRequest {
    private Boolean isView;
    private Boolean isEdit;
    private Boolean isCreate;
    private Boolean isFullAccess;
    private Long departmentId;
}
