package org.hxd.course03;

import java.util.*;

public class IOCCollection {

    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;
    private Properties prop;
    private String[] strs;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    public String[] getStrs() {
        return strs;
    }

    public void setStrs(String[] strs) {
        this.strs = strs;
    }

    @Override
    public String toString() {
        return "IOCCollection{" +
                "list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", prop=" + prop +
                ", strs=" + Arrays.toString(strs) +
                '}';
    }
}