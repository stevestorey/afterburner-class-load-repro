package com.github.stevestorey.test.afterburnerbug;

import java.util.LinkedHashSet;
import java.util.Set;

public class MyDataObject {

    private Long id;
    private String name;
    private Set<MyChild> children = new LinkedHashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<MyChild> getChildren() {
        return children;
    }
}
