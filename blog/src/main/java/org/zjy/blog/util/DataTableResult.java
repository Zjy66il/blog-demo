package org.zjy.blog.util;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DataTableResult implements Serializable {

    private Boolean success;

    private int draw;

    private int recordsTotal;

    private int recordsFiltered;

    private String error;

    private List<?> data;
}
