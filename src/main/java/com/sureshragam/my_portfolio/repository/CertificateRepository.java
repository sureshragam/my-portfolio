package com.sureshragam.my_portfolio.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sureshragam.my_portfolio.model.Certificate;

@Repository
public interface CertificateRepository extends MongoRepository<Certificate, String> {
    // public List<Certificate> getCertificates();

    // public String postCertificate(Certificate certificate);

    // public String updateCerttificate(String id, Certificate certificate);

    // public void deleteCertificate(String id);

}
