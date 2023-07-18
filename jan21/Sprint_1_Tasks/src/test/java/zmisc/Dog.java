package zmisc;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.testng.annotations.DataProvider;
@Data
@AllArgsConstructor
public class Dog {

    private String breed;
    private int age;
}
