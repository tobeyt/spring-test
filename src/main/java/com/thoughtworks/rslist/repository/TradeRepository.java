package com.thoughtworks.rslist.repository;

import com.thoughtworks.rslist.dto.TradeDto;
import com.thoughtworks.rslist.dto.VoteDto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TradeRepository extends CrudRepository<TradeDto, Integer> {
    @Override
    List<TradeDto> findAll();
    List<TradeDto> findAllByRsEventId(int rsEventId);
}
