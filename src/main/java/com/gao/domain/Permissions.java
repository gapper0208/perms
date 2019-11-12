package com.gao.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Permissions implements Serializable {
    private Integer pid;

    private String pname;

    private Integer parentId;

    private Set<Permissions> children = new HashSet<>();

    private Set<Roles> roles = new HashSet<>();

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Set<Permissions> getChildren() {
        return children;
    }

    public void setChildren(Set<Permissions> children) {
        this.children = children;
    }

    public Set<Roles> getRoles() {
        return roles;
    }

    public void setRoles(Set<Roles> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Permissions{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}