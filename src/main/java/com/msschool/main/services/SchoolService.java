package com.msschool.main.services;

import com.msschool.main.dao.SchoolDao;
import com.msschool.main.model.domain.SchoolDomain;
import com.msschool.main.model.dto.SchoolDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;

@Service
public class SchoolService {

    @Autowired
    SchoolDao schoolDao;


}
