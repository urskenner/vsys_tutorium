package ex1.part3.c;

import java.io.Serializable;

public class MySerializableClass implements Serializable {
    private static final long serialVersionUID = 1;
    private int id;
    private String string;
    private transient MyNonSerializableClass myNonSerializableClass;

    MySerializableClass() {
        id = 1234;
        this.myNonSerializableClass = new MyNonSerializableClass();
        myNonSerializableClass.toString();

    }

    public void set(String string) {
        this.string = string;
    }

    public String toString() {



        return "id: " + id + "; string: " + string + myNonSerializableClass.toString();
    }
}
