package com.souza.charles.planner.activity;
/**
 Course title: Rocketseat | NLW Journey | Java
 Instructor: Fernanda Kipper
 Example adapted by: Charles Fernandes de Souza
 Date: July 11, 2024
 */

import java.time.LocalDateTime;
import java.util.UUID;

public record ActivityData(UUID id, String title, LocalDateTime occursAt) {

}