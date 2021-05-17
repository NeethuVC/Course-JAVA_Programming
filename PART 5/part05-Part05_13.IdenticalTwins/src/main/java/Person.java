
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals (Object compared){
        
         if (this == compared) {
            return true;
        }

        // if the object is not instance of SimpleDate, the objects are not the same
        if (!(compared instanceof Person)) {
            return false;
        }
        
        Person persion = (Person) compared;
        
        if (this.birthday.equals(persion.birthday) &&
            this.name.equals(persion.name) &&
            this.height==persion.height &&
            this.weight==persion.weight
                ) {
            return true;
        }
        if (!(compared instanceof SimpleDate)) {
            return false;
        }
        
        return false;
    }
}
