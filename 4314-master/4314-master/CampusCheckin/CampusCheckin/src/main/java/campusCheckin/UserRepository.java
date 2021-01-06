package campusCheckin;

import org.springframework.data.jpa.repository.JpaRepository;

/* this interface extends Spring Data JPA's JpaRepository specifying the domain type as Employee and the id type as Long
* empty block currently supports creating new instances, updating existing ones, deleting and finding (one, all, by simple or complex properties)
*/
interface UserRepository extends JpaRepository<User, Long> {

}

