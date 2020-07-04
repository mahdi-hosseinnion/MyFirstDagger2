package com.example.myfirstdagger2;

import java.sql.Timestamp;

import javax.inject.Inject;

public class Wheels {
    private Rims mRims;
    private Tires mTire;

    public Wheels(Rims mRims, Tires mTire) {
        this.mRims = mRims;
        this.mTire = mTire;
    }

}
