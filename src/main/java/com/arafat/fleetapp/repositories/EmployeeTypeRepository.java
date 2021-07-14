package com.arafat.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arafat.fleetapp.models.Client;

public interface EmployeeTypeRepository extends JpaRepository<Client, Integer> {

}
