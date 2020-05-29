package br.com.meunetflix.classificacaofilmesservice;

import org.springframework.boot.SpringApplication;

public class classificacaoApi {

    private static final String mensagemOk = "Ok! Você está apto para ver esse filme!";
    private static final String mensagemNok = "Desculpe! Este título não está disponível para a sua idade!";

    private String classificao;
    private Integer idade;

    public classificacaoApi(){

    }

    public classificacaoApi(String classificao, Integer idade) {
        this.classificao = classificao;
        this.idade = idade;
    }

    public String getClassificao() {
        return classificao;
    }

    public void setClassificao(String classificao) {
        this.classificao = classificao;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString (){
        Boolean apto = classificao.equals("L") ||
                classificao.equals("PA") && idade >=12 ||
                classificao.equals("AD") && idade >=14 ||
                classificao.equals("MI") && idade >=18;

        if (apto == true){
          return  mensagemOk;
        } else {
            return mensagemNok;

        }
    }
}



