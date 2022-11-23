package com.example.springliquibasetestcontainersstartermysql.repository;

import com.example.springliquibasetestcontainersstartermysql.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long> {
}
