package com.example.webjsp_el_jstl;

import lombok.NoArgsConstructor;

public class Service {

	public static void main(String[] args) {
		Dept dept = new Dept(1000);
		dept.setDeptno(1000);
		System.out.println(dept.getDeptno());
	}

}
