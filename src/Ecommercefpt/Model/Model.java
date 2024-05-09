package Ecommercefpt.Model;

import Ecommercefpt.entities.Entity;

import java.util.ArrayList;
import java.util.List;

public class Model<T extends Entity<?>> {
    private List<T> entities = new ArrayList<>();

    private void addEntity(T entity){
        entities.add(entity);
    }

    public List<T> getEntities() {
        return entities;
    }

    public void setEntities(List<T> entities) {
        this.entities = entities;
    }


}
