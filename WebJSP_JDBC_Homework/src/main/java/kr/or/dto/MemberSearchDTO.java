package kr.or.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MemberSearchDTO {
    private String id;
    private String mname;
    private String email;
}
