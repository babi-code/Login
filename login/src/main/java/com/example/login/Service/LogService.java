package com.example.login.Service;

import com.example.login.DAO.LogDao;
import com.example.login.Model.Log;
import com.example.login.Validation.EmailException;
import com.example.login.Validation.LogValidation;
import com.example.login.Validation.PasswordException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {
    @Autowired
    public LogDao dao;
    @Autowired
    public LogValidation validate;

    public List<Log> getCredential() {
        return dao.findAll();
    }

    public void user(Log log) {
        String password = log.getPassword();
        String emailId = log.getEmailId();

        try{
                validate.valid(password, emailId);
                dao.save(log);
        }
        catch(EmailException e){
            System.out.println(e);

        }
        catch (PasswordException p){
            System.out.println(p);

        }

    }

    public Log getByUserName(String userName) {
        return dao.getByUserName(userName);
    }
}
