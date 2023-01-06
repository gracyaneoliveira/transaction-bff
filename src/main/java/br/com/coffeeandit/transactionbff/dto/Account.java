package br.com.coffeeandit.transactionbff.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@ToString
public class Account implements Serializable {

    @Schema(description = "Código da Agência")
    @NotNull(message = "Informar o código da Agência")
    private Long codeAgency;

    @Schema(description = "Código da Conta")
    @NotNull(message = "Informar o código da Conta")
    private Long codeAccount;

    @Schema(description = "Beneficiário da transação")
    @Valid
    private BeneficiaryDto beneficiary;

    @NotNull(message = "Informar o tipo da transação")
    @Schema(description = "Tipo de transação")
    private TypeTransaction typeTransaction;

    @Schema(description = "Situação da transação")
    private SituationEnum situation;

}
