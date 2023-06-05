package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(

        @NotBlank //nem nulo nem vazio
        String nome,
        @NotBlank
        String email,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String crm,
        @NotNull //Somente valida se vem vazio o proprio Spring valida no ENUM
        Especialidade especialidade,
        @NotNull
        @Valid //BEANVALIDATION valida-rá também esse DadosEnd que tb é um DTO
        DadosEndereco endereco
    ) {
}
