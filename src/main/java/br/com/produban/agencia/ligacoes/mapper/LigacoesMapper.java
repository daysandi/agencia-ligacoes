package br.com.produban.agencia.ligacoes.mapper;

import java.util.List;
import java.util.stream.Collectors;

import br.com.produban.agencia.ligacoes.dto.LigacoesDto;
import br.com.produban.agencia.ligacoes.entity.Ligacoes;

public class LigacoesMapper {

    public static Ligacoes from(LigacoesDto dto){
    	Ligacoes entity = new Ligacoes();        
        entity.setCentral(dto.getCentral());
        entity.setDataLigacao(dto.getDataLigacao());
        entity.setDiaSemana(dto.getDiaSemana());
        entity.setDuracao(dto.getDuracao());
        entity.setHoraLigacao(dto.getHoraLigacao());
        entity.setMes(dto.getMes());
        entity.setNome(dto.getNome());
        entity.setNumeroEntrada(dto.getNumeroEntrada());
        entity.setPin(dto.getPin());
        entity.setPorte(dto.getPorte());
        entity.setQuantidade(dto.getQuantidade());
        entity.setRamal(dto.getRamal());
        entity.setRede(dto.getRede());
        entity.setRegional(dto.getRegional());
        entity.setSemanaMes(dto.getSemanaMes());
        entity.setTipo(dto.getTipo());
        entity.setTipoRamal(dto.getTipoRamal());
        entity.setTotalPf(dto.getTotalPf());
        entity.setTotalPj(dto.getTotalPj());
        entity.setUniorg(dto.getUniorg());
        
        return entity;
    }

    private static Long from(String string){
        try {
            return Long.parseLong(string);
        }catch (Exception ex){
            return null;
        }
    }


    public static LigacoesDto from(Ligacoes entity){
        if(entity==null){
            return null;
        }
        LigacoesDto dto = new LigacoesDto();
        
        dto.setCentral(entity.getCentral());
        dto.setDataLigacao(entity.getDataLigacao());
        dto.setDiaSemana(entity.getDiaSemana());
        dto.setDuracao(entity.getDuracao());
        dto.setHoraLigacao(entity.getHoraLigacao());
        dto.setMes(entity.getMes());
        dto.setNome(entity.getNome());
        dto.setNumeroEntrada(entity.getNumeroEntrada());
        dto.setPin(entity.getPin());
        dto.setPorte(entity.getPorte());
        dto.setQuantidade(entity.getQuantidade());
        dto.setRamal(entity.getRamal());
        dto.setRede(entity.getRede());
        dto.setRegional(entity.getRegional());
        dto.setSemanaMes(entity.getSemanaMes());
        dto.setTipo(entity.getTipo());
        dto.setTipoRamal(entity.getTipoRamal());
        dto.setTotalPf(entity.getTotalPj());
        dto.setTotalPj(entity.getTotalPj());
        dto.setUniorg(entity.getUniorg());
      
        return dto;
    }

    public static List<LigacoesDto> from(List<Ligacoes> entities){
        return entities.stream().map(LigacoesMapper::from).collect(Collectors.toList());
    }

}
