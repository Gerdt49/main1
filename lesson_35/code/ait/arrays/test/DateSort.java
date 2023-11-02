package ait.arrays.test;

import java.util.Objects;

public class DateSort implements Comparable<DateSort> {
   private String date;

    public DateSort(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DateSort{");
        sb.append("date='").append(date).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        DateSort dateSort = (DateSort) object;

        return Objects.equals(date, dateSort.date);
    }

    @Override
    public int hashCode() {
        return date != null ? date.hashCode() : 0;
    }

    @Override
    public int compareTo(DateSort o) {
        return 0;
    }
}
