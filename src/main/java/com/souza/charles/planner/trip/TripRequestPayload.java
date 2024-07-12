package com.souza.charles.planner.trip;
/**
 Course title: Rocketseat | NLW Journey | Java
 Instructor: Fernanda Kipper
 Example adapted by: Charles Fernandes de Souza
 Date: July 11, 2024
 */
import java.util.List;

public record TripRequestPayload(String destination, String starts_at, String ends_at, List<String> emails_to_invite, String owner_email, String owner_name ) {

}