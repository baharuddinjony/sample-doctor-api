package univ.savemother.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

import univ.savemother.models.Doctor;
import univ.savemother.utils.Response;
import univ.savemother.utils.UrlConstants;

@RestController
@RequestMapping(UrlConstants.DOCTOR)
public class DoctorController {

	private static final Logger logger = LogManager.getLogger(DoctorController.class.getName());

	@PostMapping
	@ResponseBody
	public Response<JsonNode> registerDoctor(@RequestBody Doctor doctor) {
		logger.info(doctor);
		return null;
	}
	@GetMapping
	@ResponseBody
	public Response<JsonNode> searchDoctor(@RequestParam(value="name", defaultValue="") String name) {
		logger.info(name);
		return null;
	}
}
