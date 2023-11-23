package org.fag.trab.infra.panache.mapper;


import org.fag.trab.domain.entities.MerchantBo;
import org.fag.trab.domain.entities.PixBo;
import org.fag.trab.infra.panache.PanacheMerchant;
import org.fag.trab.infra.panache.PanachePix;

public class PanachePixMapper {
    public static PanachePix toEntity(PixBo pixQrCodeBO) {
        PanachePix panachePix = new PanachePix();


        panachePix.setKey(pixQrCodeBO.getKey());
        panachePix.setQrcode(pixQrCodeBO.getQrcode());
        panachePix.setAmount(pixQrCodeBO.getAmount());
        panachePix.setDescription(pixQrCodeBO.getDescription());

        MerchantBo merchantBo = pixQrCodeBO.getMerchant();

        PanacheMerchant panacheMerchant = new PanacheMerchant();
        panacheMerchant.setName(merchantBo.getName());
        panacheMerchant.setCity(merchantBo.getCity());
        panacheMerchant.setPostalCode(merchantBo.getPostalCode());

        panachePix.setMerchant(panacheMerchant);

        return panachePix;
    }

    public static PixBo toDomain(PanachePix panachePix) {
        PixBo pixDto = new PixBo();

        pixDto.setId(String.valueOf(panachePix.getId()));
        pixDto.setKey(panachePix.getKey());
        pixDto.setQrcode(panachePix.getQrcode());
        pixDto.setAmount(panachePix.getAmount());
        pixDto.setDescription(panachePix.getDescription());

        PanacheMerchant panacheMerchant = panachePix.getMerchant();
        MerchantBo merchantBo = new MerchantBo();

        merchantBo.setPostalCode(panacheMerchant.getPostalCode());
        merchantBo.setName(panacheMerchant.getName());
        merchantBo.setCity(panacheMerchant.getCity());

        pixDto.setMerchant(merchantBo);

        return pixDto;
    }
}
