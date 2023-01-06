/*
 * Copyright (c) 2022 Ideas2it, Inc.All rights are reserved.
 * 
 * This document is protected by copyright. No part of this document may be 
 * reproduced in any form by any means without prior written authorization of 
 * Ideas2it and its licensors, if any.
 */
package com.ideas2it.onlinestore.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.ideas2it.onlinestore.util.constants.Constant;

/**
 * It is a simple JavaBean domain object representing a brand.
 *
 * @author Sangeetha Ilangovan
 * @version 1.0
 * @since 20.12.2022
 */
public class BrandDTO {

	private Long id;
	
	@NotBlank(message = Constant.BRAND_NAME_COMPULSORY)
	@Pattern(regexp= Constant.BRAND_NAME_REGEX, message = Constant.INVALID_BRAND_NAME)
	private String name;
	
	public BrandDTO() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}