package com.lzh.domain;

import lombok.Data;

/**
 * Created by lizhihao on 2016/8/24.
 */

@Data
public class JobInfo {

    private int id;
    private int companyId;
    private String company;
    private int positionId;
    private String position;
    private String positionAdvantage;
    private String salary;
    private String education;
    private String positionUrl;
    private String address;


}
