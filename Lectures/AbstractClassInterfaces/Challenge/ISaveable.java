package Lectures.AbstractClassInterfaces.Challenge;

import java.util.List;

public interface ISaveable {

    void write(List<String> list);
    List<String> read();

}
