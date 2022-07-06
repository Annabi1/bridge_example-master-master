package org.mss.bridge.to.spades.repository;

import java.util.Optional;

import org.mss.bridge.to.spades.domain.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScenarioRepository extends JpaRepository<Scenario, String> {

	void save(Optional<Scenario> scenarioCreated);

}
