package com.taotao.common;

import java.io.Serializable;

/**
 * @description:
 * @author: Will.Guo
 * @create: 2018-08-19 02:35
 **/
public class EasyUITreeNode implements Serializable {
    private int id;
    private String text;
    private String state = "open(closed)";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
