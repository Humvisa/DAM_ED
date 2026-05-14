package tema5.ej10;

import java.util.Objects;

public class Log {

    int idLog;
    String ipOrigen;
    String ubicacion;

    public Log(int idLog, String ipOrigen, String ubicacion) {
        this.idLog = idLog;
        this.ipOrigen = ipOrigen;
        this.ubicacion = ubicacion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Log log = (Log) o;
        return idLog == log.idLog;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idLog);
    }

    // TODO el equals y el hashcode solo funcionaran con el id

}
