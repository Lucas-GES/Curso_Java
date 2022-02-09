package src.model.exceptions;

import src.model.entities.Account;

public class WithdrawException extends Exception{

    public WithdrawException(String msg){
        super(msg);
    }

}
