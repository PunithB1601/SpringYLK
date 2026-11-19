package com.ecomm.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomm.app.entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

}
