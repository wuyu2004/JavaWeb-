package top.soft.classoa.service;

import top.soft.classoa.entity.Notice;
import top.soft.classoa.mapper.NoticeMapper;
import top.soft.classoa.utils.MyBatisUtils;

import java.util.List;

/**
 * @author 1144
 * @description: TODO
 * @date 2024/12/14 14:31
 */
public class NoticeService {
    public List<Notice> getNoticeList(Long receiverId) {
        return (List) MyBatisUtils.executeQuery(sqlSession -> {
            NoticeMapper mapper = sqlSession.getMapper(NoticeMapper.class);
            return mapper.selectByReceiverId(receiverId);
        });
    }
}
