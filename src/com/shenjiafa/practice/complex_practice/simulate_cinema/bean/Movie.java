package com.shenjiafa.practice.complex_practice.simulate_cinema.bean;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Function: Movie bean class
 *
 * @author ShenJiaFa
 * @since 2022/4/10
 */
public class Movie {

    /**
     * Movie name
     */
    private String name;

    /**
     * Movie actor
     */
    private String actor;

    /**
     * Movie score
     */
    private double score;

    /**
     * Movie duration
     */
    private double duration;

    /**
     * Movie price
     */
    private double price;

    /**
     * Movie remainder
     */
    private int remainder;

    /**
     * Movie Play start time
     */
    private Date startTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRemainder() {
        return remainder;
    }

    public void setRemainder(int remainder) {
        this.remainder = remainder;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Movie(String name, String actor, double duration, double price, int remainder, Date startTime) {
        this.name = name;
        this.actor = actor;
        this.duration = duration;
        this.price = price;
        this.remainder = remainder;
        this.startTime = startTime;
    }

    public Movie() {
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", actor='" + actor + '\'' +
                ", score=" + score +
                ", duration=" + duration +
                ", price=" + price +
                ", remainder=" + remainder +
                ", startTime=" + startTime +
                '}';
    }
}
