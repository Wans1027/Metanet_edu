package com.example.jsp;

import lombok.Data;

@Data
public class Emp {
    public int empno;
    public String ename;

    public Emp() {
        this.empno = 1111;
        this.ename = "sdlksn";
    }
}
