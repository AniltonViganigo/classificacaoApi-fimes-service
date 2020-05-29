package br.com.meunetflix.classificacaofilmesservice;

import com.sun.org.apache.xpath.internal.objects.XString;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class ClassificacaoFilmesServiceApplication {

	@GetMapping("classificacoes/{classificacao}/idades/{idade}")
	public String consultarClassificacao(@PathVariable("classificacao") String classificacao,
										 @PathVariable("idade") Integer idade) {
		return "OK";
	}

}
