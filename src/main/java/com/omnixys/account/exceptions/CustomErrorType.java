package com.omnixys.account.exceptions;

import graphql.ErrorClassification;

public enum CustomErrorType implements ErrorClassification {
    PRECONDITION_FAILED,
    CONFLICT
}
