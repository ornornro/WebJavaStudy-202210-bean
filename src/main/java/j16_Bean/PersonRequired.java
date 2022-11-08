package j16_Bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
public class PersonRequired {
    private final String name;              // 맴버변수에 final을 선언하면 필수값이 된다.
    private int age;
}
