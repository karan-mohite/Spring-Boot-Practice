package in.sp.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sp.main.entities.Inquiry;

@Repository
public interface InquiryRepository extends JpaRepository<Inquiry, Long> 
{

}
