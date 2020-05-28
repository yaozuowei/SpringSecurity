package com.sans.common.entity;

import lombok.Data;

import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: YaoZuoWei
 * @Date: 2020/04/28/09:43
 * @Description:
 */
@Data
public class ImageCode implements Serializable {

    private BufferedImage image;
    private String code;
    private LocalDateTime expireTime;

    /**
     *
     * @param image
     * @param code
     * @param expireIn 过期时间
     */
    public ImageCode(BufferedImage image, String code, int expireIn) {
        this.code = code;
        this.image = image;
        this.expireTime = LocalDateTime.now().plusSeconds(expireIn);
    }

    public ImageCode(String code, LocalDateTime expireTime) {
        this.code = code;
        this.expireTime = expireTime;
    }

    public boolean isExpried() {
        return LocalDateTime.now().isAfter(getExpireTime());
    }
}
