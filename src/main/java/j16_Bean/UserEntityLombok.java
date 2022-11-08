package j16_Bean;


import lombok.*;

import java.util.Objects;

// 정보를 담는 객체를 Entity Class라 한다.
/*
    맴버변수 선언
    생성자 정의
    Getters and Setters 정의
    Equals and HashCode 정의
    toString 정의

 */
@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
public class UserEntityLombok {
    private String username;
    private String password;
    private String email;
    private String name;
}













