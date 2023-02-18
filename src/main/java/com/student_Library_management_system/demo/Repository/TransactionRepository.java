package com.student_Library_management_system.demo.Repository;
import com.student_Library_management_system.demo.Models.Book;
import com.student_Library_management_system.demo.Models.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository <Transactions, Integer > {

    @Query(value = "select * from transactions where book_id=:bookId and card_id =:CardId and is_issue_operation=true;" , nativeQuery = true)
    List < Transactions> getTransactionsForBookAndCard ( int bookId , int CardId) ;



//    @Query(value = "select * from book where book_id=:bookId and card_id=:cardId and is_issue_operation=true" , nativeQuery = true)
//    List <Book> getTransactionsForBookAndCard (int bookId , int CardId) ;

}
