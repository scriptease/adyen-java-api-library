/*
 *                       ######
 *                       ######
 * ############    ####( ######  #####. ######  ############   ############
 * #############  #####( ######  #####. ######  #############  #############
 *        ######  #####( ######  #####. ######  #####  ######  #####  ######
 * ###### ######  #####( ######  #####. ######  #####  #####   #####  ######
 * ###### ######  #####( ######  #####. ######  #####          #####  ######
 * #############  #############  #############  #############  #####  ######
 *  ############   ############  #############   ############  #####  ######
 *                                      ######
 *                               #############
 *                               ############
 *
 * Adyen Java API Library
 *
 * Copyright (c) 2017 Adyen B.V.
 * This file is open source and available under the MIT license.
 * See the LICENSE file for more info.
 */

package com.adyen.model.marketpay.notification;

import java.util.ArrayList;
import java.util.List;
import com.adyen.model.Amount;
import com.adyen.model.marketpay.BankAccountDetail;
import com.adyen.model.marketpay.OperationStatus;

public class AccountHolderPayoutContent {
    private String accountHolderCode;
    private String accountCode;
    private BankAccountDetail bankAccountDetail;
    private String description;
    private List<AmountContainer> amounts = new ArrayList<>();
    private OperationStatus status;
    private String merchantReference;

    public String getAccountHolderCode() {
        return accountHolderCode;
    }

    public void setAccountHolderCode(String accountHolderCode) {
        this.accountHolderCode = accountHolderCode;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public BankAccountDetail getBankAccountDetail() {
        return bankAccountDetail;
    }

    public void setBankAccountDetail(BankAccountDetail bankAccountDetail) {
        this.bankAccountDetail = bankAccountDetail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OperationStatus getStatus() {
        return status;
    }

    public void setStatus(OperationStatus status) {
        this.status = status;
    }

    public String getMerchantReference() {
        return merchantReference;
    }

    public void setMerchantReference(String merchantReference) {
        this.merchantReference = merchantReference;
    }

    public List<AmountContainer> getAmounts() {
        return amounts;
    }

    public void setAmounts(List<AmountContainer> amounts) {
        this.amounts = amounts;
    }

    public List<Amount> getAmountList() {
        List<Amount> amountList = new ArrayList<>();
        for (AmountContainer amount : amounts) {
            amountList.add(amount.getAmount());
        }
        return amountList;
    }
}
