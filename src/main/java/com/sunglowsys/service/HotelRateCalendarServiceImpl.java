package com.sunglowsys.service;

import com.sunglowsys.domain.HotelRateCalendar;
import com.sunglowsys.repository.HotelRateCalendarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelRateCalendarServiceImpl implements HotelRateCalendarService {

    private final HotelRateCalendarRepository hotelRateCalendarRepository;

    public HotelRateCalendarServiceImpl(HotelRateCalendarRepository hotelRateCalendarRepository) {
        this.hotelRateCalendarRepository = hotelRateCalendarRepository;
    }

    @Override
    public HotelRateCalendar save(HotelRateCalendar hotelRateCalendar) {
        return hotelRateCalendarRepository.save(hotelRateCalendar);
    }

    @Override
    public HotelRateCalendar update(HotelRateCalendar hotelRateCalendar, Long id) {
            HotelRateCalendar hotelRateCalendar1 = hotelRateCalendarRepository.findById(id).get();
            hotelRateCalendar1.setSingle_occupancy(hotelRateCalendar.getSingle_occupancy());
            hotelRateCalendar1.setDouble_occupancy(hotelRateCalendar.getDouble_occupancy());
            hotelRateCalendar1.setExtra_adult_price(hotelRateCalendar.getExtra_adult_price());
            hotelRateCalendar1.setExtra_child_price(hotelRateCalendar.getExtra_child_price());
            hotelRateCalendar1.setApplicable_days(hotelRateCalendar.getApplicable_days());
            hotelRateCalendar1.setHotel_id(hotelRateCalendar.getHotel_id());
            hotelRateCalendar1.setHotel_room_rate_id(hotelRateCalendar.getHotel_room_rate_id());
            return hotelRateCalendar1;
    }

    @Override
    public HotelRateCalendar findById(Long id) {
        Optional<HotelRateCalendar> optional = hotelRateCalendarRepository.findById(id);
        HotelRateCalendar hotelRateCalendar = null;
        if(optional.isPresent()){
            hotelRateCalendar = optional.get();
        }
        else{
            throw new RuntimeException("HotelRateCalendar not found for Id  : " + id);
        }
        return hotelRateCalendar;
    }

    @Override
    public List<HotelRateCalendar> findAll() {
        return hotelRateCalendarRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        hotelRateCalendarRepository.deleteById(id);
    }
}
