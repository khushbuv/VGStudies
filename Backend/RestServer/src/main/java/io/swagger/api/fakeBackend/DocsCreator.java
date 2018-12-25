package io.swagger.api.fakeBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import io.swagger.api.service.FileStorageService;

@Component
public class DocsCreator {
	
	@Autowired
	private FileStorageService service;
	
	public  Resource getDoc() {
		Resource resource = service.loadFileAsResource("D:\\git_repo\\Backend\\RestServer\\src\\main\\resources\\cat.jpg");
		return resource;
	
	}
}
