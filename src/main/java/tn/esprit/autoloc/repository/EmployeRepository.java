package tn.esprit.autoloc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.doamin.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
