package edu.mum.service;

import org.springframework.stereotype.Service;

import edu.mum.DAO.KitchenDAO;
import edu.mum.model.Kitchen;

@Service
public class KitchenService implements KitchenDAO {

	public KitchenService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public <S extends Kitchen> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Kitchen> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Kitchen findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Kitchen> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Kitchen> findAll(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Kitchen entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Iterable<? extends Kitchen> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}