package com.PerScholas_restcontroller.Controller;


	import java.util.Map;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RestController;
	import com.PerScholas_restcontroller.models.automobiles;
	import com.fasterxml.jackson.core.JsonProcessingException;
	import com.fasterxml.jackson.databind.ObjectMapper;
	
	@RestController
	public class HomeController {
		
		private Map<Integer, automobiles> autoMap;
		private ObjectMapper  mapper;
		
		@Autowired
		public HomeController(Map<Integer, automobiles> autoMap, 
				ObjectMapper mapper) {
			this.mapper = mapper;
			this.autoMap = autoMap;
		}
		
		@GetMapping(value = "/", produces = "text/html")
		public String showStringMessage() {
			return "<h1 style='color: red;'>Hello from @RestController!</h1>";
		}
		@GetMapping("/auto/{id}")
		public String getStudent(@PathVariable Integer id) throws JsonProcessingException {
			/* The ObjectMapper class is part of the Jackson library which 
			 * provides the ability to read and write JSON either to or from 
			 * POJOs or to or from a JSON Tree Model. In this case we will write a 
			 * JSON string from a Student object and return it as part of the HTTP 
			 * response. You can read more about ObjectMapper at the following 
			 * website: https://fasterxml.github.io/jackson-databind/javadoc/2.7/com
	                 * /fasterxml/jackson/databind/ObjectMapper.html */
			
			if (autoMap.get(id) != null) {
				automobiles auto = autoMap.get(id);
				/* The student properties are returned to the client (e.g., browser) 
				 * as a JSON string. */
				return mapper.writeValueAsString(auto);
			} 
			// The error String is returned to the web client
			return "Vehicle ID not found";
		}
		
//		@GetMapping("/getAllMember")
//		public String getAllMembers() throws JsonProcessingException {
//			return mapper.writeValueAsString(this.memberMap);
//		}
	}


