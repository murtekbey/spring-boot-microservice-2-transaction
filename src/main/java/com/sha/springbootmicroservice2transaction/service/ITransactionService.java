package com.sha.springbootmicroservice2transaction.service;

import com.sha.springbootmicroservice2transaction.model.Transaction;

import java.util.List;

/**
 * @author sa
 * @date 17.04.2021
 * @time 12:23
 */
public interface ITransactionService
{
    Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);

    List<Transaction> findAllTransactionsOfUser(Long userId);
}
