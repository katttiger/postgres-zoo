package se.iths.cecilia.postrgreszoo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.iths.cecilia.postrgreszoo.model.Lion;

public interface LionRepository extends JpaRepository<Long, Lion> {
}
