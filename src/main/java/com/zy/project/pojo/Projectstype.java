package com.zy.project.pojo;

import java.util.Date;

public class Projectstype {
    private  Integer pst_id;
    private String pst_name;
    private String pst_desc;
    private Date pst_stardate;
    private Integer pst_type;

    public Integer getPst_id() {
        return pst_id;
    }

    public void setPst_id(Integer pst_id) {
        this.pst_id = pst_id;
    }

    public String getPst_name() {
        return pst_name;
    }

    public void setPst_name(String pst_name) {
        this.pst_name = pst_name;
    }

    public String getPst_desc() {
        return pst_desc;
    }

    public void setPst_desc(String pst_desc) {
        this.pst_desc = pst_desc;
    }

    public Date getPst_stardate() {
        return pst_stardate;
    }

    public void setPst_stardate(Date pst_stardate) {
        this.pst_stardate = pst_stardate;
    }

    public Integer getPst_type() {
        return pst_type;
    }

    public void setPst_type(Integer pst_type) {
        this.pst_type = pst_type;
    }
}
