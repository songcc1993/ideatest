package com.aiwen.wfgwechat.entity.public_api_pojo.wexinInterface;

import java.io.Serializable;

/**
 * 图文上传参数
 */
public class ImageContParam implements Serializable {
    private String thumb_media_id;
    private String author;
    private String title;
    private String content_source_url;
    private String content;
    private String digest;
    private String show_cover_pic;
    private String need_open_comment;
    private String only_fans_can_comment;

    public String getThumb_media_id() {
        return thumb_media_id;
    }

    public void setThumb_media_id(String thumb_media_id) {
        this.thumb_media_id = thumb_media_id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent_source_url() {
        return content_source_url;
    }

    public void setContent_source_url(String content_source_url) {
        this.content_source_url = content_source_url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getShow_cover_pic() {
        return show_cover_pic;
    }

    public void setShow_cover_pic(String show_cover_pic) {
        this.show_cover_pic = show_cover_pic;
    }

    public String getNeed_open_comment() {
        return need_open_comment;
    }

    public void setNeed_open_comment(String need_open_comment) {
        this.need_open_comment = need_open_comment;
    }

    public String getOnly_fans_can_comment() {
        return only_fans_can_comment;
    }

    public void setOnly_fans_can_comment(String only_fans_can_comment) {
        this.only_fans_can_comment = only_fans_can_comment;
    }
}