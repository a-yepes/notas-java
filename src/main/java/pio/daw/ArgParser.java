//coge los argumentos que pase el usuario y si pasa mas cosas o menos de las debidas, lanza un error.
//si pasa lo adecuado, carga y le pido la ruta del archivo a leer

package pio.daw;

import java.nio.file.Path;

public class ArgParser {
    private Path csvPath;

    public static ArgParser formArgs(String[] args) throws Exception{
        if(args.length!=1){
            throw new Exception("Argumentos invalidos");
        }
        Path p = Path.of(args[0]);
        if(p.getFileName().toString().endsWith(".csv")&& p.toFile().exists()){
            return new ArgParser(p);
        }
        else {
            throw new Exception("El archivo no es valido");
        }
        
    }

    public ArgParser(Path csvPath){
        this.csvPath = csvPath;
    }

    public Path getPath(){
        return this.csvPath;
    }
    
}
