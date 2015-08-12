package com.pengyan.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HomeDao {
	public JdbcTemplate jdbcTemplate;
}
