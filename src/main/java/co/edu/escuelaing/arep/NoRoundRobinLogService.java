package co.edu.escuelaing.arep;

import java.io.IOException;

import static spark.Spark.*;
public class NoRoundRobinLogService
{
    public static void main( String[] args )
    {
        port(getPort());
        staticFiles.location("/public");
        get("logService", (req,res) -> {
            String msg="";
            return logMessage(msg);
        });
    }

    private static String logMessage(String msg) throws IOException {
        return ""  ;
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port
    }
}
}
