package by.example.lecture12.service;

import by.example.lecture12.domain.Resource;
import by.example.lecture12.domain.ResourceType;

public class NetworkAccessor extends BaseAccessor {

    protected NetworkAccessor() {
        super(ResourceType.NETWORK);
    }

    @Override
    public boolean saveResource(Resource resource) {
        System.out.println("NETWORK ACCESSOR");
        return super.saveResource(resource);
    }

    @Override
    public void establishConnection(Resource resource) {
        System.out.println("TRYING TO ACCESS URL");
    }

}
