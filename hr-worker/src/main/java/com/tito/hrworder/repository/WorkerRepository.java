package com.tito.hrworder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tito.hrworder.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
