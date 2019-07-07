package com.example.sampleboard;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BoartdService {

	private List<String> messages = new ArrayList<>();

	public void post(String message) {
		messages.add(message);
	}

}
