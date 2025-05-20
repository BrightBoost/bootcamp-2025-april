package week7.interfaces.portfolio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Portfolio {
    private String owner;
    private String name;
    List<Valuable> valuableList = new ArrayList<>();

    public Portfolio(String owner, String name) {
        this.owner = owner;
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Valuable> getValuableList() {
        return valuableList;
    }

    public void setValuableList(List<Valuable> valuableList) {
        this.valuableList = valuableList;
    }

    public void add(Valuable valuable) {
        valuableList.add(valuable);
    }

    public double getValue() {
        double totalValue = 0;
        for(Valuable valuable : valuableList) {
            totalValue += valuable.getValue();
        }
        return totalValue;
    }

    public Valuable getMostValuable() {
        ArrayList<Valuable> valuablesCopy = new ArrayList<>();
        valuablesCopy.addAll(valuableList);

        Collections.sort(valuablesCopy);

        return valuablesCopy.getLast();
    }

    public Valuable getLeastValuable() {
        ArrayList<Valuable> valuablesCopy = new ArrayList<>();
        valuablesCopy.addAll(valuableList);

        Collections.sort(valuablesCopy);

        return valuablesCopy.getFirst();
    }

    public Valuable getLeastValuableWithLoop() {
        if(valuableList.isEmpty()) {
            return null;
        }
        Valuable leastValuable = valuableList.getFirst();
        for(Valuable valuable : valuableList) {
            if(leastValuable.getValue() > valuable.getValue()) {
                leastValuable = valuable;
            }
        }
        return leastValuable;

    }
}
