package com.github.faening.controllers;

import com.github.faening.domain.dto.PixQrCodeDTO;
import com.github.faening.services.PixQrCodeService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.ExampleObject;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/v1")
@Tag(name = "PixQrCodeController", description = "Dados do QR Code do PIX")
public class PixQrCodeController {
    @Inject
    PixQrCodeService pixQrCodeService;

    @POST
    @Path("/pix")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
        summary = "getPixStaticQrCode",
        description = "Recuperar dados do QR Code do PIX"
    )
    @RequestBody(
        content = {
            @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = PixQrCodeDTO.class),
                examples = @ExampleObject(
                    name = "(Padrão) Dados de entrada",
                    value = "{ " +
                            "\"merchantCategoryCode\": \"5651\"," +
                            "\"postalCode\": \"01201005\"," +
                            "\"city\": \"Barueri\"," +
                            "\"name\": \"Celcoin\"," +
                            "\"key\": \"testepix@celcoin.com.br\"," +
                            "\"amount\": 10.55," +
                            "\"transactionIdentification\": \"testqrcodestaticcelcoin\" " +
                            " }"
                )
            )
        }
    )
    @APIResponse(
        responseCode = "200",
        description = "OK",
        content = {
            @Content(
                mediaType = "application/json",
                schema = @Schema(implementation = PixQrCodeDTO.class),
                examples = @ExampleObject(
                    name = "(Padrão) QR Code PIX gerado",
                    value = "{ " +
                        "\"amount\": 10.55," +
                        "\"city\": \"Barueri\"," +
                        "\"emvqrcps\": \"00020126450014br.gov.bcb.pix...\"," +
                        "\"key\": \"testepix@celcoin.com.br\"," +
                        "\"merchantCategoryCode\": \"5651\"," +
                        "\"name\": \"Celcoin\"," +
                        "\"postalCode\": \"01201005\"," +
                        "\"transactionId\": \"821481065\"," +
                        "\"transactionIdentification\": \"testqrcodestaticcelcoin\" " +
                        " }"
                )
            )
        }
    )
    public Response getPixStaticQrCode(PixQrCodeDTO pixQrCodeDTO) {
        try {
            PixQrCodeDTO responseDTO = pixQrCodeService.generatePixStaticQrCode(pixQrCodeDTO);
            return Response.ok(responseDTO).build();
        } catch (Exception e) {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity("Erro ao gerar o pix da Celcoin: " + e.getMessage())
                .build();
        }
    }
}
