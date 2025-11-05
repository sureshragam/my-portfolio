package com.sureshragam.my_portfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sureshragam.my_portfolio.model.Certificate;
import com.sureshragam.my_portfolio.repository.CertificateRepository;

@Service
public class CertificateService {

	@Autowired
	private CertificateRepository cs;

	public List<Certificate> getCertificates() {
		return cs.findAll();
	}

	public Certificate postCertificate(Certificate certificate) {
		try {
			return cs.save(certificate);
		} catch (Exception e) {
			throw new IllegalStateException("Failed to save the certificate", e);
		}
	}

	public Certificate updateCertificate(String id, Certificate certificate) {
		return cs.findById(id).map(existingCertificate -> {
			existingCertificate.setName(certificate.getName());
			existingCertificate.setUrl(certificate.getUrl());
			existingCertificate.setAlt(certificate.getAlt());
			return cs.save(existingCertificate);
		}).orElseThrow(() -> new IllegalStateException("Certificate with id " + id + " not found"));
	}

	public void deleteCertificate(String id) {
		if (cs.existsById(id)) {
			cs.deleteById(id);
		} else {
			throw new IllegalStateException("Certificate with id " + id + " not found");
		}
	}

	// public List<Certificate> getCertificates() {
	// List<Certificate> cs = new ArrayList<>();
	// Certificate c1 = new Certificate();
	// Certificate c2 = new Certificate();
	// c1.setName("python");
	// c1.setUrl("https:// python.com");
	// c1.setAlt("python");

	// c2.setName("java");
	// c2.setUrl("https://java.com");
	// c2.setAlt("java");
	// cs.add(c1);
	// cs.add(c2);

	// return cs;

	// }

	// public String postCertificate(Certificate certificate) {

	// return "Certificate added successfully";
	// }

}
