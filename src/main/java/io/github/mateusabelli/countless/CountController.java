package io.github.mateusabelli.countless;

import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/count")
	public Count count() {
		String date = new Date().toString();
		return new Count(counter.incrementAndGet(), date);
	}
}
