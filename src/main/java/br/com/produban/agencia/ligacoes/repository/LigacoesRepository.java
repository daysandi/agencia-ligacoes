package br.com.produban.agencia.ligacoes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.produban.agencia.ligacoes.entity.Ligacoes;


public interface LigacoesRepository extends MongoRepository<Ligacoes, String> {
}


