package com.github.fppt.jedismock.commands;

import com.github.fppt.jedismock.RedisBase;
import com.github.fppt.jedismock.Slice;

import java.util.List;

import static com.github.fppt.jedismock.Utils.convertToLong;

class RO_incrby extends RO_incrOrDecrBy {
    RO_incrby(RedisBase base, List<Slice> params) {
        super(base, params, 2);
    }

    RO_incrby(RedisBase base, List<Slice> params, Integer expectedParams) {
        super(base, params, expectedParams);
    }

    long incrementOrDecrementValue(List<Slice> params){
        return convertToLong(String.valueOf(params.get(1)));
    }
}
