package issuesystem.dto;

import java.io.Serializable;

public class DataTransferObject<T> implements Serializable {
    public static final String ADU = "ADU"; // Add User
    public static final String GETU = "GETU"; // Get User
    public static final String FUBL = "FUBL"; //Find User By Login
    public static final String DELU = "DELU"; // Delete User
    public static final String GETUL= " GETUL"; // get User List


    private final String processName;
    private final T object;

    public DataTransferObject(String processName, T object) {
        this.processName = processName;
        this.object = object;
    }

    public String getProcessName() {
        return processName;
    }

    public T getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "DataTransferObject{" +
                "processName='" + processName + '\'' +
                ", object=" + object +
                '}';
    }
}
