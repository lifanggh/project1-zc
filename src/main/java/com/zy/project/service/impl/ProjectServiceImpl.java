package com.zy.project.service.impl;

import com.zy.project.dao.ProjectDao;
import com.zy.project.pojo.Projects;
import com.zy.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectDao dao;


    @Override
    public List<Projects> getPro(Projects projects) {
       /* if (projects.getPst() !=null){
            if(  projects.getPst().getPst_name().equals(1)){
                projects.getPst().setPst_name("支教助学");
            }else if( projects.getPst().getPst_name().equals(2)){
                projects.getPst().setPst_name("儿童关爱");
            }

        }*/
        return dao.getPro(projects);
    }
}
