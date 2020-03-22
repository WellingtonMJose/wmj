package br.com.logisticawmj.wmj;

import br.com.logisticawmj.wmj.domain.Categoria;
import br.com.logisticawmj.wmj.repositorios.CategoriaRepositorio;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WmjApplication implements CommandLineRunner{

    @Autowired   
    private CategoriaRepositorio categoriaRepositorio;   
    
	public static void main(String[] args) {
		SpringApplication.run(WmjApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria(null, "TI");
        Categoria cat2 = new Categoria(null, "Escritorio");
        
        categoriaRepositorio.saveAll(Arrays.asList(cat1,cat2));
    }

}
