package StackOfStrings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> container;

    // TODO: Create a constructor


    public StackOfStrings() {
        this.container = new ArrayList<>();
    }

    public void push(String item) {
        this.container.add(item);
    }

    public String pop() {

        if (!isEmpty()) {
            return this.container.remove(this.container.size() - 1);
        }
        return null;
    }

    public String peek (){
        if (!isEmpty()){
            return this.container.get(this.container.size()-1);
        }
        return null;
    }

    public boolean isEmpty() {
        return this.container.isEmpty();
    }
}
