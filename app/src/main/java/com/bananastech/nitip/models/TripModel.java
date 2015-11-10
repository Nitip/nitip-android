package com.bananastech.nitip.models;

import java.util.Date;

/**
 * Created by mrlut on 10/11/2015.
 */
public final class TripModel {
    public String origin, destination;
    public long fromDate, toDate;

    public TripModel(String origin, String destination, long fromDate, long toDate) {
        this.origin = origin;
        this.destination = destination;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }
}
