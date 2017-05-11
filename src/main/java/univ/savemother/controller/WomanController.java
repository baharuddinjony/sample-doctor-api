package univ.savemother.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;

import univ.savemother.models.Woman;
import univ.savemother.repositories.WomanRepository;
import univ.savemother.utils.Response;
import univ.savemother.utils.UrlConstants;

@RestController
@RequestMapping(UrlConstants.WOMAN)
public class WomanController {
	private static final Logger logger = LogManager.getLogger(WomanController.class.getName());

	@Autowired
	private WomanRepository repository;
	@PostMapping
	@ResponseBody
	public String registerWoman(@RequestBody Woman woman) {
		logger.info(woman);
		repository.save(woman);
		return "Saved Successfully";
	}


}
