package me.bearl.bugzillaRest;

import org.springframework.web.client.RestTemplate;
import me.bearl.bugzilla.*;

public class BugzillaRestTestMain {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		BugzillaAttachment attachment = restTemplate.getForObject("https://api-dev.bugzilla.mozilla.org/latest/attachment/235466", BugzillaAttachment.class);
		System.out.println("Test: " + attachment.getBug_ref());

	}

}
