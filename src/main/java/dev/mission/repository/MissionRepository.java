package dev.mission.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import dev.mission.entite.Mission;

public interface MissionRepository extends JpaRepository<Mission, Integer> {

	@Query("select * from Mission m where m.date_debut >= curdate()")
	List<Mission> listerProchainesMissions();

}
