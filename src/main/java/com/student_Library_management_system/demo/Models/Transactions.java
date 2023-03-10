package com.student_Library_management_system.demo.Models;

import com.student_Library_management_system.demo.Enums.TransactionStatus;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="transactions")
public class Transactions {
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int id ;

    @Enumerated ( value = EnumType.STRING)
    private TransactionStatus transactionStatus ;

    private int fine ;
    private String transactionId = UUID.randomUUID().toString() ;

    @CreationTimestamp
    private Date transactionDate ;

    private boolean isIssueOperation ;
    @ManyToOne
    @JoinColumn
    private Book book ;
    @ManyToOne
    @JoinColumn
    private Card card ;
    public Transactions() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Transactions(int id, TransactionStatus transactionStatus, int fine, String transactionId, Date transactionDate, boolean isIssueOperation, Book book, Card card) {
        this.id = id;
        this.transactionStatus = transactionStatus;
        this.fine = fine;
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.isIssueOperation = isIssueOperation;
        this.book = book;
        this.card = card;
    }

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(TransactionStatus transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }
    public String getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public boolean isIssueOperation() {
        return isIssueOperation;
    }
    public void setIssueOperation(boolean issueOperation) {
        isIssueOperation = issueOperation;
    }

    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }

    public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
    }
}
