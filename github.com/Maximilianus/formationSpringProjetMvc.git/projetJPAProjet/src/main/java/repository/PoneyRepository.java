package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Poney;

public interface PoneyRepository extends JpaRepository<Poney, Integer> {

}
