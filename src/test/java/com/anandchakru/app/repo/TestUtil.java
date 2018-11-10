package com.anandchakru.app.repo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.test.web.servlet.MockMvc;
import com.anandchakru.app.entity.App;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestUtil {
	private static ObjectMapper json = new ObjectMapper();

	/**
	 * Save a new instance of App into DB
	 * 
	 * @param mockMvc
	 * @throws JsonProcessingException
	 * @throws Exception
	 */
	public static void createNewApp(MockMvc mockMvc, String appName) throws JsonProcessingException, Exception {
		App request = new App();
		request.setName(appName);
		mockMvc.perform(post("/repo/app").content(json.writeValueAsString(request))).andDo(print())
				.andExpect(status().isCreated());
	}
}