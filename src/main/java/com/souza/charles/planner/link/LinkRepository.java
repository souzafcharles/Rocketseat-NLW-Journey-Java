package com.souza.charles.planner.link;
/**
 Course title: Rocketseat | NLW Journey | Java
 Instructor: Fernanda Kipper
 Example adapted by: Charles Fernandes de Souza
 Date: July 11, 2024
 */

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, UUID>{
    public List<Link> findByTripId(UUID tripId);

}