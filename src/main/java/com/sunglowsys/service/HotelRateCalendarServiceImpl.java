package com.sunglowsys.service;

import com.sunglowsys.domain.HotelRateCalendar;
import com.sunglowsys.repository.HotelRateCalendarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class HotelRateCalendarServiceImpl implements HotelRateCalendarService {

    private final Logger log = LoggerFactory.getLogger(HotelRateCalendarServiceImpl.class);

    private final HotelRateCalendarRepository hotelRateCalendarRepository;

    public HotelRateCalendarServiceImpl(HotelRateCalendarRepository hotelRateCalendarRepository) {
        this.hotelRateCalendarRepository = hotelRateCalendarRepository;
    }

    @Override
    public HotelRateCalendar save(HotelRateCalendar hotelRateCalendar) {
        log.debug("Request to save HotelRateCalendar : {} ",hotelRateCalendar);
        return hotelRateCalendarRepository.save(hotelRateCalendar);
    }

    @Override
    public HotelRateCalendar update(HotelRateCalendar hotelRateCalendar) {
        log.debug("Request to update HotelRateCalendar : {} ",hotelRateCalendar);
        return hotelRateCalendarRepository.save(hotelRateCalendar);

    }

    @Override
    public Optional<HotelRateCalendar> findById(Long id) {
        log.debug("Request to find HotelRateCalendarById : {} ",id);
        return hotelRateCalendarRepository.findById(id);

    }

    @Override
    public Page<HotelRateCalendar> findAll(Pageable pageable) {
        log.debug("Request to find HotelRateCalendar : {} ",pageable.toString());
        return hotelRateCalendarRepository.findAll(pageable);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete HotelRateCalendar : {} ",id);
        hotelRateCalendarRepository.deleteById(id);
    }
}
