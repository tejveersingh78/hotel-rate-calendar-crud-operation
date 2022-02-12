package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hotel_rate_calendar_1")
public class HotelRateCalendar {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private Integer single_occupancy;
        private Integer double_occupancy;
        private Integer extra_adult_price;
        private Integer extra_child_price;
        private Integer applicable_days;
        private Integer hotel_id;
        private Integer hotel_room_rate_id;

    public HotelRateCalendar() {
        System.out.println("Hotel Rate Calendar object is created :");
    }

    public HotelRateCalendar(Long id, Integer single_occupancy, Integer double_occupancy, Integer extra_adult_price, Integer extra_child_price, Integer applicable_days, Integer hotel_id, Integer hotel_room_rate_id) {
        this.id = id;
        this.single_occupancy = single_occupancy;
        this.double_occupancy = double_occupancy;
        this.extra_adult_price = extra_adult_price;
        this.extra_child_price = extra_child_price;
        this.applicable_days = applicable_days;
        this.hotel_id = hotel_id;
        this.hotel_room_rate_id = hotel_room_rate_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSingle_occupancy() {
        return single_occupancy;
    }

    public void setSingle_occupancy(Integer single_occupancy) {
        this.single_occupancy = single_occupancy;
    }

    public Integer getDouble_occupancy() {
        return double_occupancy;
    }

    public void setDouble_occupancy(Integer double_occupancy) {
        this.double_occupancy = double_occupancy;
    }

    public Integer getExtra_adult_price() {
        return extra_adult_price;
    }

    public void setExtra_adult_price(Integer extra_adult_price) {
        this.extra_adult_price = extra_adult_price;
    }

    public Integer getExtra_child_price() {
        return extra_child_price;
    }

    public void setExtra_child_price(Integer extra_child_price) {
        this.extra_child_price = extra_child_price;
    }

    public Integer getApplicable_days() {
        return applicable_days;
    }

    public void setApplicable_days(Integer applicable_days) {
        this.applicable_days = applicable_days;
    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Integer getHotel_room_rate_id() {
        return hotel_room_rate_id;
    }

    public void setHotel_room_rate_id(Integer hotel_room_rate_id) {
        this.hotel_room_rate_id = hotel_room_rate_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelRateCalendar that = (HotelRateCalendar) o;
        return Objects.equals(id, that.id) && Objects.equals(single_occupancy, that.single_occupancy) && Objects.equals(double_occupancy, that.double_occupancy) && Objects.equals(extra_adult_price, that.extra_adult_price) && Objects.equals(extra_child_price, that.extra_child_price) && Objects.equals(applicable_days, that.applicable_days) && Objects.equals(hotel_id, that.hotel_id) && Objects.equals(hotel_room_rate_id, that.hotel_room_rate_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, single_occupancy, double_occupancy, extra_adult_price, extra_child_price, applicable_days, hotel_id, hotel_room_rate_id);
    }

    @Override
    public String toString() {
        return "HotelRateCalendar{" +
                "id=" + id +
                ", single_occupancy=" + single_occupancy +
                ", double_occupancy=" + double_occupancy +
                ", extra_adult_price=" + extra_adult_price +
                ", extra_child_price=" + extra_child_price +
                ", applicable_days=" + applicable_days +
                ", hotel_id=" + hotel_id +
                ", hotel_room_rate_id=" + hotel_room_rate_id +
                '}';
    }
}
