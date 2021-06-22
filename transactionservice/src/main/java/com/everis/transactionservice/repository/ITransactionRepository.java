package com.everis.transactionservice.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.everis.transactionservice.entity.Transaction;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface ITransactionRepository extends ReactiveMongoRepository<Transaction, String> {
	
	
}
