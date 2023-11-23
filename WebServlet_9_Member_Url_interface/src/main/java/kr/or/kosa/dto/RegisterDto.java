package kr.or.kosa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/*
  create table mvcregister(
		 id number constraint pk_mvcregister_id primary key,
		 pwd varchar2(20) not null,
		 email varchar2(50) not null
		)
*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDto {
	private int empno;
	private String ename;
	private Date hiredate;
}
