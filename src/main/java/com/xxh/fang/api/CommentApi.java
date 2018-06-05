package com.xxh.fang.api;

import java.util.List;

import com.xxh.fang.Util.ResVo;
import com.xxh.fang.entity.CommentVo;
import com.xxh.fang.entity.GivealikeVo;

public interface CommentApi {

	public List<CommentVo> sentimentHigh();

	public List<CommentVo> newest();

	public List<CommentVo> earliest();

	public ResVo addComment(CommentVo commentVo);

	public ResVo updatePointOfpraise(CommentVo commentVo);

	public Integer addGivealike(GivealikeVo givealikeVo);
}
