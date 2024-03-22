package cn.edu.sxgkd.entity;

import java.util.List;

public class Grade {
    private List<Integer> stuNos;

    public Grade() {

    }

    public Grade(List<Integer> stuNos) {
        this.stuNos = stuNos;
    }

    public List<Integer> getStuNos() {
        return stuNos;
    }

    public void setStuNos(List<Integer> stuNos) {
        this.stuNos = stuNos;
    }
}
