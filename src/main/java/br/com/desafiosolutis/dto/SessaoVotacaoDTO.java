package br.com.desafiosolutis.dto;

import br.com.desafiosolutis.model.SessaoVotacao;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@ApiModel(value = "SessaoVotacaoDTO")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SessaoVotacaoDTO {

    @ApiModelProperty(value = "Id da sessão de votação aberta")
    private Integer id;

    @ApiModelProperty(value = "Data Hora de inicio da sessão de votação aberta")
    private LocalDateTime dataHoraInicio;

    @ApiModelProperty(value = "Data Hora fim da sessão de votação aberta")
    private LocalDateTime dataHoraFim;

    @ApiModelProperty(value = "Status da sessão de votação aberta")
    private Boolean ativa;

    public static SessaoVotacao toEntity(SessaoVotacaoDTO dto){
        return SessaoVotacao.builder()
                .id(dto.getId())
                .dataHoraInicio(dto.getDataHoraInicio())
                .dataHoraFim(dto.getDataHoraFim())
                .ativa(dto.getAtiva())
                .build();
    }

    public static SessaoVotacaoDTO toDTO(SessaoVotacao sessaoVotacao){
        return SessaoVotacaoDTO.builder()
                .id(sessaoVotacao.getId())
                .dataHoraInicio(sessaoVotacao.getDataHoraInicio())
                .dataHoraFim(sessaoVotacao.getDataHoraFim())
                .ativa(sessaoVotacao.getAtiva())
                .build();
    }

}
