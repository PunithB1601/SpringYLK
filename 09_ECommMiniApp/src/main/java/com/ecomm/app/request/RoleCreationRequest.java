package com.ecomm.app.request;

import com.ecomm.app.enums.RoleName;

import lombok.Data;

@Data
public class RoleCreationRequest {

	private RoleName roleName;
}
