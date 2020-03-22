package br.com.logisticawmj.wmj;

import br.com.logisticawmj.wmj.domain.Categoria;
import br.com.logisticawmj.wmj.domain.Produto;
import br.com.logisticawmj.wmj.repositorios.CategoriaRepositorio;
import br.com.logisticawmj.wmj.repositorios.ProdutoRepositorio;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WmjApplication implements CommandLineRunner{

    @Autowired   
    private CategoriaRepositorio categoriaRepositorio;   
    
    @Autowired
    private ProdutoRepositorio produtoRepositorio;
    
	public static void main(String[] args) {
		SpringApplication.run(WmjApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria(null, "TI");
        Categoria cat2 = new Categoria(null, "Escritorio");
        
        Produto p1 = new Produto(null, "Computador", 2000.0);
        Produto p2 = new Produto(null, "Mesa", 800.0);
        Produto p3 = new Produto(null, "Impressora", 450.0);
        Produto p4 = new Produto(null, "Cadeiras", 250.0);
        Produto p5 = new Produto(null, "Mouse", 80.0);
        
        cat1.getListProdutos().addAll(Arrays.asList(p1,p2,p3,p4,p5));
        cat2.getListProdutos().addAll(Arrays.asList(p2,p4));
        
        p1.getListCategorias().addAll(Arrays.asList(cat1));
        p2.getListCategorias().addAll(Arrays.asList(cat1,cat2));
        p3.getListCategorias().addAll(Arrays.asList(cat1));
        p4.getListCategorias().addAll(Arrays.asList(cat1,cat2));
        p5.getListCategorias().addAll(Arrays.asList(cat1));
        
        categoriaRepositorio.saveAll(Arrays.asList(cat1,cat2)); 
        produtoRepositorio.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
    }

}
