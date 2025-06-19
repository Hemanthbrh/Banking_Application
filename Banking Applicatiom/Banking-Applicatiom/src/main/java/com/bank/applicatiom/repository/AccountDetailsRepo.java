package com.bank.applicatiom.repository;


import com.bank.applicatiom.entity.AccountDetailsForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountDetailsRepo extends JpaRepository<AccountDetailsForm,Long>{
}
