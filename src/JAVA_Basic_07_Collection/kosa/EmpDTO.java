package JAVA_Basic_07_Collection.kosa;

import lombok.Data;

/*
create table Emp(
    empno int,
    ename varchar2(20)

)
 */
@Data
public class EmpDTO {
    private int empno;
    private String ename;
    private String job;
}
