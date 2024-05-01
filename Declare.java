package CollectionTesting;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Declare {
    private Integer id;
    private String name;
    private Integer age;
    private String[] subjects;
}
