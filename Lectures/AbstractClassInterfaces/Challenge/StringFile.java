package Lectures.AbstractClassInterfaces.Challenge;

import java.util.ArrayList;
import java.util.List;

public class StringFile implements ISaveable {

    private List<String> stringList = new ArrayList<>();


    @Override
    public void write(List<String> list) {
        if (!list.isEmpty())
            this.stringList.addAll(list);
    }

    @Override
    public List<String> read() {
        return this.stringList;
    }

    @Override
    public String toString() {
        String compiledList = "";
        for (String string:stringList) {
            compiledList = compiledList.concat(string).concat(" ");
        }
        return compiledList;
    }
}
