package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import model.User;

public interface UserRepository extends JpaRepository<User, Integer>
{
	@Query("select u from User u where u.nom = :p1 and u.mdp = :p2")
	User findByIdAndMdp(@Param("p1") String nom, @Param("p2") String mdp);
}
