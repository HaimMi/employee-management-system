package server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.model.EmployeeCar;

@Repository
public interface EmployeeCarRepository extends JpaRepository<EmployeeCar, Integer> {
}
