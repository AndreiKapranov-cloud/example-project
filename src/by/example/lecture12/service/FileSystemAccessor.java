package by.example.lecture12.service;

import by.example.lecture12.domain.Resource;
import by.example.lecture12.domain.ResourceType;

public class FileSystemAccessor extends BaseAccessor {

    public FileSystemAccessor() {
        super(ResourceType.FILE_SYSTEM);
    }

    @Override
    public boolean saveResource(Resource resource) {
        System.out.println("FILE SYSTEM ACCESSOR");
        return super.saveResource(resource);
    }

    @Override
    public void establishConnection(Resource resource) {
        throw new UnsupportedOperationException("Establishing Connection is not available for File System.");
    }

}
