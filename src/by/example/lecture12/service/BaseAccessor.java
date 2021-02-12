package by.example.lecture12.service;

import by.example.lecture12.domain.Accessor;
import by.example.lecture12.domain.Resource;
import by.example.lecture12.domain.ResourceType;
import by.example.lecture12.exception.MaxWaitTimeIsExceededException;
import by.example.lecture12.exception.NotAcceptableResourceTypeException;
import by.example.lecture12.storage.Storage;
import by.example.lecture12.util.GenerationUtil;

public abstract class BaseAccessor implements Accessor {

    protected ResourceType acceptableResourceType;

    protected BaseAccessor(ResourceType acceptableResourceType) {
        this.acceptableResourceType = acceptableResourceType;
    }

    @Override
    public Resource getResource(String name) throws NotAcceptableResourceTypeException {
        Resource resource = Storage.getResourceByName(name);
        if (!resource.getType().equals(acceptableResourceType)) {
            throw new NotAcceptableResourceTypeException(resource.getType(), acceptableResourceType);
        }
        return resource;
    }

    @Override
    public boolean saveResource(Resource resource) {
        int estimatedSaveTime = GenerationUtil.generateSaveTime();
        if (resource.getPing() < estimatedSaveTime) {
            // retry
            estimatedSaveTime = GenerationUtil.generateSaveTime();
            if (resource.getPing() < estimatedSaveTime) {
                throw new MaxWaitTimeIsExceededException();
            }
        }
        Storage.saveResource(resource);
        return true;
    }

}
