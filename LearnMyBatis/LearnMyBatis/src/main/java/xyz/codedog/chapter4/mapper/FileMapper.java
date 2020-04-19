package xyz.codedog.chapter4.mapper;

import xyz.codedog.chapter4.pojo.TestFile;

/**
 * @InterfaceName FileMapper
 * @Description TODO
 * @Author panda
 * @Date 2020/3/18 下午9:54
 * @Version 1.0
 **/
public interface FileMapper {
    public TestFile getFile(Long id);

    public int insertFile(TestFile testFile);
}
