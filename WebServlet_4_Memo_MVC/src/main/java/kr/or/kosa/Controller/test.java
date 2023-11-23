package kr.or.kosa.Controller;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class test {
    Date date = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");


}
