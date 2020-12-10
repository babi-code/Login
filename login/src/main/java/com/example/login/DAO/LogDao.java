package com.example.login.DAO;

import com.example.login.Model.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogDao extends JpaRepository<Log,Integer> {
   public Log getByUserName(String userName);
}
