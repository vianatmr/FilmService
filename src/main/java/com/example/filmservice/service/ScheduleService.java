package com.example.filmservice.service;

import com.example.filmservice.dto.ScheduleRequest;
import com.example.filmservice.dto.ScheduleResponse;


import java.util.List;

public interface ScheduleService {
    ScheduleResponse addSchedule(ScheduleRequest scheduleRequest);
    List<ScheduleResponse> searchFilmSchedule(Integer film_code);
}
