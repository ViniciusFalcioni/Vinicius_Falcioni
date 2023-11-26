package org.walker.tech.pix.infra.panache.mapper;

import org.walker.tech.pix.domain.entities.MerchantBo;
import org.walker.tech.pix.domain.entities.PixBo;
import org.walker.tech.pix.infra.panache.PanacheMerchant;
import org.walker.tech.pix.infra.panache.PanachePix;

/**
 * PanachePixMapper
 */
public class PanachePixMapper {
    public static PanachePix toEntity(PixBo pixBo) {
        PanachePix panachePix = new PanachePix();
        panachePix.setKey(pixBo.getKey());
        panachePix.setQrcode(pixBo.getQrCode());
        panachePix.setAmount(pixBo.getAmount());
        panachePix.setDescription(pixBo.getDescription());

        MerchantBo merchantBo = pixBo.getMerchant();
        PanacheMerchant panacheMerchant = new PanacheMerchant(
            merchantBo.getName(),
            merchantBo.getPostalCode(),
            merchantBo.getCity()
        );
        panachePix.setMerchant(panacheMerchant);

        return panachePix;
    }

    public static PixBo toDomain(PanachePix panachePix) {
        PixBo pixBo = new PixBo();
        pixBo.setId(String.valueOf(panachePix.getKey()));
        pixBo.setKey(panachePix.getKey());
        pixBo.setQrCode(panachePix.getQrcode());
        pixBo.setAmount(panachePix.getAmount());
        pixBo.setDescription(panachePix.getDescription());

        PanacheMerchant panacheMerchant = panachePix.getMerchant();
        MerchantBo merchantBo = new MerchantBo();
        merchantBo.setPostalCode(panacheMerchant.getPostalCode());
        merchantBo.setName(panacheMerchant.getName());
        merchantBo.setCity(panacheMerchant.getCity());

        pixBo.setMerchant(merchantBo);

        return pixBo;
    }
}
