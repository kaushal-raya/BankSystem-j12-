package model;

import javax.xml.crypto.Data;
import java.time.DateTimeException;

public class Transaction {
private String TransactionID;
private String FromAccountNo;
private  String ToAccountNO;
private  String TypeCode;
private String Credit;
private String Debit;
private DateTimeException date;
private String Status;

    public Transaction(String transactionID, String fromAccountNo, String toAccountNO, String typeCode, String credit, String debit, DateTimeException date, String status) {
        TransactionID = transactionID;
        FromAccountNo = fromAccountNo;
        ToAccountNO = toAccountNO;
        TypeCode = typeCode;
        Credit = credit;
        Debit = debit;
        this.date = date;
        Status = status;
    }

    public String getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(String transactionID) {
        TransactionID = transactionID;
    }

    public String getFromAccountNo() {
        return FromAccountNo;
    }

    public void setFromAccountNo(String fromAccountNo) {
        FromAccountNo = fromAccountNo;
    }

    public String getToAccountNO() {
        return ToAccountNO;
    }

    public void setToAccountNO(String toAccountNO) {
        ToAccountNO = toAccountNO;
    }

    public String getTypeCode() {
        return TypeCode;
    }

    public void setTypeCode(String typeCode) {
        TypeCode = typeCode;
    }

    public String getCredit() {
        return Credit;
    }

    public void setCredit(String credit) {
        Credit = credit;
    }

    public String getDebit() {
        return Debit;
    }

    public void setDebit(String debit) {
        Debit = debit;
    }

    public DateTimeException getDate() {
        return date;
    }

    public void setDate(DateTimeException date) {
        this.date = date;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
