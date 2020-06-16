package com.pakistan.jkutil.model;

import org.json.JSONObject;

import java.io.Serializable;

public class Parcel implements Serializable {
    private JSONObject jsonObject;

    public Parcel() {
        jsonObject = new JSONObject();
    }

    public Parcel(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

}
