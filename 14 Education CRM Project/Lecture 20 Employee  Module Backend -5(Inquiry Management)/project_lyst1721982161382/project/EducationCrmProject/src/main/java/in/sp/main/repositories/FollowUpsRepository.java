package in.sp.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sp.main.entities.FollowUps;
import java.util.Optional;


@Repository
public interface FollowUpsRepository extends JpaRepository<FollowUps, Long>
{
	Optional<FollowUps> findByPhoneno(String phoneno);
}