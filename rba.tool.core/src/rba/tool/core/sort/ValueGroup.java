package rba.tool.core.sort;

import java.util.ArrayList;
import java.util.Collection;

public class ValueGroup<T> {
    private String name;

    private Collection<T> member;

    public ValueGroup(String name) {
        this.name = name;
        member = new ArrayList<T>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(T e) {
        member.add(e);
    }

    public void remove(T e) {
        member.remove(e);
    }

    public Collection<T> getMember() {
        return member;
    }
}
