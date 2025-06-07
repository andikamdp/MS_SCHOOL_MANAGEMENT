package com.msschool.main.dao;

import com.msschool.main.dao.daointerface.SimpleDao;
import com.msschool.main.dao.repository.SchoolRepo;
import com.msschool.main.model.domain.SchoolDomain;
import com.msschool.main.model.dto.SchoolDto;
import com.msschool.main.model.entity.SchoolModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class SchoolDao implements SimpleDao<SchoolDomain, String> {


    @Autowired
    SchoolRepo schoolRepo;


    @Override
    public String create(SchoolDomain data) {
        return "";
    }

    @Override
    public SchoolDomain read(String id) {
        return null;
    }

    @Override
    public List<SchoolDomain> read() {
        return List.of();
    }

    @Override
    public String update(SchoolDomain data) {
        return "";
    }

    @Override
    public void delete(String id) {

    }
}
