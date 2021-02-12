package by.example.lecture12.service;

import by.example.lecture12.domain.Resource;
import by.example.lecture12.domain.ResourceType;

public class DatabaseAccessor extends BaseAccessor {

    protected DatabaseAccessor() {
        super(ResourceType.DATABASE);
    }

    @Override
    public boolean saveResource(Resource resource) {
        System.out.println("DATABASE ACCESSOR");
        return super.saveResource(resource);
    }

    @Override
    public void establishConnection(Resource resource) {
        System.out.println("TRYING TO ACCESS DATABASE");
    }

}
