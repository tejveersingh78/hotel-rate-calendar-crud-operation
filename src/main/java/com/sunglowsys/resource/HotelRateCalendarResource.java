package com.sunglowsys.resource;

import com.sunglowsys.domain.HotelRateCalendar;
import com.sunglowsys.service.HotelRateCalendarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.sound.midi.MidiDevice;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelRateCalendarResource {

    private final HotelRateCalendarService hotelRateCalendarService;

    public HotelRateCalendarResource(HotelRateCalendarService hotelRateCalendarService) {
        this.hotelRateCalendarService = hotelRateCalendarService;
    }

    @PostMapping("/hotel-rate-calendars")
    public ResponseEntity<?> createHotelRateCalendar(@RequestBody HotelRateCalendar hotelRateCalendar){
        HotelRateCalendar result = hotelRateCalendarService.save(hotelRateCalendar);
        return ResponseEntity.ok().body("HotelRateCalendar is created successfully : " + result);
    }

    @PutMapping("/hotel-rate-calendars/{id}")
    public ResponseEntity<HotelRateCalendar> updateHotelRateCalendar(@RequestBody HotelRateCalendar hotelRateCalendar ,@PathVariable("id") Long id){
        HotelRateCalendar result = hotelRateCalendarService.update(hotelRateCalendar,id);
        return ResponseEntity.ok().body(result);
    }

    @GetMapping("/hotel-rate-calendars")
    public List<HotelRateCalendar> getHotelRateCalendar(){
        List<HotelRateCalendar> result = hotelRateCalendarService.findAll();
        return result;
    }

    @GetMapping("/hotel-rate-calendars/{id}")
    public ResponseEntity<?> getHotelRateCalendarById(@PathVariable("id") Long id){
        HotelRateCalendar result = hotelRateCalendarService.findById(id);
        return ResponseEntity.ok().body(result);
    }

    @DeleteMapping("/hotel-rate-calendars/{id}")
    public ResponseEntity<?> deleteHotelRateCalendar(@PathVariable("id") Long id){
        hotelRateCalendarService.delete(id);
        return ResponseEntity.ok().body("HotelRateCalendar is deleted successfully on this Id : " + id);
    }
}
