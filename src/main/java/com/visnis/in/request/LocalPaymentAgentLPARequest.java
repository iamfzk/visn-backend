package com.visnis.in.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocalPaymentAgentLPARequest {
    private Boolean isViewLpa;
    private Boolean isEditLpa;
    private Boolean isFullAccess;
    private Long departmentId;
}
