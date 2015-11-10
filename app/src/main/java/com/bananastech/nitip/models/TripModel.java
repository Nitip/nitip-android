package com.bananastech.nitip.models;

import java.util.Date;

/**
 * Created by mrlut on 10/11/2015.
 */
public final class TripModel {
    public String name, origin, destination;
    public long fromDate, toDate;

    public TripModel(String origin, String destination, long fromDate, long toDate) {
        this.origin = origin;
        this.destination = destination;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public TripModel(String name, String origin, String destination, long fromDate, long toDate) {
        this.name = name;
        this.origin = origin;
        this.destination = destination;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public long getFromDate() {
        return fromDate;
    }

    public void setFromDate(long fromDate) {
        this.fromDate = fromDate;
    }

    public long getToDate() {
        return toDate;
    }

    public void setToDate(long toDate) {
        this.toDate = toDate;
    }
}
