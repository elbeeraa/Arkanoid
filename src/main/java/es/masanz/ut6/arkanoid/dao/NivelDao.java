package es.masanz.ut6.arkanoid.dao;

import es.masanz.ut6.arkanoid.database.ConnectionManager;
import es.masanz.ut6.arkanoid.model.Nivel;

public class NivelDao {

    public static Nivel obtenerNivel(int id){
        // TODO 01: Buscar y devolver el nivel en caso de existir
        Nivel nivel = new Nivel();

        String sql = "SELECT filas, columnas, ladrillos, siguiente_nivel\n" +
                "        FROM arkanoid.nivel\n" +
                "        WHERE id = ?;";

        Object[] params = {id};

        Object[][] resultado = ConnectionManager.ejecutarSelectSQL(sql, params);

        if (resultado != null && resultado.length > 0) {
            int filas = (int) resultado[0][0];
            int columnas = (int) resultado[0][1];
            String ladrillos = (String) resultado[0][2];
            int siguiente_nivel = (int) resultado[0][3];

            nivel.setId(id);
            nivel.setFilas(filas);
            nivel.setColumnas(columnas);
            nivel.generarLadrillosDesdeTexto(ladrillos);

        }
        return null;
    }


}
