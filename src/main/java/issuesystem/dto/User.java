package issuesystem.dto;

import lombok.*;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;


@Value
@Builder
@Data
public class User implements Serializable {

    private static AtomicInteger atomicInteger = new AtomicInteger(0);
    private Integer id = atomicInteger.getAndIncrement();
    private String name;
    private String surname;
    private Integer age;
    private String address;
    private String city;
    private String login;
    @Setter(AccessLevel.PROTECTED)
    private String password;
    private LocalDateTime insertDate;
    private LocalDateTime modifyDate;
    private LocalDateTime passwordExpireDate;
    private int status;


    public static User.UserBuilder builder(){return new User.UserBuilder();}

    @Override
    public String toString() {
        return "User{" +
                "ID: '" + id + '\'' +
                ", Name: '" + name + '\'' +
                ", Surname: '" + surname + '\'' +
                ", Age: " + age +
                ", Address: '" + address + '\'' +
                ", City: '" + city + '\'' +
                ", Login: '" + login + '\'' +
                ", Creation Date: " + insertDate +
                ", Modification Date: " + modifyDate +
                ", Password Expiration Date: " + passwordExpireDate +
                ", Status: " + status +
                '}';
    }

}


