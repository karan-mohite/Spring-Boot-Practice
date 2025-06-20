package in.sp.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.sp.main.entity.Student;
import jakarta.transaction.Transactional;


public interface StudentRepository extends JpaRepository<Student, Integer>
{
	public Student findByRollno(int rollno);
	
	@Modifying
	@Transactional
	@Query("DELETE FROM Student s WHERE s.rollno = :rollno")
	void deleteByRollno(int rollno);
}