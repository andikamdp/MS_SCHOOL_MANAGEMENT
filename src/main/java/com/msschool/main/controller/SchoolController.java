package com.msschool.main.controller;

import com.msschool.main.model.domain.SchoolDomain;
import com.msschool.main.model.dto.SchoolDto;
import com.msschool.main.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@RequestMapping("/school/v1")
public class SchoolController {

    @Autowired
    SchoolService schoolService;


}
