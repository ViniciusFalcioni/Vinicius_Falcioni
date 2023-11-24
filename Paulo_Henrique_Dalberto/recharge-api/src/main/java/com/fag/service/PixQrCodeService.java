// package com.fag.service;

// import com.fag.domain.dto.PixQrCodeDTO;
// import com.fag.domain.repositories.IPixQrCodeDataBaseRepository;
// import com.fag.domain.usecases.QrCodePixCreate;
// import com.fag.infra.celcoin.repository.PixQrCodeCelcoin;

// import jakarta.enterprise.context.ApplicationScoped;
// import jakarta.inject.Inject;
// import jakarta.transaction.Transactional;
// import jakarta.ws.rs.core.Response;

// @ApplicationScoped
// public class PixQrCodeService {

//   @Inject
//   PixQrCodeCelcoin celcoin;

//   @Inject
//   IPixQrCodeDataBaseRepository panacheRepository;

//   @Transactional
//   public Response handlePix(PixQrCodeDTO dto) {
//     QrCodePixCreate createPix = new QrCodePixCreate(celcoin, panacheRepository);

//     PixQrCodeDTO pixCreate = createPix.execute(dto);

//     return Response.ok(pixCreate).build();
//   }
// }