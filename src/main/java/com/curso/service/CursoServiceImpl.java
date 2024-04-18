package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.CursoDao;
import com.curso.model.Curso;

@Service
public class CursoServiceImpl implements CursoService {
	
	@Autowired
	CursoDao cursoDao;

	@Override
	public List<Curso> cursos() {
		return cursoDao.findAll();
	}

	@Override
	public Curso buscarCurso(int codCurso) {
		return cursoDao.findById(codCurso).orElse(null);
	}

	@Override
	public List<Curso> crearCurso(Curso curso) {
		cursoDao.save(curso);
		return cursoDao.findAll();
	}

	@Override
	public void actualizarDuracion(int codCurso, int duracion) {
		Curso curso = cursoDao.findById(codCurso).orElse(null);
		if(curso != null) {
			curso.setDuracion(duracion);
			cursoDao.save(curso);
		}		
	}

	@Override
	public Curso buscarPrecio(int precio) {
		return cursoDao.findByPrecio(precio);
		
	}

	@Override
	public List<Curso> eliminarCurso(int codCurso) {
		cursoDao.deleteById(codCurso);
		return cursoDao.findAll();
	}
	
	

}
