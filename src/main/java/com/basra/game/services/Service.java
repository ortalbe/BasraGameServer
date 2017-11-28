package com.basra.game.services;

import com.basra.game.Utils.ErrorCode;

/**
 * Created by Ortal on 11/23/2017.
 */
public interface Service {

    public void inputMapping();

    public void outPutMapping();

    public ErrorCode execute();
}
