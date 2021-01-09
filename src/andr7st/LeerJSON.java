package andr7st;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class LeerJSON {
    
    String rutaJSON = "../extra/Archivo.json";

    public String textoCampo1;
    public String textoCampo2;
    public String textoCampo3;
    public String textoCampo4;

    public String getTextoCampo1() { return textoCampo1; }
    public String getTextoCampo2() { return textoCampo2; }
    public String getTextoCampo3() { return textoCampo3; }
    public String getTextoCampo4() { return textoCampo4; }
    
    public LeerJSON() {

        JSONParser parser = new JSONParser();
        
        try {    
            //  BufferedReader BR = new BufferedReader(new FileReader(new File(ruta)));

            // Obtener el archivo de donde sacar la linea
            Object obj = parser.parse(new FileReader(rutaJSON));
            JSONObject archivoLeido = (JSONObject) obj;
            JSONObject propiedades = (JSONObject) archivoLeido.get("propiedades");

            // Guardar el contenido del json en variables String.
            this.textoCampo1 = propiedades.get("nombre").toString();
            this.textoCampo2 = propiedades.get("nickname").toString();
            this.textoCampo3 = propiedades.get("anio_inicio").toString();
            this.textoCampo4 = archivoLeido.get("archivo").toString();
            //// Una forma de guardarlo en variable Int
            //int mmiAnio = Integer.parseInt(anio);

            // Para imprimir por consola
           /*  String imprimir = "";

            imprimir += Archivo;
            imprimir += "\n" + nombre;
            imprimir += "\n" + apodo;
            imprimir += "\n" + anio;

            System.out.println(imprimir); */

        } 
        //catch (Exception e) {}
        catch(FileNotFoundException e){}
        catch(IOException e){}
        catch(ParseException e){} 
    }
}