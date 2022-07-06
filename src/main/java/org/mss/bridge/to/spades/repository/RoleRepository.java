package org.mss.bridge.to.spades.repository;

import java.util.Optional;

import org.mss.bridge.to.spades.domain.ERole;
import org.mss.bridge.to.spades.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository  extends JpaRepository<Role,Long>{
	Optional<Role> findByName(ERole name);
}
