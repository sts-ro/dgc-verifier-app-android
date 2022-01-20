package ro.sts.dgc.cwt

class VerificationDecision(var result: Result) {
    var reason: Reason? = null

    enum class Result {
        GOOD,
        FAIL
    }

    enum class Reason {
        COSE_VERIFICATION_FAILED,
        COSE_VERIFICATION_FAILED_NO_DSC,
        BASE45_DECODE_FAILED,
        CWT_DECODE_FAILED,
        CBOR_DECODE_FAILED,
        CONTEXT_IDENTIFIER_FAILED,

        ISSUED_AT_BEFORE_DSC_VALID_FROM,
        ISSUED_AT_AFTER_NOW,
        EXPIRATION_AT_AFTER_DSC_VALID_UNTIL,
        EXPIRATION_AT_BEFORE_NOW,

        CERTIFICATE_ENTRY_TYPE_INVALID,

        CERTIFICATE_VACCINATION_ENTRY_DATE_IN_FUTURE,

        CERTIFICATE_TEST_ENTRY_RESULT_POSITIVE,
        CERTIFICATE_TEST_ENTRY_TEST_DATE_IN_FUTURE,

        CERTIFICATE_RECOVERY_ENTRY_NOT_VALID_SO_FAR,
        CERTIFICATE_RECOVERY_ENTRY_NOT_VALID_ANYMORE,

        RULES_VALIDATION_FAILED
    }
}