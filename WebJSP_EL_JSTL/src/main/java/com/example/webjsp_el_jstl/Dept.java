package com.example.webjsp_el_jstl;

import lombok.Data;

@Data
public class Dept {
	private int deptno;

	public Dept(int deptno) {
		this.deptno = deptno;
	}
}
