package Ecommercefpt.Controller;

import Ecommercefpt.Model.Model;
import Ecommercefpt.entities.Entity;

public class Controller<T extends Entity<?>> {
    private Model<T> model;
    public Controller(Model<T> model){
        this.model = model;
    }
    public void addEntity(T entity) {
        model.create(entity);
    }
    public Model<T> getModel() {
        return model;
    }

    public void setModel(Model<T> model) {
        this.model = model;
    }


}
