
package com.visnis.in.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesInterfacePermissionRequest {

    private Boolean isView;
    private Boolean isViewContactsFromManager;
    private Long departmentId;

}
