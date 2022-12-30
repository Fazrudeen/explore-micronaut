package explore.micronaut.model;


import lombok.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Data
@Entity
@Table(name = "users")
public class Users implements Serializable {

    @Id
    @Column(name = "lan_id", nullable = false, updatable = false)
    private String  id;

    @Column(name = "first_name")
    private String  firstName;

    @Column(name = "last_name")
    private String  lastName;

    @Column(name = "email_address")
    private String  emailAddress;

    @Column(name = "address_line1")
    private String  addressLine1;

    @Column(name = "address_line2")
    private String  addressLine2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String  state;

    @Column(name = "zipcode")
    private Integer  zipcode;

    @Column(name = "mail_stop")
    private String  mailStop;

    @Column(name = "default_location")
    private String  location;

}