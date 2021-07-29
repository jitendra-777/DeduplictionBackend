package com.jocota.DeDuplication.Dedupliction.repository;

import com.jocota.DeDuplication.Dedupliction.entities.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDetails , Integer> {

    @Query("select c from CustomerDetails c where c.name like %?1% and c.panNumber like %?2 and c.aadharNumber like %?3 and c.DOB like %?4")
    public List<CustomerDetails> getCustomerDetails(String name, String panNumber , String aadharNumber , String DOB);

}
