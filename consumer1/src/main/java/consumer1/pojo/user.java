package consumer1.pojo;

import java.io.Serializable;


public class user implements Serializable {

    String id;
    public user(){}
    public user(String id)
    {
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "user{" +
                "id='" + id + '\'' +
                '}';
    }
}
