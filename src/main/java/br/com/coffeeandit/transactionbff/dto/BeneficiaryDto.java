package br.com.coffeeandit.transactionbff.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@ToString
public class BeneficiaryDto implements Serializable {

    private static final long serialVersionUID = 2806421543985360625L;

    @Schema(description = "CPF do Beneficiário")
    @NotNull(message = "Informar o CPF.")
    private Long CPF;

    @NotNull(message = "Informar o código do banco de destino.")
    @Schema(description = "Código do banco destino")
    private Long codeBank;

    @NotNull(message = "Informar a agência de destino.")
    @Schema(description = "Agência de destino")
    private String agency;

    @NotNull(message = "Informar a conta de destino.")
    @Schema(description = "Conta de destino")
    private String account;

    @NotNull(message = "Informar o nome do Favorecido.")
    @Schema(description = "Nome do Favorecido")
    private String nameFavorecido;

}
