package com.kunleen.sn.sportnewsapplication.network.bean;

import java.util.List;

/**
 * Created by lixingjun on 7/15/16.
 */
public class CityModel {
    private String name;
    private List<DistrictModel> districtList;

    public CityModel() {
        super();
    }

    public CityModel(String name, List<DistrictModel> districtList) {
        super();
        this.name = name;
        this.districtList = districtList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DistrictModel> getDistrictList() {
        return districtList;
    }

    public void setDistrictList(List<DistrictModel> districtList) {
        this.districtList = districtList;
    }

    @Override
    public String toString() {
        return "CityModel [name=" + name + ", districtList=" + districtList
                + "]";
    }
}
