package Java_Basic_02_Scope.utils;
/*
 VO, DTO, DOMAIN
 */
public class Emp {
    private int empno;
    private String ename;
    private String job;
    private int sal;
    //생성자 오버로딩
    public Emp(int empno, String ename, String job, int sal) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}
