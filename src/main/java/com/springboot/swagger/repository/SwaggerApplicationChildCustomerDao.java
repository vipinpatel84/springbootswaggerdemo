package com.springboot.swagger.repository;

import com.springboot.swagger.entity.ChildCustomerEntity;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface SwaggerApplicationChildCustomerDao extends CrudRepository<ChildCustomerEntity, String> {
}
