package com.github.fppt.jedismock.commands;

import com.github.fppt.jedismock.RedisBase;
import com.github.fppt.jedismock.Response;
import com.github.fppt.jedismock.Slice;

import java.util.List;

class RO_setnx extends AbstractRedisOperation {
    RO_setnx(RedisBase base, List<Slice> params) {
        super(base, params, 2, null, null);
    }

    Slice response(){
        if (base().rawGet(params().get(0)) == null) {
            base().rawPut(params().get(0), params().get(1), -1L);
            return Response.integer(1);
        }
        return Response.integer(0);
    }
}
