package com.fag.brendho.infra.protocols;

import com.fag.brendho.domain.usecases.IMakePixRequest;

public interface IQrCodeSource {
  IQrCodeSourceResponse generate(IMakePixRequest dto);
}
