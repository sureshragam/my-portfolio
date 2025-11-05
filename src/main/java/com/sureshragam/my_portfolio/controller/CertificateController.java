package com.sureshragam.my_portfolio.controller;

import com.sureshragam.my_portfolio.model.Certificate;
import com.sureshragam.my_portfolio.service.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class CertificateController {

	@Autowired
	CertificateService cs;

	@GetMapping("/certificates")
	public List<Certificate> getCertificates() {
		System.out.println("triggered endpoint");
		return cs.getCertificates();
	}

	@PostMapping("/certificate")
	public Certificate addCertificate(@RequestBody Certificate certificate) {
		return cs.postCertificate(certificate);
	}
}
