package com.example.appweatherforcast30112021.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wind {

@SerializedName("speed")
@Expose
private Double speed;

public Double getSpeed() {
return speed;
}

public void setSpeed(Double speed) {
this.speed = speed;
}

}