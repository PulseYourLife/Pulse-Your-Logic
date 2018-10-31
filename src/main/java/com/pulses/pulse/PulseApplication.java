package com.pulses.pulse;

import com.pulses.pulse.config.AppConfiguration;
import java.io.IOException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PulseApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(PulseApplication.class, args);
                AppConfiguration app = new AppConfiguration();
	}
}
