package com.gao.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Roles implements Serializable {
    private Integer rid;

    private String rname;

    private Set<Permissions> permissions = new HashSet<>();

    private Set<Users> users = new HashSet<>();

    private static final long serialVersionUID = 1L;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public Set<Permissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permissions> permissions) {
        this.permissions = permissions;
    }

    public Set<Users> getUsers() {
        return users;
    }

    public void setUsers(Set<Users> users) {
        this.users = users;
    }
}