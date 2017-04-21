package univ.savemother.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

import univ.savemother.models.Woman;
import univ.savemother.utils.Response;
import univ.savemother.utils.UrlConstants;

@RestController
@RequestMapping(UrlConstants.WOMAN)
public class WomanController {
	private static final Logger logger = LogManager.getLogger(WomanController.class.getName());

	@PostMapping
	@ResponseBody
	public Response<JsonNode> registerWoman(@RequestBody Woman woman) {
		logger.info(woman);
		return null;
	}


}
