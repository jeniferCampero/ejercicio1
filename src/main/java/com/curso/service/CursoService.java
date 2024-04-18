package com.curso.service;

import java.util.List;

import com.curso.model.Curso;

public interface CursoService {

	List<Curso> cursos();
	Curso buscarCurso(int codCurso);
	List<Curso> crearCurso(Curso curso);
	void actualizarDuracion(int codCurso, int duracion);
	Curso buscarPrecio(int precio);
	List<Curso> eliminarCurso(int codCurso);
}
