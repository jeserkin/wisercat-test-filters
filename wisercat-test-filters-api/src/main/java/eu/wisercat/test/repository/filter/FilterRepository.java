package eu.wisercat.test.repository.filter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FilterRepository extends JpaRepository<Filter, Long> {

    Optional<Filter> findById(long filterId);
}
