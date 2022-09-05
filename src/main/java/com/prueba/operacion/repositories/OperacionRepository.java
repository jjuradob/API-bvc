package com.prueba.operacion.repositories;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.prueba.operacion.models.OperacionModel;

@Repository
public interface OperacionRepository extends CrudRepository<OperacionModel, Long> {
	public abstract ArrayList<OperacionModel> findByPlataforma(String plataforma);
	
	@Query (value = "select round(rand()*10000) id, '' plataforma, "
			      + "(select max(fecha) from operacion.operacion where plataforma = ?1) fecha, "
			      + "(select nombre from operacion.evento where codigo = operacion.evento) evento, "
			      + "sum(cantidad) cantidad, 0 valor, sum(costo) costo "
			      + "from operacion.operacion where plataforma = ?1 "
			      + "group by evento", nativeQuery = true)
	public ArrayList<OperacionModel> groupByPlataforma(String plataforma);
}
