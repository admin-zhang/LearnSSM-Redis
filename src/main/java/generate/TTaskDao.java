package generate;

import xyz.codedog.chapter5.pojo.TTask;

public interface TTaskDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TTask record);

    int insertSelective(TTask record);

    TTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TTask record);

    int updateByPrimaryKey(TTask record);
}