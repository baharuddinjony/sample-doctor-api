package univ.savemother.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

import univ.savemother.models.DoctorApointment;
import univ.savemother.utils.Response;
import univ.savemother.utils.UrlConstants;

@RestController
@RequestMapping(UrlConstants.APOINTMENT)
public class ApointmentController {
	private static final Logger logger = LogManager.getLogger(DoctorController.class.getName());

	@PostMapping
	@ResponseBody
	public Response<JsonNode> apointDoctor(@RequestBody DoctorApointment apointment) {
		logger.info(apointment);
		return null;
	}

}
