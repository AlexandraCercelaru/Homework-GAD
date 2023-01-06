package main;

import java.io.Serializable;

public class Athlete implements Serializable {
    private int number;
    private String name;
    private String countryCode;
    private String skiTimeResult;
    private String firstShoot;
    private String secondShoot;
    private String thirdShoot;

    public Athlete(int number, String name, String country, String result, String first, String second, String third) {
        this.number = number;
        this.name = name;
        this.countryCode = country;
        this.skiTimeResult = result;
        this.firstShoot = first;
        this.secondShoot = second;
        this.thirdShoot = third;
    }

    public int getResult() {
        int countMisses = count();
        int time;
        time = toSeconds(this.skiTimeResult);
        time = time + countMisses * 10;
        return time;
    }

    public String getResultInMins() {
        int time = getResult();
        int mins = time / 60;
        int secs = time % 60;
        return mins + ":" + secs;
    }

    public static int toSeconds(String s) {
        String[] time = s.split(":");
        int mins = Integer.parseInt(time[0]);
        int sec = Integer.parseInt(time[1]);
        return (mins * 60 + sec);
    }

    public String getAthleteName() {
        return name;
    }


    public int count() {
        int count = 0;
        char[] var;
        String total = this.firstShoot + this.secondShoot + this.thirdShoot;
        var = total.toCharArray();
        for (int i = 0; i < 15; i++) {
            if (var[i] == 'o') {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return number + ", " + name + ", " + countryCode + ", " + skiTimeResult + ", misses = " + count() + ", " + firstShoot + ", " + secondShoot + ", " + thirdShoot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Athlete that = (Athlete) o;
        if (number != that.number) return false;
        return firstShoot != null ? firstShoot.equals(that.firstShoot) : that.firstShoot == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + number;
        return result;
    }
}