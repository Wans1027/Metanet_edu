package JDBC_Tier.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Dept {
    private int deptno;
    private String dname;
    private String loc;
}
