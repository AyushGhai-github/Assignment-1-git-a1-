package com.washerDetails.Repository.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carDetails.model.WashPack;
import com.washerDetails.Repository.washerRepository;
import com.washerDetails.model.Washers;

@Service
public class washerServiceImpl implements washerService {
	@Autowired
	private washerRepository repo;

	@Override
	p