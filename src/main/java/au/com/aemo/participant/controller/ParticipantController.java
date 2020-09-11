package au.com.aemo.participant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import au.com.aemo.participant.model.Participant;
import au.com.aemo.participant.repository.ParticipantRepository;

@RestController
@RequestMapping("/api/v1")
public class ParticipantController {

	// 1. Define the end-point
	// 2. Inject Employee Repository using Autowire
	// 3. Define the methods using the repository's method
	
	@Autowired
	private ParticipantRepository participantRepository;
	
	// Get all participants
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/participants")
	public List<Participant> getAllPartipants() {
		return participantRepository.findAll();
	}
	//http://localhost:8085/api/v1/participants
}
