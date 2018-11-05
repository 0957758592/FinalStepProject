package org.danit.luckyfit.dao;

import org.danit.luckyfit.entity.Lead;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {
  List<Lead> findLeadsByContact_Id(Long id);
}
