package com.intentics.task.DAO;


import com.intentics.task.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IClientDAO extends JpaRepository<Client, Integer> {

    @Query("select b from Client b where b.first_name = :first_name and b.last_name = :last_name")
    Client findByNameSurname(@Param("first_name") String firstName, @Param("last_name") String secondName);
}
