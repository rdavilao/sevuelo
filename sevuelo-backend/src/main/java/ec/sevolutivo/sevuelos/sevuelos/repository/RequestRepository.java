package ec.sevolutivo.sevuelos.sevuelos.repository;

import ec.sevolutivo.sevuelos.sevuelos.domain.Request;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Spring Data SQL repository for the Request entity.
 */
@SuppressWarnings("unused")
@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {

    List<Request> findAllByDestination(String destination);

}
