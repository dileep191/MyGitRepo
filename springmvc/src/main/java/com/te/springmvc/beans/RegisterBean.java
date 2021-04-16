package com.te.springmvc.beans;

import java.io.Serializable;

import lombok.Data;

@Data
public class RegisterBean implements Serializable {

	private String fname;

	private String email;
}
