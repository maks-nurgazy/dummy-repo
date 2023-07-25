package kg.ctechnology.kogito.loan.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {

    private String firstName;
    private String lastName;
    private String middleName;
    private String dateOfBirth;
    private String tin;
    private String docNumber;
    private Integer customerNumber;
}
