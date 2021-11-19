package com.testao.andikaputra.bbristock.repo
import org.springframework.stereotype.Repository
import org.springframework.data.repository.CrudRepository
import com.testao.andikaputra.bbristock.model.bbrimodel

@Repository
interface bbrirepo : CrudRepository<bbrimodel, String>