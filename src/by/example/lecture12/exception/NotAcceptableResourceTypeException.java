package by.example.lecture12.exception;

import by.example.lecture12.domain.ResourceType;

public class NotAcceptableResourceTypeException extends Exception {

    private static final String MESSAGE_TEMPLATE = "Resource Type '%s' is not acceptable" +
            " by the Accessor with Resource Type '%s'";

    public NotAcceptableResourceTypeException() {
        super("Resource Type is not acceptable by the accessor");
    }

    public NotAcceptableResourceTypeException(ResourceType resourceType, ResourceType accessorResourceType) {
        super(String.format(MESSAGE_TEMPLATE, resourceType.getValue(), accessorResourceType.getValue()));
    }
}
