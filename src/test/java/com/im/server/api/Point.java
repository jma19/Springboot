package com.im.server.api;

/**
 * Created by majun on 16/3/7.
 */
public class Point {
    private double x;
    private double y;
    private String label;
    private double distance;

    public double getDistance() {
        return distance;
    }

    public Point setDistance(double distance) {
        this.distance = distance;
        return this;
    }

    public Point(double x, double y,String label) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public Point setLabel(String label) {
        this.label = label;
        return this;
    }

    public double getX() {
        return x;
    }

    public Point setX(double x) {
        this.x = x;
        return this;
    }

    public double getY() {
        return y;
    }

    public Point setY(double y) {
        this.y = y;
        return this;
    }
}
