package com.santander.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santander.models.Meet;
import com.santander.models.SaveMeetResponse;
import com.santander.models.Temperature;
import com.santander.models.TemperatureRequest;
import com.santander.repositories.MeetRepository;
import com.santander.services.MeetService;

@RestController
@RequestMapping("/api/v1")
public class MeetController {

	@Autowired
	private MeetRepository meetRepository;
	
	@Autowired
	private MeetService meetService;
	
	@GetMapping("/getMeetings")
	public List<Meet> list() {
		return meetRepository.findAll();
	}
	
	@PostMapping("/saveMeeting")
	public SaveMeetResponse create(@RequestBody Meet meet) {
		meetRepository.save(meet);
		SaveMeetResponse response = new SaveMeetResponse();
		response.setResult("ok");
		return response;
	}
	
	@PostMapping("/getTemperature")
	public Temperature getTemperature(@RequestBody TemperatureRequest request) {
		return this.meetService.geTemperature(request);
	}
	
}
