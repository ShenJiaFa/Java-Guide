package com.shenjiafa.practice.complex_practice.simulate_race.model.road;

/**
 * Function: Road model
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class Road {
    /**
     * Flat road length
     */
    private double flatLen;

    /**
     * Sand road length
     */
    private double sandLen;

    /**
     * Mountain road length
     */
    private double mountainLen;

    public double getFlatLen() {
        return flatLen;
    }

    public void setFlatLen(double flatLen) {
        this.flatLen = flatLen;
    }

    public double getSandLen() {
        return sandLen;
    }

    public void setSandLen(double sandLen) {
        this.sandLen = sandLen;
    }

    public double getMountainLen() {
        return mountainLen;
    }

    public void setMountainLen(double mountainLen) {
        this.mountainLen = mountainLen;
    }

    public Road(double flatLen, double sandLen, double mountainLen) {
        this.flatLen = flatLen;
        this.sandLen = sandLen;
        this.mountainLen = mountainLen;
    }

    public Road() {
    }

    @Override
    public String toString() {
        return "Road{" +
                "flatLen=" + flatLen +
                ", sandLen=" + sandLen +
                ", mountainLen=" + mountainLen +
                '}';
    }

}
