
package facades;

import Exceptions.PersonNotFoundException;
import dto.PersonDTO;
import dto.PersonsDTO;

/**
 *
 * @author Benjamin Choleva
 */
public interface IPersonFacade {

    public PersonDTO addPerson(String fName, String lName, String phone, String street, String city, int zip);

    public PersonDTO deletePerson(int id) throws PersonNotFoundException;

    public PersonDTO getPerson(int id) throws PersonNotFoundException;

    public PersonsDTO getAllPersons();

    public PersonDTO editPerson(PersonDTO p) throws PersonNotFoundException;

}
